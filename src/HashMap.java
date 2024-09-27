public class HashMap<K,V>{

	private MyList<K,V>[] array;
	private int size;
	public HashMap(int arraySize) {
		
		this.array = new MyList[arraySize];
		this.size = 0;
	}

	public boolean add(K key,V data) {
    if (this.array[(int)key] == null) {
		this.array[(int)key] = new MyList<K,V>();
	}

	if (this.array[(int)key]!=null) {
		return false;
	}

	this.array[(int)key].insertAtBack(new Node<>(key,data));
	this.size++;
	return true;
}

	public boolean remove(K key) {
		if(this.array[(int)key].contains(key)){
			this.array[(int)key].remove(key);
			this.size--;
			return true;
		}
		//remove data from list
		return false;
	}

	public boolean contains(K key) {
		
		if(this.array[(int)key]!=null) {
			return true;
		}else{
			return false;
		
		}
	}

	public int getSize() {
		
		return this.size;
	}
}