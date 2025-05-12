import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        double num1;
        double num2;
        double result;
        String operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();
        System.out.println("Enter your operator (+, -, *, /): ");
        operator = scanner.next();

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }

        scanner.close();
    }
}
// This is a simple calculator program that performs basic arithmetic operations