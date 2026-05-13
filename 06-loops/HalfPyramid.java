public class HalfPyramid {
 // This program prints a right-angled triangle of stars using nested loops
  public static void main(String[] args) {
   for (int line = 1; line <= 4; line++) {
     for (int number = 1; number <= line; number++) {
       System.out.print(number);
     }
     System.out.println();
   }
 }
}