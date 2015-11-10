public interface StringQueue {
	public void enqueue(String item);
	public String dequeue();
	public String toString();
	// as long as the number of enqueues and dequeues are relatively equal, it doesn't matter which end of the list is considered the front of the queue and which is considered the back.
}