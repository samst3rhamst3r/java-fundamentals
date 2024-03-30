package labs_examples.conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args)
            throws java.io.IOException {

        Scanner s = new Scanner(System.in);

        System.out.println("Please input a number from 1-7, then press ENTER.");
        int val = s.nextInt();

        String str;
        if (val == 1) {
            str = "Sunday";
        } else if (val == 2) {
            str = "Monday";
        } else if (val == 3) {
            str = "Tuesday";
        } else if (val == 4) {
            str = "Wednesday";
        } else if (val == 5) {
            str = "Thursday";
        } else if (val == 6) {
            str = "Friday";
        } else if (val == 7) {
            str = "Saturday";
        } else {
            str = "Other";
        }

        System.out.println(str);
        // write completed here

    }
}
