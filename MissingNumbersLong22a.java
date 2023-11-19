import java.util.ArrayList;
import java.util.List;

class MissingNumbersFinder extends Thread {
    private List<Integer> numbers;

    // Constructor to initialize the list of numbers
    public MissingNumbersFinder(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        findMissingNumbers();
    }

    private void findMissingNumbers() {
        List<Integer> missingNumbers = new ArrayList<>();

        // Assuming the range is from 1 to the maximum number in the list
        int maxNumber = numbers.stream().max(Integer::compare).orElse(0);

        for (int i = 1; i <= maxNumber; i++) {
            if (!numbers.contains(i)) {
                missingNumbers.add(i);
            }
        }

        // Display the missing numbers
        System.out.println("Missing Numbers: " + missingNumbers);
    }
}

class MissingNumbersLong22a {
    public static void main(String[] args) {
        // Create a list of numbers (including some missing numbers)
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 4, 6, 7, 9, 10));

        // Create an instance of the MissingNumbersFinder thread
        MissingNumbersFinder missingNumbersFinder = new MissingNumbersFinder(numbers);

        // Start the thread
        missingNumbersFinder.start();

        // Wait for the thread to complete before exiting the program
        //try {
          //  missingNumbersFinder.join();
        //} catch (InterruptedException e) {
          //  e.printStackTrace();
    //    }
    }
}
