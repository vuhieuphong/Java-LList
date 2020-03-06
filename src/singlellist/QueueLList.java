package singlellist;

public class QueueLList<T> extends SingleLList<T> {
	void enqueue(T data) {
		addBack(data);
	}
	
	T dequeue() {
		return removeFront();
	}
}
