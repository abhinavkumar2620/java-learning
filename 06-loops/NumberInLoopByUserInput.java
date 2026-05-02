import java.util.Scanner;
// this program is going to take user input and print number from 1 to n
public class NumberInLoopByUserInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number for loop:");
    int n = sc.nextInt();
    int i = 1;
    while (n>=i) {
      System.out.println(i);
      i++;
    }
    System.out.println("loop is done!");
  }
}
