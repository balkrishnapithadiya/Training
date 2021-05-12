import java.util.*;
public class searchInSinglyLL {
	public static void main(String [] args)
	{
		LinkedList <Integer> l1 = new LinkedList <Integer> ();
		l1.add(1);
		l1.add(2);
		l1.add(50);
		l1.add(43);
		l1.add(35);
		l1.add(68);
		int found=0;
		boolean flag = false;
		int search = 40;
		for(int i=0;i<l1.size();i++)
		{
			if(l1.get(i)==search)
			{
				found += l1.indexOf(search);
				flag=true;
			}
			
		}
		if(flag==true)
		{
			System.out.print("Search Found At Index: "+found);
		}
		else {
			System.out.print("Search Not Found");
		}
	}
}

