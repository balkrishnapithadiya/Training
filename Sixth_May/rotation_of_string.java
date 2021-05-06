import java.util.Scanner;
public class rotation_of_string {

	public static void main(String[] args) {
		System.out.print("Please Enter The String: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter first string :");
		String str1 = sc.nextLine();
		System.out.print("please enter second string :");
		String str2 = sc.nextLine();
		sc.close();
	        if(str1.length() != str2.length()){  
	            System.out.println(str2+" is not a rotation of "+str1);  
	        }  
	        else {    
	            str1 = str1.concat(str1);  
  
	            if(str1.indexOf(str2) != -1)  
	            	System.out.println(str2+" is a rotation of "+str1); 
	            else  
	            	System.out.println(str2+" is not a rotation of "+str1);  
	        }  
	    }  

}
