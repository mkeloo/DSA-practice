import java.util.*;

public class DynamicArrayDemo {

    /*
    * Dynamic Array - An array that grows as needed
    *
    * Advantages:
    *  - Random Access of O(1)
    *  - Fast appends of O(1)
    *  - Good locality of reference and data cache utilization
    *  - Efficient insertions and deletions at the end
    *
    * Disadvantages:
    * - Waste more memory than fixed-size array
    * - Shifting elements is time-consuming in worst-case O(n)
    * - Costly inserts and deletes in the middle
    * - Expanding/Shrinking the array is time-consuming in worst-case O(n)
    *
    * */

    // Create a dynamic array using just ArrayList
//    ArrayList<Integer> dynamicArray = new ArrayList<Integer>();

    // Create a dynamic array using a custom class
    int size;
    int capacity = 10;
    Object[] array;

    // Constructor Overloading
    public DynamicArrayDemo() {
        this.array = new Object[capacity];
    }

    public DynamicArrayDemo(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // Methods for the Dynamic Array
    public void add(Object data) {
        if (size >= capacity) {
            expand();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            expand();
        }

        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <= (int) (capacity / 3)) {
                    shrink();
                }
                break;
            }
        }


    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void expand() {
        // Create a new array with double the capacity
        int newCapacity = (int)(capacity * 2);

        // Create a new array with the new capacity
        Object[] newArray = new Object[newCapacity];

        // Copy the elements from the old array to the new array
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        // Create a new array with half the capacity
        int newCapacity = (int)(capacity / 2);

        // Create a new array with the new capacity
        Object[] newArray = new Object[newCapacity];

        // Copy the elements from the old array to the new array
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";

        for (int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }



    // Main Method
    public void run() {
        DynamicArrayDemo dynamicArray = new DynamicArrayDemo(5);

        // Add 3 elements to the dynamic array
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");

        dynamicArray.insert(0, "X");
        dynamicArray.delete("B");

        // Print the dynamic array
        System.out.println("Dynamic Array: " + dynamicArray);

        // Check if it is empty
        System.out.println("Is the dynamic array empty? " + dynamicArray.isEmpty());

        // Search for an element
        System.out.println("Index of 'C': " + dynamicArray.search("C"));

        // Check the size and capacity
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);

        // Add 3 more elements to the dynamic array
        System.out.println("Adding 'D', 'E', and 'F' to the dynamic array");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        // Print the dynamic array
        System.out.println("Dynamic Array: " + dynamicArray);

        // Check the size and capacity
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);


        // Delete 3 elements from the dynamic array
        System.out.println("Deleting 'A', 'E', and 'F' from the dynamic array");
        dynamicArray.delete("A");
        dynamicArray.delete("E");
        dynamicArray.delete("F");

        // Print the dynamic array
        System.out.println("Dynamic Array: " + dynamicArray);

        // Check the size and capacity
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);

    }
}
