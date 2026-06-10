import java.util.Scanner;
// This program checks if a given number is a Spy Number or not. A Spy Number is a number where the sum of its digits is equal to the product of its digits
public class SpyNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int temp = number;
    int sum = 0;
    int product = 1;

    while (temp > 0) {

      int digit = temp % 10;

      sum += digit;
      product *= digit;

      temp /= 10;
    }

    if (sum == product) {
      System.out.println(number + " is a Spy Number");
    } else {
      System.out.println(number + " is not a Spy Number");
    }

    sc.close();
  }
}