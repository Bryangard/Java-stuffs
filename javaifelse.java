import java.util.Scanner;

class javaifelse {
    public static void main(String[] args) {

        int num1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number that is less than 10: ");
        num1 = scanner.nextInt();

        if (num1 < 10) {
            System.out.println("the number is less than 10");
        } else {
            System.out.println("You input a number that is greater than 10");
        }

        scanner.close();

    }
}