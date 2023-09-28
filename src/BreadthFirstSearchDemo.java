
public class BreadthFirstSearchDemo {
    /*
     * Breadth First Search - A search algorithm for traversing a tree or graph data structure
     *                      - Starts at the root node and explores the neighbor nodes first, before moving to the next level neighbors.
     *                      - This is done one "level" at a time, rather than one "branch" at a time as in DFS.
     *                      - Uses a queue data structure to remember to get the next vertex to start a search,
     *                        when a dead end occurs in any iteration.
     *                      - Time Complexity: O(V + E)
     *                      - Space Complexity: O(V)
     *
     * Difference B/W BFS and DFS:
     * BFS: - Traverse a graph level by level
     *      - Utilizes a Queue
     *      - Better if destination is on average close to start
     *      - Siblings are visited before children
     *
     * DFS: - Traverse a graph branch by branch
     *      - Utilizes a Stack
     *      - Better if destination is on average far from start
     *      - Children are visited before siblings
     *      - More popular for games/puzzles
     *
     * 1. Create a queue and push the root node to it.
     * 2. Pop a node from the queue and push its right child, followed by its left child to the queue.
     * 3. Repeat step 2 until the queue is empty.
     *
     * Action Plan for BFS:
     *  1. Pick a route
     * 2. Keep going until you reach a dead end, or a previously visited node.
     * 3. Backtrack to the last node that has unvisited adjacent nodes or neighbors.
     *
     *
     * Advantages:
     * - It is optimal. It guarantees the shortest path.
     * - It is faster than Depth First Search.
     * - It may find the goal node faster than Depth First Search.
     *
     * Disadvantages:
     * - It uses more memory than Depth First Search.
     * - It is not easy to implement using recursion.
     * - It is not easy to detect cycles during the graph traversal.
     *
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
        System.out.println("\n\tBreadth First Search Traversal of the graph");
        System.out.println("Source Node: A");
        graph.breadthFirstSearch(0); // A -> B -> C -> D -> E
        System.out.println();
        System.out.println("Source Node: B");
        graph.breadthFirstSearch(1); // B -> C -> D -> E -> A

    }

}
