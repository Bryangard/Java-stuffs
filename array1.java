import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[50]; // Array to store 50 numbers
        double sum = 0;

        // Prompt the user to enter 50 numbers
        System.out.println("Enter 50 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i]; // Add each number to the sum
        }

        // Calculate the average
        double average = sum / numbers.length;

        // Display the average
        System.out.println("The average of the 50 numbers is: " + average);

    }

}