import java.util.*;
public class vowels_and_consonants {

	public static void main(String[] args) {
		System.out.print("Please Enter The String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int vowels=0,consonants=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				vowels++;
			}
			else if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("In String "+str+ " There is/are "+vowels+ " Vowels and "+consonants+ " Consonants");
	}

}
