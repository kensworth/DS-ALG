package LL;

class StringNode {
	private String data;
	private StringNode next;

	void insert(String item) {
		StringNode newNode = new StringNode();
		newNode.setNext(head);
		head = newNode;
	}

	void remove(String item) {
	}
	
	public void setData(String data) {
		this.data = data;
	}

	public void setNext(StringNode next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public StringNode getNext() {
		return next;
	}

	public static void main(String[] args) {
		StringNode sn = null;
		StringNode current = null;

		sn = new StringNode();
		current = new StringNode();
		//sn.setData("1");
		//current.setData("2");
		sn.setNext(current);
		current.setNext(new StringNode());
		current = current.getNext();
		//current.setData("3");
		current.setNext(new StringNode());
		current = current.getNext();
		//current.setData("4");
		//System.out.println(sn.getData());
		//System.out.println(current.getData());
	}
	/* Intuitive
	void clear() {
	}
	boolean contains(String item) {
		return false;
	}
	int indexOf(String item) {
		return 0;
	}
	String get(int index) {
		return "";
	}
	int size() {
		return 0;
	}*/ 
}