import java.util.*;
public class calculator {

	public static void main(String[] args) {
		double num1=0.0, num2=0.0;
	      int ch=0;
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter two numbers: ");
	      num1 = scan.nextDouble();
	      num2 = scan.nextDouble();

	      System.out.println("1-for addition");
	      System.out.println("2-for subtraction");
	      System.out.println("3-for multiplication");
	      System.out.println("4-for division");
	      System.out.println("5-for modulo");
	      System.out.println("6-for power");
	      System.out.print("Enter Your Choice: ");
	      ch = scan.nextInt();

	      switch(ch) {

	         case 1:
	            System.out.println("Result = "+ (num1+num2));
	            break;

			 case 2:
			    System.out.println("Result = "+ (num1-num2));
				break;
	
			 case 3:
			    System.out.println("Result = "+ (num1*num2));
				break;
	
			 case 4:
			    System.out.println("Result = "+ (num1/num2));
				break;
	
			 case 5:
			    System.out.println("Result = "+ (num1%num2));
				break;
	
			 case 6:
			    System.out.println("Result = "+ 
		                               Math.pow(num1,num2));
				break;
	
			 default:
			    System.out.println("Invalid operator");
	      } 
	      scan.close();

	}

}
