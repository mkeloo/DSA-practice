public class SelectionSortDemo {

    /*
     * Selection Sort - Search for the smallest element in the array and swap it with the first element.
     *                  Then search for the second-smallest element and swap it with the second element.
     *                  Repeat until the array is sorted.
     *
     * Runtime: O(n^2)
     *
     * Advantages:
     * - Simple to implement
     * - In-place algorithm
     * - Small data sets okay
     *
     * Disadvantages:
     * - O(n^2) runtime
     * - Unstable algorithm
     * - Large data sets Bad!
     *
     *
     * */

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    // Found a new minimum
                    minIndex = j;
                }
            }

            // Swap the minimum with the first element
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

//        for (int i = 0; i < array.length - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[min] > array[j]) {
//                    min = j;
//                }
//            }
//            // Swap the minimum with the first element
//            int temp = array[i];
//            array[i] = array[min];
//            array[min] = temp;
//        }

    }

    public void run() {
        int[] array = { 8, 7, 9, 2, 3, 1, 5, 4, 6, 0 };

        System.out.print("Unsorted Array: ");
        for (int i: array) {
            System.out.print(i + " ");
        }

        selectionSort(array);

        System.out.print("\nSorted Array: ");
        for (int i: array) {
            System.out.print(i + " ");
        }


    }




}
