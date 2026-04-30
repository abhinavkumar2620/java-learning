import java.util.Scanner;

/**
 * IfElseExample
 * Checks if the entered age is adult or not.
 */
public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("not an adult");
        }

        scanner.close();
    }
}
