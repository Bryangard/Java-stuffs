import java.util.Scanner;

public class cube {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your amount of numbers: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Number is: " + i + " and cube is: " + cube);
        }

        scanner.close();
    }
}
