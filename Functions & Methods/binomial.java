import java.util.Scanner;
//this binomial program calculates the binomial coefficient of two given numbers using a method called fraction.
public class binomial {

  public static int fraction(int a) {
    int f = 1;
    for (int i = a; i >= 1; i--) {
      f = f * i;
    }
    return f; // Placeholder return, replace with actual fraction calculation
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER N:");
    int n = sc.nextInt();
    fraction(n);
    System.out.println("ENTER THE NUMBER R:");
    int r = sc.nextInt();
    fraction(r);
    int result = fraction(n)/(fraction(r)*fraction(n-r));
    System.out.println("the binomial coefficient of " +n+ " and " +r+  " is: " +result);
  }
} 