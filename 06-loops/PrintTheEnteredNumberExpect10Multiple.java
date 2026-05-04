import java.util.Scanner;
// this code prints the number entered by the user and checks whether it is a multiple of 10 or not, if it is a multiple of 10 it will print a message and continue to ask for another number
public class PrintTheEnteredNumberExpect10Multiple {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number;
    do{
      System.out.println("Enter a number:");
      number = sc.nextInt();
    {
        if (number % 10 == 0){
          System.out.println("the number is the multiple of 10");
          continue;
        }
      }
    }while(true);
  }
}
