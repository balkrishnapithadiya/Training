
import java.util.*;
public class reverseString {

	public static void main(String[] args) {
		Stack<Character> st = new Stack<Character>();
		String s1 = "Hello";
		char[] ch = s1.toCharArray();
		for(int i=0; i<ch.length;i++)
		{
			st.push(ch[i]);
		}
		for(int i=ch.length;i>0;i--)
		{
			System.out.print(st.pop()+" ");
		}
	}

}
