import java.util.Scanner;

/**
 * InputSum
 * Simple program to read two integers and print their sum.
 */
public class InputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
