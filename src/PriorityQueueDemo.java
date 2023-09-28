import java.util.*;

public class PriorityQueueDemo {
    /*
     * Priority Queue = A FIFO data structure that serves element with the highest priority first
     * before the lowest priority.
     *
     * Priority Queue is implemented as a heap, which is a complete binary tree.
     *
     *
     *
     * add = enqueue to add to the end of queue, offer()
     * remove = dequeue to remove from the front of the queue, poll()
     *
     * queue.offer() = adds element to the end of the queue
     * queue.poll() = removes element from the beginning of the queue
     * queue.element() = returns the element at the beginning of the queue
     * queue.peek() = returns the element at the beginning of the queue
     * queue.size() = returns the number of elements in the queue
     * queue.isEmpty() = returns true if the queue is empty
     * queue.contains() = returns true if the queue contains the specified element
     *
     * */

//    Queue<Double> queue = new PriorityQueue<>(); // default is ascending order (smallest to largest)
    Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); // descending order (largest to smallest)

   public void run() {

       System.out.println("Priority Queue Demo: Students GPA (Reverse Order)");
       queue.offer(3.0);
       queue.offer(1.0);
       queue.offer(3.5);
       queue.offer(2.4);
       queue.offer(1.6);
       queue.offer(2.8);

       while(!queue.isEmpty()) {
           System.out.println(queue.poll());
       }

       System.out.println("Priority Queue Demo: Alphabets Order");
       Queue<String> queue2 = new PriorityQueue<>();
       queue2.offer("E");
       queue2.offer("A");
       queue2.offer("D");
       queue2.offer("B");
       queue2.offer("F");
       queue2.offer("C");

       while(!queue2.isEmpty()) {
           System.out.println(queue2.poll());
       }

   }






}
