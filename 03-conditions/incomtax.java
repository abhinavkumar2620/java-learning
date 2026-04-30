import java.util.Scanner;
// INCOME TAX CALCULATOR 
public class incomtax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your income:");
    int income = sc.nextInt();
    int tax;
    if (income <= 500000){
      System.out.println("you are not required to pay tax on your income");
      tax = 0;
    }
    else if (income > 500000 && income <= 1000000){
      System.out.println("you are required to pay 20% tax on your income");
      tax = (int) (income * 0.2);
    }
    else if (income > 1000000 && income <= 1000000000000L){
      System.out.println("you are required to pay 30% tax on your income");
      tax = (int) (income * 0.3);
    }
    else {
      System.out.println("invalid income");
      tax = 0;
    }
    System.out.println("the tax you have to pay is: " + tax);
  } 
}
