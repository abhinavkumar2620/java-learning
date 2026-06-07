import java.util.Scanner;
// This program checks if a given number is a Duck Number or not.
public class DuckNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int temp = number;
    boolean isDuck = false;

    while (temp > 0) {

      int digit = temp % 10;

      if (digit == 0) {
        isDuck = true;
        break;
      }

      temp /= 10;
    }

    if (isDuck) {
      System.out.println(number + " is a Duck Number");
    } else {
      System.out.println(number + " is not a Duck Number");
    }

    sc.close();
  }
}