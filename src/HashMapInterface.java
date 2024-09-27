public interface HashMapInterface<K,V> {

	boolean add(K key, V value);
	boolean remove(K key, V value); ;
	boolean contains(K key, V value);
}
