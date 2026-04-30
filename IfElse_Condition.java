import java.util.Scanner;
// by taking user input we can check the condition using if else statement
public class IfElse_Condition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the age");
    int age = sc.nextInt();
    if (age >= 18){
      System.out.println("adult");
    } else {
      System.out.println("not an adult");
    }
    sc.close();
  }
}
