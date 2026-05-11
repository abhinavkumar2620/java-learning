import java.util.Scanner;
// This program calculates the sum of digits of a given number
public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        while (number != 0) {

            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}