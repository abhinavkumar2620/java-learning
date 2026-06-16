
import java.util.Scanner;
// This program finds the largest number in an array.
class Main {
  public static int getlargest(int number[]) {
    int largest = Integer.MIN_VALUE;
    for (int i = 0; i < number.length; i++) {
      if (largest < number[i]) {
        largest = number[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {
    int number[] = { 1, 3, 5, 7, 8 };
    System.out.println("largest nummber is " + getlargest(number));
  }
}

