public class Node<K,V> {
    protected V data;
    protected K key;
    protected Node<K,V> next = null;

    Node(K key,V data) {
        this.data = data;
        this.key=key;
    }


    public V getData() {
        // return data stored in this node
        return data;
    }

    public Node<K,V> getNext() {
        // get next node
        return next;
    }
    public K getKey() {
        return key;
    }

    /**
     * Set reference to next node
     *
     * @param next reference
     */
    public void setNext(Node<K,V> next) {
        this.next = next;
    }

}
