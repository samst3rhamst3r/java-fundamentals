package labs_examples.arrays.labs;
import java.util.Arrays;
import java.util.Scanner;
/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int val = 0;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Please input a number from 1-10.");
            val = s.nextInt();
        } while (val < 1 || val > 10);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == val) {
                System.out.println(i);
                break;
            }
        }

        // write code here


    }
}