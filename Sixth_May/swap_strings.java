import java.util.Scanner;

public class swap_strings {
	public static void main(String[] args) {
		System.out.print("Please Enter The First String: ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.print("Please Enter The Second String: ");
		String s2 = sc.nextLine();
		sc.close();
		s1=s1+s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After Swapping Strings Are: "+s1+" "+s2);
	}
}
