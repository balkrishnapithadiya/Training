import java.util.*;
public class minAndMaxFromList {

	public static void main(String[] args) {
		List <Integer> l1 = new ArrayList <Integer> ();
		l1.add(1);
		l1.add(10);
		l1.add(35);
		l1.add(76);
		l1.add(54);
		l1.add(49);
		l1.add(150);
		Collections.sort(l1);
		int min = l1.get(0);
		int max = l1.get(l1.size()-1);
		System.out.print("ArrayList Is: "+l1);
		System.out.print("\nMaximum Number Is: "+max);
		System.out.print("\nMinimum Number Is: "+min);
	}

}
