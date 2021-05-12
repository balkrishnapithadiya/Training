import java.util.*;
public class binarySearch {

	public static void main(String[] args) {
		Vector <Integer> v = new Vector <Integer> ();
		v.add(20);
		v.add(10);
		v.add(6);
		v.add(45);
		v.add(50);
		Collections.sort(v);
		int index = Collections.binarySearch(v, 6);
		System.out.println("Element is found at index : "+index);
	}

}
