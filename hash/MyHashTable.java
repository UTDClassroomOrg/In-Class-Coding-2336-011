package hash;

import genericList.MyLinkedList;

public class MyHashTable<K, V> {

	private class HashNode{
		K key;
		V value;
		
		HashNode(K key, V value){
			this.key = key;
			this.value = value;
		}
	}
	
	private MyLinkedList<HashNode>[] table;
	private int capacity;
	private int size;
	private double loadFactorThreshold;
	
	public MyHashTable(int capacity, double loadFactorThreshold) {
		this.capacity = capacity;
		this.loadFactorThreshold = loadFactorThreshold;
		init();
	}
	
	public MyHashTable() {
		this.capacity = 11;
		this.loadFactorThreshold = 0.5;
		init();
	}
	
	private void init() {
		table = new MyLinkedList[capacity];
		for(int i = 0; i < capacity ; i++) {
			table[i] = new MyLinkedList<>();
		}
		size = 0;
	}
	
	
}
