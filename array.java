import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int total = 0;
        double average = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("PLease input 10 numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }

        average = (double) total / numbers.length;

        System.out.println("The average of the numbers is: " + average);

        scanner.close();
    }
}