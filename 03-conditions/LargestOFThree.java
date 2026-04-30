import java.util.Scanner;
// Largest of three numbers
public class LargestOFThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three numbers:");
    int firstnumber = sc.nextInt();
    int secondnumber = sc.nextInt();
    int thirdnumber = sc.nextInt();
    if (firstnumber > secondnumber && firstnumber > thirdnumber){
      System.out.println("the largest number is firstnumber :" + firstnumber);
    }
    else if (secondnumber > firstnumber && secondnumber > thirdnumber){
      System.out.println("the largest number is secondnumber :" + secondnumber);
    
    }
    else {
      System.out.println("the largest number is thirdnumber :" + thirdnumber);
    }
  }
}
