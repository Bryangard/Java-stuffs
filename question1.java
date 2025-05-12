
/**Write a Java program that asks the user to enter a single integer, then prints whether the number is positive, negative, or zero. */

import java.util.Scanner;

class question1 {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter your second number: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.print("The first number is greater than the second number");
        } else if (num2 == num1) {
            System.out.print("The numbers are the same...");
        } else {
            System.out.print("The second number is greater than the first number");
        }

        scanner.close();

    }
}