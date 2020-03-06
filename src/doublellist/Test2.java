package doublellist;

public class Test2 {

	public static void main(String[] args) {
		DoubleLList<Integer> a = new DoubleLList<Integer>();
		// add front working
		a.addFront(6);
		System.out.println("List: " + a);
		System.out.println("Head: " + a.head + " Tail: " + a.tail + " Size: " + a.size);
		// add back working
		a.addBack(7);
		System.out.println("List: " + a);
		System.out.println("Head: " + a.head + " Tail: " + a.tail + " Size: " + a.size);
		// remove front working
		System.out.println("Removed: " + a.removeFront());
		System.out.println("List: " + a);
		System.out.println("Head: " + a.head + " Tail: " + a.tail + " Size: " + a.size);
		a.addBack(1);
		System.out.println("List: " + a);
		System.out.println("Head: " + a.head + " Tail: " + a.tail + " Size: " + a.size);
		// remove back working
		System.out.println("Removed: " + a.removeBack());
		System.out.println("List: " + a);
		System.out.println("Head: " + a.head + " Tail: " + a.tail + " Size: " + a.size);

		System.out.println();

		System.out.println("Removed: " + a.removeBack());
		System.out.println("List: " + a);
		System.out.println("Head: " + a.head + " Tail: " + a.tail + " Size: " + a.size);
		System.out.println("Removed: " + a.removeFront());
		System.out.println("List: " + a);
		System.out.println("Head: " + a.head + " Tail: " + a.tail + " Size: " + a.size);
	}

}
