package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args)
            throws java.io.IOException {

        Scanner s = new Scanner(System.in);

        System.out.println("Please input two integers.");
        int val1 = s.nextInt();
        int val2 = s.nextInt();

        int sum = 0;
        for (int i = val1; i <= val2; i++) {
            sum += i;
        }
        double avg = 1.0 * sum / (val2 - val1 + 1);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
