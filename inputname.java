import java.util.Scanner;

public class inputname {
    public static void main(String[] args) {

        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        name = scanner.nextLine();
        System.out.println("Welcome, " + name + ".");

        scanner.close();

    }

}