import java.util.Scanner;
// this code calculates the factorial of a number entered by the user using for loop
public class FactorialNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    int factorial = 1;

    for (int i = 1; i <= n; i++) {
      factorial = factorial * i;
    }

    System.out.println("Factorial = " + factorial);

    sc.close();
  }
}