import java.util.Scanner;
// this code checkes whether the number entered by the user is a multiple of 10 or not by using do while loop
public class ChackMultipleOf10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number;
    do {
      System.out.print("enter a number");
      number = sc.nextInt();
      System.out.println("you entered: " + number);
      if (number % 10 == 0){
          System.out.println("the number is a mutiple of 10");
          break;
      }
    } while (number % 10 != 0);
    
    
    }
  }
  
  
  

