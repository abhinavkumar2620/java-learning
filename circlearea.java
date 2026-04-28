import java.util.Scanner;
// this is a program to find the area of a circle 
// the area of circle is pi r^2 and i have used pi as 3.14 and 
public class circlearea {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextInt();
    double pi = 3.14;
    double area = r*r*pi;
    System.out.println("Area = " + area);
  }
}
