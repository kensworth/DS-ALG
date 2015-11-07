//generic type item
public class Stack<Item> {
	private Node first = null;
	private class Node {
		Item item;
		Node next;
	}
	public boolean isEmpty() {
		return first == null;
	}
	public void push(String item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}
	public Item pop() {
		Item item = first.item;
		first = first. next;
		return item;
	}
}