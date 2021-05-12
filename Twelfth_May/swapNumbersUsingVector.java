import java.util.*;
public class swapNumbersUsingVector {
	public static void main(String [] args)
	{
		Vector<Integer> v1 = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter First Number: ");
		int n1 = sc.nextInt();
		System.out.print("Please Enter Second Number: ");
		int n2 = sc.nextInt();
		sc.close();
		v1.add(n1);
		v1.add(n2);
		v1.setElementAt(n2, 0);
		v1.setElementAt(n1, 1);
		Iterator<Integer> it = v1.iterator();
		System.out.print("After Swapping: ");
		while(it.hasNext())
		{
			System.out.print(it.next()+" & ");
		}
	}
}
