public class CharecterPattern {
  // This program prints a right-angled triangle of characters using nested loops
  public static void main(String[] args) {
    char ch = 'A';
    for (int line = 1; line <= 4; line++) {
      for (int number = 1; number <= line; number++) {

        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}
