package singlellist;

public class StackLList<T> extends SingleLList<T> {
	void push(T data) {
		addBack(data);
	}

	T pop() {
		return removeBack();
	}

	StackLList<T> transfer(StackLList<T> s1, StackLList<T> s2) {
		int temp1 = s1.size;
		int temp2 = s2.size;

		for (int i = 0; i < temp2; i++) {
			s2.pop();
		}

		for (int i = 0; i < temp1; i++) {
			s2.push(s1.tail.data);
			s1.pop();
		}
		return s2;
	}

	public static void main(String[] args) {
		StackLList<Integer> s1 = new StackLList<Integer>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);

		StackLList<Integer> s2 = new StackLList<Integer>();
		s2.push(5);
		s2.push(6);
		s2.push(7);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.transfer(s1, s2));
	}
}
