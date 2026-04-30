import java.util.Scanner;

/**
 * LogicalOperators
 * Reads three integers and evaluates logical operations.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        System.out.println("Logical AND: " + ((a > b) && (b > c)));
        System.out.println("Logical OR: " + ((a > b) || (b > c)));
        System.out.println("Logical NOT of (a > b): " + !(a > b));

        scanner.close();
    }
}
