import java.util.Scanner;
public class sunny_number {
	
	public boolean check_sunny(int n) {
		double sqrt = Math.sqrt((double)(n+1));
		if((sqrt-Math.floor(sqrt))==0){
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Please Enter The Number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		sunny_number obj = new sunny_number();
		boolean result = obj.check_sunny(n);
		if(result) {
			System.out.println(n+" is a sunny number");
		}
		else {
			System.out.println(n+" is not a sunny number");
		}
	}

}
