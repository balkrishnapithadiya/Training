import java.util.*;

public class random_numbers {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.print("Please Enter The Lower Limit: ");
		try(Scanner in = new Scanner(System.in)){
		int l = in.nextInt();
		System.out.print("Please Enter The Upper Limit: ");
		int u = in.nextInt();
		System.out.println("Random Values Between "+l+" and "+u+" is :");
		int result = r.nextInt(u-l) + l;
		System.out.println(result);
		in.close();
	}
}
}