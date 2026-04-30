/**
 * TypeCastingExample
 * Demonstrates explicit type casting in Java.
 */
public class TypeCastingExample {
    public static void main(String[] args) {
        double value = 1.2548;
        int castValue = (int) value;

        System.out.println("Original double value: " + value);
        System.out.println("After casting to int: " + castValue);

        int number = 5;
        double doubleNumber = (double) number;
        System.out.println("Original integer value: " + number);
        System.out.println("After casting to double: " + doubleNumber);
    }
}
