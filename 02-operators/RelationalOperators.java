import java.util.Scanner;

/**
 * RelationalOperators
 * Reads two integers and compares them using relational operators.
 */
public class RelationalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.println("Equal: " + (first == second));
        System.out.println("Not equal: " + (first != second));
        System.out.println("Greater than: " + (first > second));
        System.out.println("Less than: " + (first < second));
        System.out.println("Greater than or equal to: " + (first >= second));
        System.out.println("Less than or equal to: " + (first <= second));

        scanner.close();
    }
}
