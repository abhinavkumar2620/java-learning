public class RevarseOfNumber {
  // this program prints the reverse of a number using while loop
  public static void main(String[] args) {
    int number = 1234;
    while (number>0) {
      int lastnumber = number % 10;
      System.out.print(lastnumber);
      number = number / 10;
      
    }
  }
}
