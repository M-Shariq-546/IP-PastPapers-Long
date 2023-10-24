import java.io.*;
import java.net.*;

public class StringReverseServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is running and waiting for a connection...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress());

                // Create input and output streams for serialization
                ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream());
                ObjectOutputStream outputStream = new ObjectOutputStream(clientSocket.getOutputStream());

                // Read the string from the client
                String inputString = (String) inputStream.readObject();

                // Reverse the string
                String reversedString = new StringBuilder(inputString).reverse().toString();

                // Send the reversed string back to the client
                outputStream.writeObject(reversedString);

                // Close the streams and the client socket
                inputStream.close();
                outputStream.close();
                clientSocket.close();
                System.out.println("Reversed string sent back to client: " + reversedString);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
