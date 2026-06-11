import java.util.Scanner;
// This program calculates the factorial of a given number using a for loop. The factorial of a number n is the product of all positive integers less than or equal to n.
public class FactorialUsingForLoop {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int factorial = 1;

    for (int i = 1; i <= n; i++) {
      factorial *= i;
    }

    System.out.println("Factorial = " + factorial);

    sc.close();
  }
}