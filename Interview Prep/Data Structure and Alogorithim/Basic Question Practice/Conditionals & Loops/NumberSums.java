import java.util.Scanner;

public class NumberSums {

    public static void main(String[] args) {
        // Initialize sums
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers one by one. Enter 0 to terminate the input.");

        while (true) {
            // Read a number from the user
            int number = scanner.nextInt();

            // Terminate input when 0 is entered
            if (number == 0) {
                break;
            }

            // Check and sum accordingly
            if (number < 0) {
                sumNegative += number;
            } else if (number > 0) {
                if (number % 2 == 0) {
                    sumPositiveEven += number;
                } else {
                    sumPositiveOdd += number;
                }
            }
        }

        // Close the scanner
        scanner.close();

        // Print the results
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}
