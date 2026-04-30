import java.util.Scanner;
// CHECKING EVEN OR ODD BY TAKING INPUT FROM USER
public class EvenOdd {
  public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
    System.out.println("enter a number:");
    int number = SC.nextInt();
    if (number % 2 == 0)
    {
      System.out.println("Even number");
    }
    else
    {
      System.out.println("Odd number");
    }
  }
}
