
import java.util.Scanner;
// This program finds the index of a given key in an array. If the key is found, it returns the index; otherwise, it returns -1.
class Main {

    public static int find(int num[], int key) {

        for (int i = 0; i < num.length; i++) {

            if (num[i] == key) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 9;

        int index = find(num, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index " + index);
        }

    }
}