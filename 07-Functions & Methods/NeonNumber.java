import java.util.Scanner;
// A Neon Number is a number where the sum of the digits of its square is equal to the number itself.
public class NeonNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int square = number * number;
    int sum = 0;

    while (square > 0) {

      int digit = square % 10;
      sum += digit;
      square /= 10;
    }

    if (sum == number) {
      System.out.println(number + " is a Neon Number");
    } else {
      System.out.println(number + " is not a Neon Number");
    }

    sc.close();
  }
}