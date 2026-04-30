import java.util.Scanner;

/**
 * ProductExample
 * Multiplies two numbers provided by the user.
 */
public class ProductExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int product = a * b;
        System.out.println("Product = " + product);

        scanner.close();
    }
}
