public class BubbleSortDemo {

    /*
    * Bubble Sort - Sorting Algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
    * Runtime: O(n^2)
    *
    * Advantages:
    * - Simple to implement
    * - Can detect if the list is already sorted
    *
    * Disadvantages:
    * - Very slow
    * - Not practical for real world use
    *
    * */

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - i - 1); j++) {
                if (array[j] > array[j + 1]) { // If the current element is greater than the next element
                    // Swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void run() {
        int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };

        System.out.print("Unsorted Array: ");
        for (int i: array) {
            System.out.print(i + " ");
        }

        bubbleSort(array);


        System.out.print("\nSorted Array: ");
        for (int i: array) {
            System.out.print(i + " ");
        }


    }




}
