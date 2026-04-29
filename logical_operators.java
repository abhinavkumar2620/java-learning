import java.util.Scanner;

public class logical_operators {
  // By taking user input, logical operators are used to comparet the valuse
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the value of a,b and c");
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
  // logical And operator
  System.out.println("logical And operator:" + ((a>b) && (b>c)));
  // logical Or operator
  System.out.println("logical Or operator:" + ((a>b) || (b>c)));
  // logical Not operator
  System.out.println("logical Not operator:" + !(a>b)); 
 }




}