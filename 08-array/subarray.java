import java.util.*;
// This program finds the subarray of an array.
public class subarray {

  public static int subarray(int number[]) {
    int ts = 0;
    for (int i = 0; i < number.length; i++) {
      int start = i;

      for (int j = i; j < number.length; j++) {
        int end = j;

        for (int k = start; k <= end; k++) {
          System.out.print(number[k] + " ");

        }
        ts++;
        System.out.println();

      }
      System.out.println();

    }
    System.out.println("total number of sub array = " + ts);
    return -1;
  }
  public static void main(String[] args) {
    int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    subarray(number);
    System.out.println("Start small. Ship something.");
  }
}

