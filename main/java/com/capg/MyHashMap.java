package com.capg;

public class MyHashMap<K,V> {
	MyLinkedList<K> linkedList;
	
	public MyHashMap() {
		this.linkedList=new MyLinkedList<>();
	}
	
	public V get(K key) {
		MyMapNode<K, V> mapNode=(MyMapNode<K,V>)this.linkedList.search_ret(key);
		return (mapNode==null) ? null:mapNode.getValue();
	}
	
	public void add(K key,V value) {
		MyMapNode<K,V> mapNode=(MyMapNode<K,V>)this.linkedList.search_ret(key);
		if(mapNode==null) {
			mapNode=new MyMapNode<>(key, value);
			this.linkedList.append(mapNode);
		}
		else {
			mapNode.setValue(value);
		}
	}
	
	@Override
	public String toString() {
		return "MyHashMapNodes{"+linkedList+'}';
	}
}
