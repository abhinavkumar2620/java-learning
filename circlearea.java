import java.util.Scanner;
// this is a program to find the area of a circle 
public class circlearea {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double b = sc.nextInt();
    double a = 3.14;
    double area = b*b*a;
    System.out.println("Area = " + area);
  }
}
