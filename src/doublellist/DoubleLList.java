package doublellist;

public class DoubleLList<T> {
	Node head;
	Node tail;
	int size;
	
	public class Node {
		T data;
		Node next;
		Node prev;

		Node(T data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

		Node(T data, Node prev, Node next) {
			this.data = data;
			this.next = next;
			this.prev = prev;
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

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public String toString() {
			return data.toString();
		}
	}

	public String toString() {
		if (head == null) {
			return "null";
		}
		String lstString="";
		Node current = head;
		while (current.next != null) {
			lstString+=current.data + " ";
			current = current.next;
		}
		lstString+= current.data + "";
		return lstString;
	}	

	void addFront(T data) {
		Node newHead = new Node(data);
		newHead.next = head;
		
		if (head != null) {
			head.prev = newHead;
		}
		if(head==null||head.next==null) {
			head=tail=newHead;
		}
		head = newHead;
		size++;
	}

	void addBack(T data) {
		if (head == null) {
			head = tail = new Node(data);
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			Node nodeToAdd = new Node(data);
			current.next = nodeToAdd;
			nodeToAdd.prev = current;
			tail=nodeToAdd;
		}
		size++;
	}

	T removeFront() {
		if (head == null||head.next==null) {
			Node temp=head;
			head=tail=null;
			size=0;
			if(temp!=null) {
				return temp.data;
			}
			return null;
		} else {
			Node toRemove=head;
			head = head.next;			
			if (head != null) {
				head.prev = null;
			}
			size--;
			return toRemove.data;
		}
	}

	T removeBack() {
		if (head == null || head.next == null) {
			Node temp=head;
			head =tail= null;
			size=0;
			if(temp!=null) {
				return temp.data;
			}
			return null;
		} else {
			Node current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			Node toRemove=current.next;
			tail=current;
			current.next = null;
			size--;
			return toRemove.data;
		}
	}

	Node search(T data) {
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
		return size();
	}

	int position(T data) {
		Node current = head;
		int count = 0;
		while (current.data != data) {
			count++;
			current = current.next;
		}
		return count;
	}

	/*
	 * void concatToList(DoubleLList<T> listToConcat){ if(head==null) {
	 * head=listToConcat.head; return; } else if(listToConcat.head==null) { return;
	 * } Node current=head; while(current.next!=null) { current=current.next; }
	 * listToConcat.head.prev=current; current.next=listToConcat.head; }
	 */
}
