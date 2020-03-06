package singlellist;

public class SingleLList<T> {
	Node head;
	Node tail;
	int size;

	public class Node {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}

		Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String toString() {
			return data.toString();
		}
	}

	public String toString() {
		if (head == null) {
			return "null";
		}
		String lstString = "";
		Node current = head;
		while (current.next != null) {
			lstString += current.data + " ";
			current = current.next;
		}
		lstString += current.data + "";
		return lstString;
	}

	void addFront(T data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
		if (tail == null) {
			head = tail = newHead;
		}
		size++;
	}

	void addBack(T data) {
		if (head == null) {
			head = new Node(data);
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
			tail = current.next;
		}
		size++;
	}

	T removeFront() {
		if (head == null || head.next == null) {
			Node temp = head;
			tail = head = null;
			size = 0;
			if (temp != null) {
				return temp.data;
			}
			return null;
		} else {
			Node temp = head;
			head = head.next;
			size--;
			return temp.data;
		}
	}

	T removeBack() {
		if (head == null || head.next == null) {
			Node temp = head;
			head = tail = null;
			size = 0;
			if (temp != null) {
				return temp.data;
			}
			return null;
		} else {
			Node current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			tail = current;
			Node toRemove = current.next;
			current.next = null;
			size--;
			return toRemove.data;
		}
	}

	Node searchByData(T data) {
		if (head == null) {
			return null;
		} else {
			Node nodeToSearch = null;
			Node current = head;
			while (current != null) {
				if (current.data == data) {
					nodeToSearch = current;
					break;
				}
				current = current.next;
			}
			return nodeToSearch;
		}
	}

	int size() {
		return size;
	}

	int position(T data) {
		Node current = head;
		int pos = 0;
		while (current.data != data) {
			pos++;
			current = current.next;
		}
		return pos;
	}

	void addAtPosition(int pos, T data) {
		Node current = head;

		if (pos == 0) {
			addFront(data);
		}

		else if (pos > size - 1 || pos < 0) {
			return;
		}

		else {
			for (int i = 0; i < pos - 1; i++) {
				current = current.next;
			}

			Node toAdd = new Node(data);
			toAdd.next = current.next;
			current.next = toAdd;
			size++;
		}
	}

	T removeAtPosition(int pos) {
		Node current = head;

		if (pos == 0) {
			return removeFront();
		}

		if (pos == size - 1) {
			return removeBack();
		}

		if (pos > size - 1 || pos < 0) {
			return null;
		}

		for (int i = 0; i < pos - 1; i++) {
			current = current.next;
		}

		T toRemove = current.next.data;
		current.next = current.next.next;
		size--;
		return toRemove;
	}

	/*
	 * void swapNodes(T data1, T data2) { Node node1 = this.search(data1); Node
	 * node2 = this.search(data2); if (node1 == node2 || node1 == null || node2 ==
	 * null) { return; } else { Node next1 = node1.next; Node next2 = node2.next;
	 * 
	 * Node prev1 = null; Node current = head; int count1 = this.position(data1); if
	 * (head != node1) { while (current.next != node1) { current = current.next; }
	 * prev1 = current; }
	 * 
	 * Node prev2 = null; current = head; int count2 = this.position(data2); if
	 * (head != node2) { while (current.next != node2) { current = current.next; }
	 * prev2 = current; }
	 * 
	 * if (count1 < count2) { if (head != node1) { prev1.next = node2; } else { head
	 * = node2; } node2.next = prev2; prev2.next = node1; node1.next = next2; if
	 * (next1 != node2) { node2.next = next1; } } else { swapNodes(data2, data1); }
	 * } }
	 */
}
