import java.util.*;
public class stackImplementation {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		System.out.print("Stack After Push Operation: "+s1);
		s1.pop();
		System.out.print("\nStack After Pop Operation: "+s1);
	}

}
