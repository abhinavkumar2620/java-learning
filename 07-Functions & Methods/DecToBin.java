public class DecToBin {
  // This method converts a decimal number to binary and prints the result.
public static void DecimalToBinary(int decimal){
    int power = 0;
    int binnum = 0;
    while(decimal > 0){

      int rem = decimal % 2;
      binnum = binnum + rem * (int)Math.pow(10, power);
      decimal = decimal / 2;
      power++;
    }
    System.out.println("Binary: " + binnum);
  }

public static void main(String[] args) {
    int decimal = 10;
    System.out.println("Decimal: " + decimal);
    DecimalToBinary(decimal);
  }






}