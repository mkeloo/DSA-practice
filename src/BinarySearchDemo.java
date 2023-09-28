import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchDemo {

    /*
     * Binary Search - Search for a value in a sorted array by repeatedly dividing the search interval in half.
     * Runtime Complexity: O(log(n))
     *
     * Advantages:
     * - Faster than linear search
     * - Useful for large data sets
     * - Useful for data sets that are sorted
     * - Useful for data sets that are not frequently modified
     *
     * Disadvantages:
     * - Requires a sorted data set
     * - Requires a lot of memory
     * - Slower insertions and deletions
     * - Slower than linear search for small data sets
     *
     * */

    private static int binarySearch(int[] array, int target) {

        // Set the left and right bounds of the array
        int left = 0;
        int right = array.length - 1;

        // Calculate no. of steps:
        int steps = 1;

        // While the left bound is less than or equal to the right bound
        while(left <= right) {
            int middle = left + (right - left) / 2; // Find the middle index of the array
            int value = array[middle]; // Get the value at the middle index


            // Print the middle index and value
            System.out.println("Steps: " + steps + " middle: " + middle + ", value: " + value);

            if (value < target) {
                left = middle + 1; // If the value is less than the target, set the left bound to the middle index + 1
                steps++;
            } else if (value > target) {
                right = middle - 1; // If the value is greater than the target, set the right bound to the middle index - 1
                steps++;
            } else {
                System.out.println("Target " + target + " found at index " + middle + ".");
                return middle; // If the value is equal to the target, return the middle index
            }
        }


        return -1;
    }



    public void run() {

        int array[] = new int[1000000];
        int target = 777777;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // Binary Search using Arrays.binarySearch() method
        /*
        int index = Arrays.binarySearch(array, target);
        if (index == -1) {
            System.out.println("Target " + target + " not found in array.");
        } else {
            System.out.println("Target " + target + " found at index " + index + ".");
        }
        */

        // Binary Search using iterative method
        int index = binarySearch(array, target);

    }



}
