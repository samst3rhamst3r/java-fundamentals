package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args)
            throws java.io.IOException {

        String vowels = "aeiou";
        Scanner s = new Scanner(System.in);

        System.out.println("Please input a word.");
        String word = s.nextLine();

        for (char vowel : vowels.toCharArray()) {
            int index = word.indexOf(vowel);
            if (index != -1) {
                System.out.println(word + ": " + vowel);
                break;
            }
        }
    }
}
