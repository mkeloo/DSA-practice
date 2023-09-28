
public class Main {

    // Add space between demos for readability function
    public static void printSpace() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Stack Demo
        System.out.println("Stack Demo:");
        StackDemo stackDemo = new StackDemo();
        stackDemo.run();
        printSpace();

        // Queue Demo
        System.out.println("Queue Demo");
        QueueDemo queueDemo = new QueueDemo();
        queueDemo.run();
        printSpace();

        // Priority Queue Demo
        System.out.println("Priority Queue Demo");
        PriorityQueueDemo priorityQueueDemo = new PriorityQueueDemo();
        priorityQueueDemo.run();
        printSpace();

        // LinkedList Demo
        System.out.println("LinkedList Demo");
        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.run();
        printSpace();

        // Dynamic Array Demo
        System.out.println("Dynamic Array Demo");
        DynamicArrayDemo dynamicArrayDemo = new DynamicArrayDemo();
        dynamicArrayDemo.run();
        printSpace();

        // LinkedList vs ArrayList Demo
        System.out.println("LinkedList vs ArrayList Demo");
        LinkedListVsArrayList linkedListVsArrayList = new LinkedListVsArrayList();
        linkedListVsArrayList.run();
        printSpace();

        // Linear Search Demo
        System.out.println("Linear Search Demo");
        LinearSearchDemo linearSearchDemo = new LinearSearchDemo();
        linearSearchDemo.run();
        printSpace();

        // Binary Search Demo
        System.out.println("Binary Search Demo");
        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        binarySearchDemo.run();
        printSpace();

        // Interpolation Search Demo
        System.out.println("Interpolation Search Demo");
        InterpolationSearchDemo interpolationSearchDemo = new InterpolationSearchDemo();
        interpolationSearchDemo.run();
        printSpace();

        // Bubble Sort Demo
        System.out.println("Bubble Sort Demo");
        BubbleSortDemo bubbleSortDemo = new BubbleSortDemo();
        bubbleSortDemo.run();
        printSpace();

        // Selection Sort Demo
        System.out.println("Selection Sort Demo");
        SelectionSortDemo selectionSortDemo = new SelectionSortDemo();
        selectionSortDemo.run();
        printSpace();

        // Insertion Sort Demo
        System.out.println("Insertion Sort Demo");
        InsertionSortDemo insertionSortDemo = new InsertionSortDemo();
        insertionSortDemo.run();
        printSpace();

        // Recursion Demo
        System.out.println("Recursion Demo");
        RecursionDemo recursionDemo = new RecursionDemo();
        recursionDemo.run();
        printSpace();

        // Hash Tables Demo
        System.out.println("Hash Tables Demo");
        HashTablesDemo hashTablesDemo = new HashTablesDemo();
        hashTablesDemo.run();
        printSpace();

        // Adjacency Matrix Graph Demo
        System.out.println("Adjacency Matrix Graph Demo");
        AdjacencyMatrixGraphDemo adjacencyMatrixGraphDemo = new AdjacencyMatrixGraphDemo();
        adjacencyMatrixGraphDemo.run();
        printSpace();

        // Adjacency List Graph Demo
        System.out.println("Adjacency List Graph Demo");
        AdjacencyListGraphDemo adjacencyListGraphDemo = new AdjacencyListGraphDemo();
        adjacencyListGraphDemo.run();
        printSpace();

        // Depth First Search Demo
        System.out.println("Depth First Search Demo");
        DepthFirstSearchDemo depthFirstSearchDemo = new DepthFirstSearchDemo();
        depthFirstSearchDemo.run();
        printSpace();

        // Breadth First Search Demo
        System.out.println("Breadth First Search Demo");
        BreadthFirstSearchDemo breadthFirstSearchDemo = new BreadthFirstSearchDemo();
        breadthFirstSearchDemo.run();
        printSpace();

        // Binary Search Tree Demo
        System.out.println("Binary Search Tree Demo");
        BinarySearchTreeDemo binarySearchTreeDemo = new BinarySearchTreeDemo();
        binarySearchTreeDemo.run();
        printSpace();









    }
}
