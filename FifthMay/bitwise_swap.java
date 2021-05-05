import java.util.Scanner;
public class bitwise_swap{
	public static void main(String args[]) {
		int number1, number2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1st number:");
		number1 = scanner.nextInt();
		System.out.print("Enter 2nd number:");
		number2 = scanner.nextInt();
		number1 = number1 ^ number2;
		number2 = number1 ^ number2;
		number1 = number1 ^ number2;
		scanner.close();
		System.out.println("1st number after swapping:"+number1);
		System.out.println("2nd number after swapping:"+number2);
	}
}
