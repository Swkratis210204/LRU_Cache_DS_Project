public class MyList<K,V> implements MyListInterface<K,V> {

    private Node<K,V> head = null;
    private Node<K,V> tail = null;
    private int size;
    public MyList(int size) {
        this.size = size;
    }
    public MyList() {
        this.size = 0;
    }
    @Override
    public boolean isEmpty() {
        return head == null;
    }
    @Override
    public void insertAtBack(Node<K, V> node) {
        this.size++;
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }
    @Override
    public V removeFromFront(){
        if (isEmpty())
            System.out.println("List is empty");
        this.size--;
        V data = head.getData();

        if (head == tail)
            head = tail = null;
        else
            head = head.getNext();

        return data;
    }
    @Override
    public String toString() {
        if (isEmpty()) {
            return "List is empty :(";
        }

        Node<K,V> current = head;

        StringBuilder ret = new StringBuilder();

        // while not at end of list, output current node's data
        ret.append("HEAD -> ");

        while (current != null) {
            ret.append(current.data.toString());

            if (current.getNext() != null)
                ret.append(" -> ");

            current = current.next;
        }

        ret.append(" <- TAIL");

        return ret.toString();
    }
    @Override
    public boolean contains(K key) {
        Node<K,V> cur = head;
        while (cur != null) {
            if (key.equals(cur.getKey())){
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }
    @Override
    public boolean remove(K key) {
        Node<K,V> cur=head;
        while(key!=cur.next.getKey()) {
            cur=cur.next;
        }
        if(cur.next==tail) {
            tail=cur;
            cur.next=null;
            return true;
        }
        else if(cur.next==null) {
            return false;
        }
        else {
            cur.next=cur.next.next;
            return true;
        }
    }
    public int getSize() {
        return this.size;
    }
}