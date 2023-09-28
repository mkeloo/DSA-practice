public class RecursionDemo {

    /*
     * Recursion - A method that calls itself.
     *           - A method that solves a problem by reducing it to an instance of the same problem with smaller input.
     *           - Apply the result of a procedure to itself.
     *           - Divide a problem into sub-problems of the same type as the original.
     *           - Commonly used with advanced sorting algorithms and navigating trees.
     *
     * Runtime: O(2^n)
     *
     * Advantages:
     * - Easy to read
     * - Easy to write
     * - Easy to debug
     *
     * Disadvantages:
     * - Slow (exponential time)
     * - Large memory footprint
     *
     * */

    private static void walk(int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.println("Walking step " + (i + 1) + "...");
        }
    }

    private static void walkRecursively(int steps) {
        if (steps < 1) return; // Base case
        System.out.println("Walking step Recursively " + steps + "...");
        walkRecursively(steps - 1); // Recursive case

    }

    private static int factorial(int i) {
        if (i == 1) return 1; // Base case
        return i * factorial(i - 1); // Recursive case
    }

    private static int power(int base, int exponent) {
        if (exponent == 0) return 1; // Base case
        return base * power(base, exponent - 1); // Recursive case

        // This works because:
        // 2^5 = 2 * 2^4
        // 2^4 = 2 * 2^3
        // 2^3 = 2 * 2^2
        // 2^2 = 2 * 2^1
        // 2^1 = 2 * 2^0
        // 2^0 = 1

    }


    public void run() {

        walk(5);
        System.out.println();
        walkRecursively(5);

        System.out.println();
        System.out.println(factorial(5));

        System.out.println();
        System.out.println(power(2, 5));



    }




}
