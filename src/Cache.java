public class Cache<K, V> implements CacheInterface<K, V>{

    private Hash<K, V> map;
    private int size;
    private int hits;
    private int misses; 
    private int lookUps;
    private int maxSize;

    Cache(int maxSize) {
        this.map = new Hash<K, V>(maxSize);
        this.size = 0;
        this.hits = 0;
        this.misses = 0;
        this.lookUps = 0;
        this.maxSize = maxSize;
    }

    @Override
    public V lookUp(K key) {
        lookUps++;
        if (map.search(key)) {
            hits++;
            return map.retrieve(key);
        } else {
            misses++;
            return null;
        }
    }

    @Override
    public void store(K key, V value) {
        this.map.insert(new Node<>(key, value));
        this.size++;
        if(this.size == this.maxSize + 1){
            this.map.remove(key);
            this.size--;
        }
    }
    @Override
    public double getHitRatio() {
        return (double) this.hits / (double) this.lookUps;
    }

    @Override
    public long getHits() {
        return this.hits;
    }

    @Override
    public long getMisses() {
        return this.misses;
    }

    @Override
    public long getNumberOfLookUps() {
        return this.lookUps;
    }

}
