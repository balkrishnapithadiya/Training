import java.util.Scanner;

public class factorial {
	
	public void calculate_fact(int n) {
		int fact=1;
		if(n==1)
		{
			System.out.println("The Factorial Of "+n+" is "+n);
		}
		else {
			for(int i=1; i<=n; i++)
			{
				fact = fact*i;
			}
		}
		System.out.println("The Factorial Of "+n+" is "+fact);
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter The Number: ");
		try(Scanner in = new Scanner(System.in)){
		int n = in.nextInt();
		in.close();
		factorial obj = new factorial();
		obj.calculate_fact(n);
		}
	}
}