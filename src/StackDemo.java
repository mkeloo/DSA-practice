

import java.util.Stack;

public class StackDemo {

    public void run() {
        /*
         * Stack = LIFO data structure: Last In First Out
         * Stores objects into a kind of vertical tower. You can only access the top element.
         *
         * stack.push() = adds element to the top of the stack
         * stack.pop() = removes element from the top of the stack
         * stack.peek() = returns the element on the top of the stack
         * stack.empty() = returns whether the stack is empty or not
         * stack.search() = returns the 1-based position of the element from the top of the stack
         * stack.size() = returns the number of elements in the stack
         * stack.capacity() = returns the capacity of the stack
         *
         * */


        Stack<String> stack = new Stack<>();

        System.out.println("Stack: " + stack);

        stack.push("Minecraft");
        stack.push("Fortnite");
        stack.push("Roblox");
        stack.push("Among Us");
        stack.push("Terrarium");

        System.out.println("Updated Stack: " + stack);

        stack.pop();
        System.out.println("Updated Stack: " + stack);

        String elementOnTop = stack.pop();
        System.out.println("Element on top: " + elementOnTop);

        String elementAtTop = stack.peek();
        System.out.println("Element at top: " + elementAtTop);

        // Search for an element
        System.out.println("Search for an element: " + stack.search("Terrarium"));
        System.out.println("Search for an element: " + stack.search("Minecraft"));
        System.out.println("Search for an element: " + stack.search("Fortnite"));
        System.out.println("Search for an element: " + stack.search("Roblox"));
        System.out.println("Search for an element: " + stack.search("Among Us"));

        // Check stack's size and capacity
        System.out.println("Stack's size: " + stack.size());
        System.out.println("Stack's capacity: " + stack.capacity());

        // Increase stack's capacity to 20
        stack.ensureCapacity(20);
        System.out.println("Stack's capacity: " + stack.capacity());
    }
}
