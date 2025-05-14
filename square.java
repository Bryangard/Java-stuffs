import java.util.Scanner;

public class square {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number that you want to square: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.println("Number of " + i + " and the square is " + square);
        }
        scanner.close();
    }

}
