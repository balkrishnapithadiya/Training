import java.util.Scanner;

public class sum_of_natural_numbers {
	
	public void without_loop(int n) {
		if(n<=0) {
			System.out.println("Please Enter Positive Integer");
		}
		else {
			int sum = (n*(n+1))/2;
			System.out.print("The Sum is(without loop) : " +sum);
		}
	}
	
	public void with_loop(int n) {
		int suml=0;
		if(n<=0) {
			System.out.println("Please Enter Positive Integer");
		}
		else {
			for(int i=0; i<=n; i++)
			{
				suml = suml+i;
			}
			System.out.print("The Sum is(with loop) : " +suml);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter The Natural Number: ");
		try(Scanner in = new Scanner(System.in)){
		int n = in.nextInt();
		in.close();
		sum_of_natural_numbers obj = new sum_of_natural_numbers();
		obj.with_loop(n);
		}
	}
}