import java.util.Scanner;
// This program swaps two numbers using a temporary variable.
public class swapnumber{

  public static void swap(int a, int b) {
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println("first number is  :"+a);
    System.out.println("second number is :"+b);
  }
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENTER THE FIRST NUMER: ");
  int a = sc.nextInt();
  System.out.println("ENTER THE SECOND NUMBER:");
  int b = sc.nextInt();
  swap(a,b);
  
}
}