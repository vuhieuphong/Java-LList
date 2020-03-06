package singlellist;

public class StackLList<T> extends SingleLList<T> {
	void push(T data) {
		addBack(data);
	}
	
	T pop() {
		return removeBack();
	}
}
