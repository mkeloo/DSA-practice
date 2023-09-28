
public class DepthFirstSearchDemo {
    /*
    * Depth First Search - A search algorithm for traversing a tree or graph data structure
    *                    - Starts at the root node and explores as far as possible along each branch before backtracking.
    *                    - Uses a stack data structure to remember to get the next vertex to start a search,
    *                      when a dead end occurs in any iteration.
    *                    - Time Complexity: O(V + E)
    *                    - Space Complexity: O(V)
    *
    * 1. Create a stack and push the root node to it.
    * 2. Pop a node from the stack and push its right child, followed by its left child to the stack.
    * 3. Repeat step 2 until the stack is empty.
    *
    * Action Plan for DFS (Recursive):
    *   1. Pick a route
    *   2. Keep going until you reach a dead end, or a previously visited node.
    *   3. Backtrack to the last node that has unvisited adjacent nodes or neighbors.
    *
    * Advantages:
    * - Uses less memory than Breadth First Search.
    * - It is easy to implement using recursion.
    * - It is easy to detect cycles during the graph traversal.
    *
    * Disadvantages:
    * - It is not optimal. It does not guarantee the shortest path.
    * - It is slower than Breadth First Search.
    * - It may go to extreme depths of a graph before it finds the goal node.
    *
    *
    * */


    public void run(){
        Graph graph = new Graph(5);

        /*
        * Graph Visual Representation
        *
        *           A  ------------> B
        *           ^                |
        *           |                |
        *           |                ⌄
        *           E  <-----------> C ----------> D
        *
        * */

        // Add nodes to the graph
        graph.addNode(new NodeGph('A')); // index 0
        graph.addNode(new NodeGph('B')); // index 1
        graph.addNode(new NodeGph('C')); // index 2
        graph.addNode(new NodeGph('D')); // index 3
        graph.addNode(new NodeGph('E')); // index 4

        // Add edges to the graph: Directed Graph
        graph.addEdge(0, 1); // A -> B
        graph.addEdge(1, 2); // B -> C
        graph.addEdge(1, 4); // B -> E
        graph.addEdge(2, 3); // C -> D
        graph.addEdge(2, 4); // C -> E
        graph.addEdge(4, 0); // E -> A
        graph.addEdge(4, 2); // E -> C

        // Print the graph
        graph.printGraph();

        // Depth First Search Traversal of the graph
        System.out.println("\n\tDepth First Search Traversal of the graph");
        System.out.println("Source Node: A");
        graph.depthFirstSearch(0);

    }


}
