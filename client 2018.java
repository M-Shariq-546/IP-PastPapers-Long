import java.io.*;
import java.net.*;

public class StringReverseClient {
    public static void main(String[] args) {
        try {
            // Connect to the server
            Socket socket = new Socket("localhost", 12345);

            // Create input and output streams for serialization
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            // Read a string from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a string to reverse: ");
            String inputString = reader.readLine();

            // Send the string to the server
            outputStream.writeObject(inputString);

            // Receive the reversed string from the server
            String reversedString = (String) inputStream.readObject();
            System.out.println("Reversed string received from server: " + reversedString);

            // Close the streams and the socket
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
