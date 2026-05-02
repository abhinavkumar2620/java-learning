import java.util.Scanner;
// this program calculates the sum of n natural numbers using while loop
public class SumOfNNaturalNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number:");
    int n = sc.nextInt();

    int i = 1;
    int sum = 0;

    while (i <= n) {
      sum += i;
      i++; 
    }

    System.out.print(sum);
    sc.close();
  }
}