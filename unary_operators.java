import java.util.Scanner;

public class unary_operators {
  // unary operators are used to preform the operationon a single operand
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b  = ++a; // pre increment
    System.out.println("pre increment a: " + a); 
    System.out.println("pre increment b: " + b); 
    int c = a++; // post incerment
    System.out.println("post increment a:" + a);
    System.out.println("post increment c:" + c);
    int d = -- a; // pre decrement 
    System.out.println("pre decrement a:" + a);
    System.out.println("pre decrement d:" + d);
    int e = a--; // post decrement
    System.out.println("post decrement a:" + a);
    System.out.println("post decremente:" + e);

  }
}
