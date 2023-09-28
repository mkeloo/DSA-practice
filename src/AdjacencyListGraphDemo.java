
public class AdjacencyListGraphDemo {

    /*
     * Adjacency List:   - A graph is represented as an array of linked lists.
     *                   - The size of the array is equal to the number of vertices.
     *                   - Let the array be an array[]. An entry array[i] represents
     *                     the linked list of vertices adjacent to the ith vertex.
     * - An array / arraylist of linked lists to represent edges.
     * - Each LinkedList has a unique node at the head.
     * - All adjacent neighbors to that node are added to that node's linked-list.
     * - # of rows = # of unique nodes
     * - # of columns = # of unique nodes
     *
     * What is Vertex and Edge in a graph?
     * - Vertex = A node in a graph like A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, etc.
     * - Edge = A connection between two nodes in a graph like A -> B, B -> C, C -> D, etc.
     *
     * Runtime Complexity to check an Edge: O(V) or O(E) where V is the number of vertices and E is the number of edges.
     * Runtime Complexity to find all edges from a vertex: O(V)
     * Space Complexity: O(V + E) where V is the number of vertices in the graph.
     *
     * Advantages:
     * - Space efficient for representing sparse graphs.
     * - Iterating over all edges takes O(V + E) time.
     * - Adding a vertex is easier.
     * - Adding an edge takes O(1) time.
     *
     * Disadvantages:
     * - Edge weight lookup is O(E)
     * - Slightly more complex graph representation
     * - Requires more space for dense graphs.
     *
     * */

    public void run() {

        GraphAdjList graphAdjList = new GraphAdjList();


        // Add nodes to the graph
        graphAdjList.addNode(new NodeGph('A')); // index 0
        graphAdjList.addNode(new NodeGph('B')); // index 1
        graphAdjList.addNode(new NodeGph('C')); // index 2
        graphAdjList.addNode(new NodeGph('D')); // index 3
        graphAdjList.addNode(new NodeGph('E')); // index 4

        // Add edges to the graph: Directed Graph
        graphAdjList.addEdge(0, 1); // A -> B
        graphAdjList.addEdge(1, 2); // B -> C
        graphAdjList.addEdge(1, 4); // B -> E
        graphAdjList.addEdge(2, 3); // C -> D
        graphAdjList.addEdge(2, 4); // C -> E
        graphAdjList.addEdge(4, 0); // E -> A
        graphAdjList.addEdge(4, 2); // E -> C

        // Print the graph
        graphAdjList.printGraph();

        // Check if there is an edge between two vertices
        System.out.println("\n\tCheck an edge b/w two vertices");
        System.out.println("Is there an edge between A and B? " + graphAdjList.checkEdge(0, 1));
        System.out.println("Is there an edge between A and C? " + graphAdjList.checkEdge(0, 2));
        System.out.println("Is there an edge between A and D? " + graphAdjList.checkEdge(0, 3));
        System.out.println("Is there an edge between A and E? " + graphAdjList.checkEdge(0, 4));
        System.out.println("Is there an edge between B and A? " + graphAdjList.checkEdge(1, 0));
        System.out.println("Is there an edge between B and C? " + graphAdjList.checkEdge(1, 2));
        System.out.println("Is there an edge between B and D? " + graphAdjList.checkEdge(1, 3));
        System.out.println("Is there an edge between B and E? " + graphAdjList.checkEdge(1, 4));



//        // Add edges to the graph: Undirected Graph
//        graph.addEdge(0, 1); // A <-> B
//        graph.addEdge(1, 2); // B <-> C
//        graph.addEdge(1, 4); // B <-> E
//        graph.addEdge(2, 3); // C <-> D
//        graph.addEdge(2, 4); // C <-> E
//        graph.addEdge(4, 0); // E <-> A








    }

}

