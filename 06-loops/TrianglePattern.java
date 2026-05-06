public class TrianglePattern {
  // this code prints a triangle pattern of asterisks using nested for loops
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}