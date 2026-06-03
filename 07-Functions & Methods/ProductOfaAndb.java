import java.util.Scanner;
// This program calculates the product of two numbers using a FUNCTION AND BY TAKING USER
public class ProductOfaAndb {
  public static int product(int a, int b){
  return a*b;



  }
  
  
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE FIRST NUMBER:");
    int a = sc.nextInt();
    System.out.println("ENTER THE SECOND NUMBER:");
    int b = sc.nextInt();
    int result = product(a, b);
    System.out.println("THE PRODUCT OF " + a + " AND " + b + " IS: " + result);
  }







}
