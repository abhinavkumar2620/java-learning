public class BinToDec {
// This program converts a binary number to its decimal equivalent using a method called binaryToDecimal.
  public static int binaryToDecimal(int binary) {

    int pow = 0;
    int decimal = 0;

    while (binary > 0) {

      int lastDigit = binary % 10;
      decimal += lastDigit * (int) Math.pow(2, pow);

      pow++;
      binary /= 10;
    }

    return decimal;
  }

  public static void main(String[] args) {

    int result = binaryToDecimal(1010);

    System.out.println("Decimal = " + result);
  }
}