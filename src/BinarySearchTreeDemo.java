public class BinarySearchTreeDemo {

    /*
    * Binary Search Tree: - A binary tree is a tree data structure in which each node has at most two children,
    *                       which are referred to as the left child and the right child.
    *                     - A binary search tree is a binary tree in which the value of each parent node's left child
    *                       is less than the value the parent node, and the value of the parent node's right child is
    *                       greater than the value of the parent node.
    *
    * Basically, A tree data structure where each node is greater than its left child but less than its right child.
    * So, left-most node is the smallest and right-most node is the largest.
    * Example:
    *                    / ---> 7 (Right-most node)
    *           / ---> 6
    *         /          \ ---> 5
    * (Root) 4
    *         \          / ---> 3
    *           \ ---> 2
    *                    \ ---> 1 (Left-most node)
    *
    * Benefit: easy to locate a node when they are in this order.
    *
    * Time Complexity: Best Case: O(log n) Average Case: O(log n) Worst Case: O(n)
    * Space Complexity: O(n)
    *
    * Advantages:
    * - Efficient for searching
    * - Efficient for sorting
    * - Efficient for insertion and deletion
    *
    * Disadvantages:
    * - Not efficient for searching if the tree is unbalanced
    * - Not efficient for sorting if the tree is unbalanced
    * - Not efficient for insertion and deletion if the tree is unbalanced
    *
    * */

    NodeBi root;

    // Methods

    // Insert
    public void insert(NodeBi node) {

    }

    private NodeBi insertHelper(NodeBi root, NodeBi node) {
        return null;
    }

    // Display
    public void display() {

    }

    public void displayHelper(NodeBi root) {

    }

    // Search
    public boolean search(int data) {
        return false;
    }

    private boolean searchHelper(NodeBi root, int data) {
        return false;
    }

    // Remove
    public void remove(int data) {

    }

    private NodeBi removeHelper(NodeBi root, int data) {
        return null;
    }

    // Successor and Predecessor
    public int getSuccessor(NodeBi node) {
        return 0;
    }

    public int getPredecessor(NodeBi node) {
        return 0;
    }



    public void run() {

        BinarySearchTreeDemo tree = new BinarySearchTreeDemo();



    }
}
