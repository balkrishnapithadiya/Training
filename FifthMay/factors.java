import java.util.Scanner;

public class factors {
	
	public void factor(int n) {
		System.out.print("The Factors Of "+n+" are: ");
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter The Number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		factors obj = new factors();
		obj.factor(n);
		}
	}
