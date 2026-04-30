import java.util.Scanner;
/// LargestOFTwo
// Simple program to read two integers and print the largest of the two.
public class LargestOFTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number :");
    int firstNumber = sc.nextInt();
    System.out.print("Enter The Second Number :");
    int secondNumber = sc.nextInt();

    if (firstNumber > secondNumber) {
      System.out.println("The largest number is: " + firstNumber);
    } else {
      System.out.println("The largest number is: " + secondNumber);
    }
  }
}
