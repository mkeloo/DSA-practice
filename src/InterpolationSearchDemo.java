

public class InterpolationSearchDemo {

    /*
     * Binary Search - Improvement over binary search which is used for uniformly distributed sorted arrays or data.
     * - Binary search always goes to the middle element to check. On the other hand,
     *   interpolation search may go to different locations according to the value of the key being searched.
     * - For example, if the value of the key is closer to the last element, interpolation search is likely
     *   to start search toward the end side.
     * - "Guesses" where a value might be based on calculated probe results.
     * - If probe is incorrect, search area is narrowed, and a new probe is calculated.
     * - If probe is correct, return index of item.
     *
     * Runtime Complexity for average case: O(log log n) - O(n)
     * Runtime Complexity for Worst case: O(n) [values increase exponentially
     *
     * Advantages:
     * - Faster than binary search for large data sets
     * - Requires fewer comparisons than binary search
     * - Works on uniformly distributed data
     * - Works on sorted data
     *
     * Disadvantages:
     * - Requires sorted data
     * - Does not work on non-uniformly distributed data
     * - Does not work on unsorted data
     * - Does not work on data with large differences between maximum and minimum values
     *
     * */

    private int interpolationSearch(int[] array, int value) {

        int low = 0;
        int high = array.length - 1;

        // Calculate the steps:
        int steps = 0;

        // While the value is within the array
        while(value >= array[low] && value <= array[high] && low <= high) {

            // Calculate the probe
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("Steps No.: " + steps + " probe: " + probe + ", low: " + low + ", high: " + high);
            // System.out.println("probe: " + probe);

            // If the probe is the value, return the index
            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
                steps++;
            } else {
                high = probe - 1;
                steps++;
            }

        }

        return -1;
    }

    public void run() {

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(array, 256);

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Element Not found!");
        }



    }


}
