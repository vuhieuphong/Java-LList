package singlellist;

public class QueueLList<T> extends SingleLList<T> {
	void enqueue(T data) {
		addBack(data);
	}
	
	T dequeue() {
		return removeFront();
	}
	
	QueueLList<T> concatenate(QueueLList<T> q2){
		tail.next=q2.head;
		q2.head=null;
		return this;
	}		
	
	public static void main(String[] args) {
		QueueLList<Integer> q1=new QueueLList<Integer>();
		q1.enqueue(1);
		q1.enqueue(2);
		q1.enqueue(3);
		
		QueueLList<Integer> q2=new QueueLList<Integer>();
		q2.enqueue(5);
		q2.enqueue(6);
		q2.enqueue(7);
		System.out.println(q1.concatenate(q2));
		System.out.println(q2);
	}
}
