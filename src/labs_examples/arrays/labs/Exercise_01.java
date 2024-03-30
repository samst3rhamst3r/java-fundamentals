package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("Please input 10 numbers.");

        int SIZE = 10;
        int[] a = new int[SIZE];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            a[i] = s.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < SIZE; i++) {
            sum += a[i];
        }

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + 1.0 * sum / SIZE);
    }
}