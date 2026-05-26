import java.util.Scanner;
//this program demonstrates function overloading by defining two sum methods: one for integers and another for floats.
public class FunctionOverloading {

  public static int sum(int a, int b) {
    return a + b;
  }

  public static float sum(float a, float b) {
    return a + b;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Integer Input
    System.out.println("ENTER TWO INTEGER NUMBERS:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int intSum = sum(a, b);

    System.out.println("Integer Sum = " + intSum);

    // Float Input
    System.out.println("ENTER TWO FLOAT NUMBERS:");
    float x = sc.nextFloat();
    float y = sc.nextFloat();

    float floatSum = sum(x, y);

    System.out.println("Float Sum = " + floatSum);

    sc.close();
  }
}