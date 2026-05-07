public class AsciiValue {
  // this code prints the ASCII values of uppercase letters from A to Z using a for loop
  public static void main(String[] args) {

    for (char ch = 'A'; ch <= 'Z'; ch++) {
      System.out.println(ch + " = " + (int) ch);
    }

  }
}