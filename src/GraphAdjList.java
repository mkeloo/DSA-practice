import java.util.ArrayList;
import java.util.LinkedList;


public class GraphAdjList {

    // ArrayList of datatype LinkedList of datatype Node to store the adjacency list
    ArrayList<LinkedList<NodeGph>> adjList;

    GraphAdjList(){
        adjList = new ArrayList<>();
    }

    // Add a node to the graph
    public void addNode(NodeGph nodeGph) {
        // Create a new LinkedList
        LinkedList<NodeGph> currentList = new LinkedList<>();

        // Add the node to the LinkedList
        currentList.add(nodeGph);

        // Add the LinkedList to the Adjacency List of the graph
        adjList.add(currentList);
    }

    // Add an edge to the graph
    public void addEdge(int source, int destination) {

        // Create a new LinkedList
        LinkedList<NodeGph> currentList = adjList.get(source);

        // Add the node to the LinkedList at the source index
        // Head of the LinkedList is the source node
        NodeGph destNodeGph = adjList.get(destination).get(0);

        // Add the destination node to the LinkedList at the source index or the tail of the LinkedList
        currentList.add(destNodeGph);

    }

    // Check an edge between two vertices
    public boolean checkEdge(int source, int destination) {
        // Create a new LinkedList
        LinkedList<NodeGph> currentList = adjList.get(source);

        // Add the node to the head of the LinkedList
        NodeGph destNodeGph = adjList.get(destination).get(0);

        for (NodeGph nodeGph : currentList) {
            if (nodeGph == destNodeGph) {
                return true;
            }
        }
        return false;
    }

    // Print the graph
    public void printGraph() {
        System.out.println("Graph using Adjacency Matrix: ");

        // Outer loop to iterate over the ArrayList
        for(LinkedList<NodeGph> currentList : adjList) {

            // Inner loop to iterate over the LinkedList
            for(NodeGph nodeGph : currentList) {

                // Print the data at the current node
                System.out.print(nodeGph.data + " -> ");
            }
            System.out.println();
        }

    }


}
