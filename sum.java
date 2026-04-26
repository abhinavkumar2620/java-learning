import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
// sum of two number by taking user input
public class sum {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    
     int a = sc.nextInt ();
    int b = sc.nextInt ();
    int sum = a + b; // sum code
    System.out.println(sum);
  }

}