import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

// sum of two number 
public class inputsum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a + b; // sum code
    System.out.println(sum);
  }

}