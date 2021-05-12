import java.util.LinkedList;

public class deleteLastElement {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("1");
		ll.add("A");
		ll.add("2");
		ll.add("B");
		ll.add("3");
		ll.add("C");
		System.out.print("Linked List Elements Are: "+ll);
		ll.removeLast();
		System.out.print("Linked List Elements Are: "+ll);
	}

}
