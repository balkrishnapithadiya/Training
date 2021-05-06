import java.util.*;
public class int_to_string {

	public static void main(String[] args) {
		System.out.print("Please Enter The Integer Value :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = String.valueOf(a);
		System.out.println("Value Of Integer Number Is: "+b);
		sc.close();
	}

}
