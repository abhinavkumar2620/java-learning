import java.util.Scanner;
// This program checks if a given number is an Armstrong Number or not 
public class ArmstrongNumber {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int original = number;
    int sum = 0;

    while (number != 0) {

      int digit = number % 10;
      sum += digit * digit * digit;
      number = number / 10;
    }

    if (sum == original) {
      System.out.println(original + " is an Armstrong Number");
    } else {
      System.out.println(original + " is not an Armstrong Number");
    }

    sc.close();
  }
}