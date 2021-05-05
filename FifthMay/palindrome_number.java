import java.util.Scanner;

public class palindrome_number {
	
	public void check_palindrome(int n) {
		int r, rn=0;
		int n1 = n;
		boolean result;
		while(n>0)
		{
			r = n%10;
			rn = (rn*10)+r;
			n = n/10;
		}
		if(n1==rn) {
			result = true;
		}
		else {
			result = false;
			}
		if(result) {
			System.out.println(n1+" is a palindrome number");
		}
		else {
			System.out.println(n1+" is not a palindrome number");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter The Number: ");
		try(Scanner in = new Scanner(System.in)){
		int n = in.nextInt();
		palindrome_number obj = new palindrome_number();
		obj.check_palindrome(n);
		in.close();
		}
	}
}

