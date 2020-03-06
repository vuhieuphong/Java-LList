package singlellist;

public class Test1 {

	public static void main(String[] args) {
		SingleLList<Integer> list=new SingleLList<Integer>();
		list.addBack(2);
		list.addBack(3);
		list.addBack(4);
		list.addBack(6);
		System.out.println("List: "+list);
		System.out.println("Remove at 2nd last: "+list.removeAtPosition(list.size-2));
		System.out.println("List:"+list);
		System.out.println("Remove at last: "+list.removeAtPosition(list.size-1));
		System.out.println("List: "+list);
		list.addAtPosition(1, 12);
		System.out.println("List after add at pos 1: "+list);
		list.addAtPosition(2, 13);
		System.out.println("List after add at pos 2: "+list);
		list.addAtPosition(3, 14);
		System.out.println("List after add at pos 3: "+list);
	}
}
