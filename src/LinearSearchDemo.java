public class LinearSearchDemo {

    /*
    * Linear Search - Iterate through a collection one element at a time
    * Runtime Complexity - O(n)
    *
    * Disadvantages:
    * 1. Not efficient for large collections
    *
    * Advantages:
    * 1. Fast for searches of small to medium data sets
    * 2. Does not require sorted data
    * 3. Useful for data structures that do not have random access like linked lists.
    * */

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }



    public void run() {
        int[] array = {9, 4, 8, 2, 7, 3, 6, 1, 5};
        int element = 9;

        int index = linearSearch(array, element);

        System.out.println("Linear Search through Array for element: " + element );
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Not found in array!");
        }


    }



}
