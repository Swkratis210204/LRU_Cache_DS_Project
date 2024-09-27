public interface HashInterface<K, V> {

    /**
     * Inserts a key-value pair into the hash table.
     *
     * @param key   The key of the pair.
     * @param value The value of the pair.
     */
    void insert(Node<K, V> node);

    /**
     * Searches for the value associated with the given key in the hash table.
     *
     * @param key The key to search for.
     * @return The value associated with the key, or null if the key is not found.
     */
    boolean search(K key);

    /**
     * Removes the key-value pair associated with the given key from the hash table.
     *
     * @param key The key to be removed.
     * @return True if the removal was successful, false otherwise (e.g., if the key is not present).
     */
    boolean remove(K key);

    /**
     * Returns the size of the hash table, i.e., the number of key-value pairs it currently contains.
     *
     * @return The size of the hash table.
     */
    int getSize();

    /**
     * Prints the contents of the hash table.
     */
    void print();

    V retrieve(K key);
}
