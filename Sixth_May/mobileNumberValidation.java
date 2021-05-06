import java.util.Scanner;

public class mobileNumberValidation {
	public static void main(String[] args) {
		System.out.print("Please Enter Your Mobile Number: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String regex = "(0/91)?[7-9][0-9]{9}";
		if(str.matches(regex)) {
			System.out.print("Your Mobile Number "+str+ " is valid");
			
		}
		else {
			System.out.print("Your Mobile Number "+str+ " is not valid");
		}
	}
}
