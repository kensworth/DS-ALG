public class LinkedStringStack implements StringStack {
	private LinkedStringList stack;

	public LinkedStringStack() {
		stack = new LinkedStringList();
	}

	public void push(String item) {
		if(item != null) {
			stack.insertBack(item);
		}
	}

	public String pop() {
		String item = null;
		if(!stack.isEmpty()) {
			item = stack.get(stack.size() - 1);
			stack.removeBack();
		}
		return item;
	}

	public String peek() {
		String item = null;
		if(!stack.isEmpty()) {
			item = stack.get(stack.size() - 1);
		}
		return item;
	}

	public String toString() {
		return stack.toString();
	}

	//efficient stack should be pushed and popped at the head of the linked list so that operations do not need to traverse the list
}