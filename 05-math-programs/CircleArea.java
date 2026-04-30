import java.util.Scanner;

/**
 * CircleArea
 * Calculates the area of a circle using radius input from the user.
 */
public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double pi = 3.14;
        double area = radius * radius * pi;

        System.out.println("Area = " + area);
        scanner.close();
    }
}
