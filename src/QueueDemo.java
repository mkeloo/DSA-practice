import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    /*
     * Queue = FIFO data structure: First In First Out (ex. line at a grocery store - first come first serve)
     * Stores objects into a kind of horizontal line. You can only access the first element.
     * A collection designed for holding elements prior to processing. Linear data structure.
     *
     * Queue extends from Collection interface, so it inherits all of its methods.
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

    Queue<String> queue;

    public void run() {
        queue = new LinkedList<>();

        // Insert elements into the queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Jason");
        queue.offer("Penny");
        queue.offer("Sheldon");

        // Print the queue and its size
        System.out.println("Queue: " + queue);
        System.out.println("Queue's size: " + queue.size());

        // Remove elements from the queue
        System.out.println("Removing " + queue.poll() + " from the queue.");
        System.out.println("Removing " + queue.poll() + " from the queue.");
        System.out.println("Removing " + queue.poll() + " from the queue.");

        // Print the queue and its size
        System.out.println("Queue: " + queue);
        System.out.println("Queue's size: " + queue.size());

        System.out.println("Is Queue Empty? " + queue.isEmpty());

        // Peek at the first element in the queue
        System.out.println("Peeking at the first element in the queue: " + queue.peek());

        // contains() method
        System.out.println("Does the queue contain 'Penny'? " + queue.contains("Penny"));
    }






}
