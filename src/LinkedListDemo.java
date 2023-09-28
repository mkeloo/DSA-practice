import java.util.*;

public class LinkedListDemo {

    public void run() {

        /*
         * LinkedList =  Nodes are in 2 parts (data + address)
         *              Each node has a reference to the next node
         *              Each node has a reference to the previous node
         *              Nodes are in non-consecutive memory locations
         *              Elements are not stored in contiguous memory locations
         *              Elements are linked using pointers
         *
         * Singly Linked List = Each node has a reference to the next node
         * [data, address] -> [data, address] -> [data, address] -> [data, address] -> null
         *
         * Doubly Linked List = Each node has a reference to the next node and the previous node
         * null <- [data, address] <-> [data, address] <-> [data, address] <-> [data, address] -> null
         *
         * Advantages?
         * 1. Dynamic Data Structure (allocates needed memory while running)
         * 2. Insertion and Deletion is easy O(1)
         * 3. No need to specify size
         *
         * Disadvantages?
         * 1. Extra memory for pointers
         * 2. Not cache friendly (elements are not stored in contiguous memory locations)
         * 3. No random access of elements (no index [i])
         * 4. Accessing/searching elements is more time consuming. O(n)
         *
         * */

        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();

        // LinkedList as a Stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        System.out.println("LinkedList as a Stack: " + linkedList);

        LinkedList<String> linkedList2 = new LinkedList<String>();

        // LinkedList as a Queue
        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("F");
//        linkedList2.poll();

        linkedList2.add(5, "G");
        linkedList2.addFirst("H");
        linkedList2.addLast("I");
        linkedList2.remove(4);
        System.out.println("LinkedList as a Queue: " + linkedList2);
        System.out.println("Index of F: " + linkedList2.indexOf("F"));

        // Peek First
        System.out.println("Peek First: " + linkedList2.peekFirst());

        // Peek Last
        System.out.println("Peek Last: " + linkedList2.peekLast());

        // Poll First
        System.out.println("Poll First: " + linkedList2.pollFirst());

        // Poll Last
        String lastElement = linkedList2.pollLast();
        System.out.println("Poll Last: " + lastElement);

        linkedList2.add(3, "E");

        System.out.println("LinkedList as a Queue: " + linkedList2);



    }
}
