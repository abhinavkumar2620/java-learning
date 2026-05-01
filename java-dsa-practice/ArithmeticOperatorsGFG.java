import java.util.Scanner;
public class ArithmeticOperatorsGFG {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter first number");
    int x = sc.nextInt();
    System.out.print("enter second number");
    int y = sc.nextInt();
    // code here
    int p = x + y;
    int q = x - y;
    int r = x * y;
    int s = x / y;
    int t = x % y;
    // The below code prints the output
    System.out.println(p + " " + q + " " + r + " " + s + " " + t);
  }
}

