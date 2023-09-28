public class InsertionSortDemo {

    /*
     * Insertion Sort - This algorithm is similar to how we sort playing cards in our hands.
     *                  The sorting works by iterating through the array and inserting the
     *                  current element into its correct position in the sorted portion of the array.
     *                  Basically, after comparing elements to the left of the current element,
     *                  shift the elements to the right to make room to insert the element.
     *
     * Runtime: O(n^2)
     *
     * Advantages:
     * - Simple implementation
     * - Efficient for small data sets
     * - Adaptive algorithm
     *
     * Disadvantages:
     * - O(n^2) runtime
     * - Not efficient for large data sets
     *
     * */

    private static void insertionSort(int[] array) {

//        // Iterate through the array
//        for (int i = 1; i < array.length; i++) {
//            int current = array[i];
//            int j = i - 1;
//
//            // Compare the current element to the elements to the left of it
//            while (j >= 0 && array[j] > current) {
//                // Shift the elements to the right to make room for the current element
//                array[j + 1] = array[j];
//                j--;
//            }
//
//            // Insert the current element into its correct position
//            array[j + 1] = current;
//        }

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }

    }

    public void run() {
        int[] array = { 8, 7, 9, 2, 3, 1, 5, 4, 6, 0 };

        System.out.print("Unsorted Array: ");
        for (int i: array) {
            System.out.print(i + " ");
        }

        insertionSort(array);

        System.out.print("\nSorted Array: ");
        for (int i: array) {
            System.out.print(i + " ");
        }


    }




}
