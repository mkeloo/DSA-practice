import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Graph Class for Adjacency Matrix
public class Graph {

    // Add headers to rows and columns of the graph
    ArrayList<NodeGph> nodeGphs;
    int[][] matrix;

    Graph(int size) {
        nodeGphs = new ArrayList<>();
        matrix = new int[size][size];
    }

//    What is Vertex and Edge in a graph?
//     - Vertex (Node) = A node in a graph like A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, etc.
//     - Edge = A connection between two nodes in a graph like A -> B, B -> C, C -> D, etc.

   public void addNode(NodeGph nodeGph) {
        nodeGphs.add(nodeGph);
   }

   // Edge = A connection between two nodes in a graph like A -> B, B -> C, C -> D, etc.
   // A value of 1 indicates an edge between two vertices.
   // A value of 0 indicates no edge between two vertices.
   // The function addEdge() takes two parameters source and destination, and adds an edge from source to destination.
   public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
   }

    // The function checkEdge() takes two parameters source and destination,
    // and returns true if there is an edge from source to destination.

    public boolean checkEdge(int source, int destination) {
        if (matrix[source][destination] == 1) {
            return true;
        } else {
            return false;
        }
   }

    // The function removeEdge() takes two parameters source and destination,
    // and removes an edge from source to destination.
    public void removeEdge(int source, int destination) {
        matrix[source][destination] = 0;
    }

    // The function printGraph() prints the adjacency matrix representation of the graph.
    public void printGraph() {
        System.out.println("Graph using Adjacency Matrix: ");
        System.out.print("  ");

        // Print column header
        for (NodeGph nodeGph : nodeGphs) {
            System.out.print(nodeGph.data + " ");
        }
        System.out.println();

        // Outer loop to traverse rows
        for (int i = 0; i < matrix.length; i++) {
            // Print the row number
             System.out.print(nodeGphs.get(i).data + " ");
            // Inner loop to traverse columns for each row
            for (int j = 0; j < matrix[i].length; j++) {
                // Print the value at matrix[i][j]
                System.out.print(matrix[i][j] + " ");
            }
            // Print new line
            System.out.println();
        }
    }

    // Depth First Search function
    public void depthFirstSearch(int source) {

        // Create a boolean array of visited nodes to keep track of the visited nodes
        boolean[] visited = new boolean[matrix.length];

        // Call the recursive helper function to print DFS traversal
        depthFirstSearchHelper(source, visited);
    }

    // Recursive helper function to print DFS traversal. Uses call stack for recursion.
    // Call Stack is a stack data structure that stores information about the active subroutines of a computer program.
    private void depthFirstSearchHelper(int source, boolean[] visited) {
        if (visited[source]) {
            return;
        } else {
            visited[source] = true;
            System.out.println(nodeGphs.get(source).data + " = visited");
        }

        for (int i = 0; i < matrix[source].length; i++) {

            // Base case: if the node is not visited, then recursively call the function
            if (matrix[source][i] == 1) {

                // Recursive step: If the current node is unvisited, recursively explore its adjacent nodes or neighbors.
                depthFirstSearchHelper(i, visited);
            }
        }
        return;
    }

    // Breadth First Search function using Iteration method
    public void breadthFirstSearch(int source) {

        // Create a Queue to keep track of the visited nodes
        Queue<Integer> queue = new LinkedList<>();

        // Create a boolean array of visited nodes to keep track of the visited nodes
        boolean[] visited = new boolean[matrix.length];

        // Add the source node to the queue
        queue.offer(source);
        visited[source] = true;

        // While the queue is not empty
        while(queue.size() != 0) {

            // Remove the first node from the queue
            source = queue.poll();
            System.out.println(nodeGphs.get(source).data + " = visited");

            // Traverse the adjacent nodes or neighbors of the current node
            for (int i = 0; i < matrix[source].length; i++) {

                // If the current node is unvisited, add it to the queue
                if (matrix[source][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }

    }

}
