import java.util.Scanner;

public class LengthMatchException {

	public static void main(String[] args) {
		System.out.print("Please Enter The String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print("Please Enter The Length Of Entered String: ");
		int length = sc.nextInt();
		sc.close();
		try
		{ 
			validateLength(str, length);
		}
		catch(Exception e){System.out.println("Exception occured: "+e);}
	}
	
	public static void validateLength(String s, int length)throws invalidLengthException
	{
		if(s.length()!=length)
		{
			throw new invalidLengthException("Length are not same");
		}
		else
		{
			System.out.println("Length are same");
		}
	}

}

class invalidLengthException extends Exception{  
	 invalidLengthException(String s){  
	  super(s);  
	 }  
	}  

