import java.util.Scanner;

public class reverse_number {
	
	public void check(int n) {
		int r,reversenumber=0, original=n;
		while(n>0)
		{
			r = n%10;
			reversenumber = (reversenumber*10)+r;
			n/=10;
		}
		System.out.println("Reverse Number of "+original+" is "+reversenumber);
	}

	public static void main(String[] args) {
		System.out.println("Please Enter The Number: ");
		try(Scanner in = new Scanner(System.in)){
		int n = in.nextInt();
		in.close();
		reverse_number obj = new reverse_number();
		obj.check(n);	
	}
}

}
