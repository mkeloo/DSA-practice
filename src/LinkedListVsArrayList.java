import java.util.LinkedList;
import java.util.ArrayList;


public class LinkedListVsArrayList {

    /*
    * Compare LinkedList and ArrayList Time:
    * - LinkedList is faster at adding and removing elements
    * - ArrayList is faster at accessing elements
    *
    * - LinkedList is implemented as a double linked list. Its performance on add and remove is better than Arraylist,
    * but worse on get and set methods.
    *
    * - ArrayList is implemented as a resizable array. As more elements are added to ArrayList, its size is increased
    * dynamically. It's elements can be accessed directly by using the get and set methods, since ArrayList is essentially
    *
    * */



    // Main Method
    public void run() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Measure time
        long startTime;
        long endTime;
        long duration;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ********** Linked List **********
        startTime = System.nanoTime();

//        linkedList.get(0);
//        linkedList.get(500000); // Middle of the list takes longer
//        linkedList.get(999999);

//        linkedList.remove(0);
//        linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();
        duration = (endTime - startTime);

        System.out.println("LinkedList: " + duration + " nanoseconds.");


        // ********** Array List **********

        startTime = System.nanoTime();

//        arrayList.get(0);
//        arrayList.get(500000);
//        arrayList.get(999999);

//        arrayList.remove(0);
//        arrayList.remove(500000);
        arrayList.remove(999999);


        endTime = System.nanoTime();
        duration = (endTime - startTime);

        System.out.println("ArrayList: " + duration + " nanoseconds.");
    }

}
