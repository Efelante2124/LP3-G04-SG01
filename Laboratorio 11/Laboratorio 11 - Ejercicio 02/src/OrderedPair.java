
public class OrderedPair<K,V>{
	private K key;
	private V value;
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return this.key;
	}
	public V getValue() {
		return this.value;
	}
	@Override
	public String toString() {
		return "OrderedPair [key=" + key + ", value=" + value + "]";
	}
	
}
