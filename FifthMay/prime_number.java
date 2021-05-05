import java.util.*;
public class prime_number {

	public void check_prime(int n) {
		if(n<1) {
			System.out.println("Please Enter Positive Number");
		}
		else if (n==1) {
			System.out.println(n+" is a Prime Number");
		}
		else if (n>=2) {
			for(int i=2; i<=n/2; i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is Not a Prime Number");
				}
				else
				{
					System.out.println(n+" is a Prime Number");
				}
			}
		}
		else {
			System.out.println("Please Enter A valid Number");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter The Number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		prime_number obj = new prime_number();
		obj.check_prime(n);
	}

}
