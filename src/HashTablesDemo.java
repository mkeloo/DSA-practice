import java.util.Hashtable;

public class HashTablesDemo {
    /*
     * Hash Tables: - A data structure that maps keys to values for highly efficient lookup.
     *              - A data structure that stores unique keys to values like a dictionary. Ex. <Integer, String>.
     *              - A data structure that uses a hash function to compute an index into an array of buckets or slots,
     *               from which the desired value can be found.
     *              - Each key/value pair is known as an entry.
     *              - Each entry is stored in an array called a bucket.
     *              - Fast insertion, deletion, and lookup of key to value pairs.
     *              - Not ideal for small data sets, but great for large data sets.
     *
     * Hashing: - The process of mapping a key to an index in the array by using a hash function.
     *          - Takes a key and computes an integer (formula will vary based on key and data type).
     *          - In a Hashtable, we use the hash % capacity to get the index in the array.
     *          - The hash function should be fast and avoid collisions.
     *          - A collision occurs when two keys hash to the same index in the array.
     *          - A good hash function will minimize collisions by uniformly distributing the keys.
     *
     * Load Factor: - The ratio of the number of elements in the hash table to the number of buckets.
     *
     *              key.hashCode() % capacity = index
     *
     * Collision: - A collision occurs when two keys hash to the same index in the array.
     *            - A good hash function will minimize collisions by uniformly distributing the keys.
     *            - Fewer collisions = faster lookup and more efficiency.
     *
     * Collision Resolution: - The process of handling two different keys that hash to the same index.
     *                       - Two strategies: Separate Chaining and Open Addressing.
     *                       - Separate Chaining: Each bucket is independent, and has some sort of list of entries with the same index.
     *                       - Open Addressing: All entry records are stored in the bucket array itself.
     *                       - Or increase the size of the array and rehash all keys (linear or quadratic probing).
     *
     * Bucket: - A bucket is a linked list of entries with the same hash.
     *         - Each bucket is independent of each other.
     *         - An indexed storage location for one or more entries.
     *         - Can store multiple entries in case of collision (linked similarly to a LinkedList).
     *
     * Runtime complexity: Best case: O(1) Average case: O(1) Worst case: O(n)
     *
     * Hash Function: A function that converts a given key into an index of an array.
     * Hash Code: An integer value that represents the data stored in a hash table.
     *
     *
     * Advantages:
     * - Fast lookup
     * - Fast insertion
     * - Flexible keys
     * - Flexible key types
     * - Great for large data sets
     *
     * Disadvantages:
     * - Unordered
     * - Slow key iteration
     * - Single direction lookup
     *
     * */

    // Entry<Key, Value>

    public void run() {

        Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>(10, 0.75f);

        hashTable.put(100, "SpongeBob");
        hashTable.put(123, "Patrick");
        hashTable.put(321, "Sandy");
        hashTable.put(555, "Squid ward");
        hashTable.put(777, "Gary");

        System.out.println(hashTable);
        System.out.println();

//        hashTable.remove(555);

        for(Integer key : hashTable.keySet()) {
            System.out.println("Key.HashCode: " + key.hashCode() % 10   + " Key: " + key + " Value: " + hashTable.get(key));
        }

        System.out.println();

        // HashTables as Entry<String, String>
        Hashtable<String, String> table = new Hashtable<String, String>(21);

        table.put("100", "SpongeBob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squid ward");
        table.put("777", "Gary");

        System.out.println(table);
        System.out.println();

        // key.hashCode() is the hash function that uses ASCII values to compute the hash code when keys are strings.
        for(String key : table.keySet()) {
            System.out.println("Key.HashNumber: " + key.hashCode()  + " Key.HashCode: " + key.hashCode() % 21 + " Key: " + key + " Value: " + table.get(key));
        }






    }



}
