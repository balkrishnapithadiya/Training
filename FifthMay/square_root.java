import java.util.Scanner;

public class square_root {

	public double sqrt(int number) {
		double temp;
	 
		double sr = number / 2;
	 
		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
		} while ((temp - sr) != 0);
	 
		return sr;
	}
	
	public static void main(String[] args) {
		System.out.println("Please Enter The Number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		square_root obj = new square_root();
		double result = obj.sqrt(n);
		System.out.println("Square Root Of "+n+" is "+result);
	}

}
