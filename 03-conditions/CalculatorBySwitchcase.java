import java.util.Scanner;
// calculator using switch case 
public class CalculatorBySwitchcase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number A:");
    int firstnumber = sc.nextInt();
    System.out.print("Enter second number B:");
    int secondnumber = sc.nextInt();
    System.out.println("Enter the operator: + for addition , - for subtraction , * for multiplication , / for division");
    char operator = sc.next().charAt(0);
    switch (operator) {
      case '+':
        System.out.println("the sum of A and B is : " + (firstnumber + secondnumber));
        break;
      case '-':
        System.out.println("the difference of A and B is :" + (firstnumber - secondnumber));
        break;
      case '*':
        System.out.println("the product of A and B is :" + (firstnumber * secondnumber));
        break;
      case '/':
        if (secondnumber != 0) {
          System.out.println("the quotient of A and B is : " + (firstnumber / secondnumber));
        } else {
          System.out.println("division by zero is not possible");
        }
        break;
      default:
        System.out.println("invalid operator");

    }
  }
}
