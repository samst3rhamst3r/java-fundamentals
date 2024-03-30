package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[] a = {3, 5, 35, 25, 64, 398, 9, 10, 85, 23, 3, 1, -5};
        for (int i = a.length - 1; i >= 0; i -= 2) {
            System.out.println(a[i]);
        }
    }
}
