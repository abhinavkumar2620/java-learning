import java.util.Scanner;

/**
 * UnaryOperators
 * Demonstrates pre-increment, post-increment, pre-decrement, and post-decrement.
 */
public class UnaryOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        int preIncrement = ++a;
        System.out.println("After pre-increment, a = " + a);
        System.out.println("preIncrement = " + preIncrement);

        int postIncrement = a++;
        System.out.println("After post-increment, a = " + a);
        System.out.println("postIncrement = " + postIncrement);

        int preDecrement = --a;
        System.out.println("After pre-decrement, a = " + a);
        System.out.println("preDecrement = " + preDecrement);

        int postDecrement = a--;
        System.out.println("After post-decrement, a = " + a);
        System.out.println("postDecrement = " + postDecrement);

        scanner.close();
    }
}
