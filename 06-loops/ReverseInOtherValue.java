public class ReverseInOtherValue {
// this program prints the reverse of a number using while loop and stores it in another variable
  public static void main(String[] args) {
    int number = 1234;
    int reverse = 0;
    while (number>0){
      int lastnumber = number % 10;
      reverse = reverse * 10 + lastnumber;
      number = number / 10;
    }
    System.out.println("The reverse of the number is: " + reverse);
  }
}