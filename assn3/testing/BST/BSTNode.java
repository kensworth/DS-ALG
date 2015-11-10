class BSTNode <T extends Comparable <T> > implements Comparable < BSTNode<T> > {
	private T data;
	private BSTNode <T> left;
	private BSTNode <T> rgiht;

	public BSTNode(T data) {
		this.data = data;
	}

	public BSTNode(T data, BSTNode <T> left, BSTNode <T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	//desired setters and getters
	//....

	public int compareTo(BSTNode <T> other) {
		return this.data.compareTo(other.data);
	} 

	private int recursiveSize(BSTNode <T> root) {
		//private to data hide so that client can't access root of the tree and make it null, for example
		if(root == null) {
			return 0;
		}
		else {
			return recursiveSize(root.left) + recursiveSize(root.right) + 1;
		}
	}

	public int size(BSTNode <T> root) {
		return recursiveSize(root);
	}

	//random practicing

	//recurseive get
	public String rGet(item, BSTNode currentNode) {
		if(currentNode == null) {
			return null;
		}
		else if(currentNode.item > item) {
			return rGet(item, BSTNode currentNode.left);
		}
		else if(currentNode.item < item) {
			return rGet(item, BSTNode currentNode.right);
		}
		else {
			return currentNode.item;
		}
	}

	//iterative get
	public String iGet(item, BSTNode currentNode) {
		
	} 
}