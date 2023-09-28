
public class AdjacencyMatrixGraphDemo {

    /*
    * Adjacency Matrix: - A 2D array of size V x V where V is the number of vertices in a graph.
    *                   - Each row and column represent a vertex.
    *                   - Each cell represents an edge.
    *                   - A value of 1 indicates an edge between two vertices.
    *                   - A value of 0 indicates no edge between two vertices.
    *                   - Can be used to represent a directed or undirected graph.
    *                   - Can be used to represent a weighted graph.
    *                   - Can be used to represent a cyclic graph.
    * - An array store 1s and 0s (could use Booleans) to represent edges.
    * - # of rows = # of unique nodes
    * - # of columns = # of unique nodes
    *
    * What is Vertex and Edge in a graph?
    * - Vertex = A node in a graph like A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, etc.
    * - Edge = A connection between two nodes in a graph like A -> B, B -> C, C -> D, etc.
    *
    * Runtime Complexity to check an Edge: O(1)
    * Runtime Complexity to find all edges from a vertex: O(V)
    * Space Complexity: O(V^2) where V is the number of vertices in the graph.
    *
    * Advantages:
    * - Space efficient for representing dense graphs.
    * - Edge weight lookup is O(1)
    * - Simplest graph representation
    *
    * Disadvantages:
    * - Requires more space for sparse graphs.
    * - Iterating over all edges takes O(V^2) time.
    * - Adding a vertex takes O(V^2) time.
    *
    * */

    public void run() {

        Graph graph = new Graph(5);

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

        // Check if there is an edge between two vertices
        System.out.println("\n\tCheck an edge b/w two vertices");
        System.out.println("Is there an edge between A and B? " + graph.checkEdge(0, 1));
        System.out.println("Is there an edge between A and C? " + graph.checkEdge(0, 2));
        System.out.println("Is there an edge between A and D? " + graph.checkEdge(0, 3));
        System.out.println("Is there an edge between A and E? " + graph.checkEdge(0, 4));
        System.out.println("Is there an edge between B and A? " + graph.checkEdge(1, 0));
        System.out.println("Is there an edge between B and C? " + graph.checkEdge(1, 2));
        System.out.println("Is there an edge between B and D? " + graph.checkEdge(1, 3));
        System.out.println("Is there an edge between B and E? " + graph.checkEdge(1, 4));



//        // Add edges to the graph: Undirected Graph
//        graph.addEdge(0, 1); // A <-> B
//        graph.addEdge(1, 2); // B <-> C
//        graph.addEdge(1, 4); // B <-> E
//        graph.addEdge(2, 3); // C <-> D
//        graph.addEdge(2, 4); // C <-> E
//        graph.addEdge(4, 0); // E <-> A










    }

}
