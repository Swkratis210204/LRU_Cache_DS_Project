public interface MyListInterface<K, V> {

    /**
     * Checks if the linked list is empty.
     *
     * @return True if the linked list is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Inserts a key-value pair at the end of the linked list.
     *
     * @param key   The key of the pair.
     * @param data  The value of the pair.
     */
    void insertAtBack(Node<K, V> node);

    /**
     * Removes and returns the value from the front of the linked list.
     *
     * @return The value from the front of the linked list.
     */
    V removeFromFront();

    /**
     * Returns a string representation of the linked list.
     *
     * @return A string representation of the linked list.
     */
    String toString();

    /**
     * Checks if the linked list contains a given key.
     *
     * @param key The key to search for.
     * @return True if the key is found in the linked list, false otherwise.
     */
    boolean contains(K key);

    /**
     * Removes the first occurrence of the given key from the linked list.
     *
     * @param key The key to be removed.
     * @return True if the removal was successful, false otherwise (e.g., if the key is not present).
     */
    boolean remove(K key);
}
