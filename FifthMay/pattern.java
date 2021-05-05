import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		System.out.println("Please Enter The Rows: ");
		try(Scanner in = new Scanner(System.in)){
		int n = in.nextInt();
		in.close();
		for(int i=1; i<=n; i++)
		{
			for(int j=n-i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
}