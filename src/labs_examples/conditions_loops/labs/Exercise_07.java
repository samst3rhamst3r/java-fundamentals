package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
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
