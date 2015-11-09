package LL;

public interface LinkedList {
	void insert(String item);
	void remove(String item);
	void clear();
	boolean contains(String item);
	int indexOf(String item);
	String get(int index);
	int size();
	String toString();
}