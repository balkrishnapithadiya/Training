
import java.time.*;
import java.util.Scanner;
public class ageFromBirthDate {
	
	public int calcAge(LocalDate Dob)
    {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(Dob,currentDate).getYears();
        return age;
    }
	
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your birth date (yyyy-mm-dd format only) ");
        String st = sc.nextLine();
        
        LocalDate Dob;
        Dob = LocalDate.parse(st);    
        ageFromBirthDate obj = new ageFromBirthDate();
        int age = obj.calcAge(Dob);
        System.out.println("Age is :- "+age);
        sc.close();
    }
}
