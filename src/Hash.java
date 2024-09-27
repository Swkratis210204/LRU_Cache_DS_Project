import static java.lang.Math.abs;

public class Hash<K,V> implements HashInterface<K,V> {
    private Node<K,V>[] Hashmap;
    private int N;
    private int size;

    public Hash(int maxSize){
        N = 0;
        Hashmap = new Node[maxSize];
    }
    @Override
    public int getSize() {

        return this.size;
    }
    private int HashCode(K key){
        int hash=abs(key.hashCode());
        return hash% this.Hashmap.length;
    }
    @Override
    public void insert(Node<K, V> node) {
        int i = HashCode(node.getKey());
        while (Hashmap[i] != null){
            if(N==Hashmap.length){
                Hashmap[i] =node;
                return;
            }
            i = (i+1) % Hashmap.length;

        }
        Hashmap[i] = node;
        N++; }

    @Override
     public boolean search(K key) {
        int i = HashCode(key);
        int looks=0;
        while (Hashmap[i] != null){
            if(looks>Hashmap.length){
                return false;
            }
            if (key.equals(Hashmap[i].getKey())) {
                return true;
            }else{
                looks++;
                i = (i+1) % Hashmap.length;

            }
        }
        return false;
    }
    @Override
    public boolean remove(K key) {
        int address = HashCode(key);
        if (this.Hashmap[address] != null) {
            this.Hashmap[address] = null;
            this.size--;
            return true;
        }
        return false;
    }
    @Override
    public void print(){
        for (Node<K,V> Node : this.Hashmap) {
            if (Node != null) {
                System.out.println(Node.getData());
            }
        }
    }

    @Override
    public V retrieve(K key) {
        int i = HashCode(key);
        return Hashmap[i].getData();
    }
}
