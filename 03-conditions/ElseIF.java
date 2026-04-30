import java.util.Scanner;
// ELSE IF EXAMPLE
public class ElseIF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the age:");
    int age = sc.nextInt();
    if (age < 18){
      System.out.println("You are not eligible to vote.");
    }
    else if (age >= 18 && age <1000){
      System.out.println("You are eligible to vote.");
    }
    else {
      System.out.println("invalid age");
    }

  }
}
