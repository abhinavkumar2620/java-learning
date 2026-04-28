import java.util.Scanner;

public class relational_operators {
  // relation operators are binge used in the code to compare two values 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("is equal to:" + (a == b));
    System.out.println("is not equal to:" + (a != b));
    System.out.println("is greater than:" + (a > b));
    System.out.println("is less than:" + (a < b));
    System.out.println("is greater than or equal to:" + (a >= b));
    System.out.println("is less than or equal to:" + (a <= b));
  }

}
