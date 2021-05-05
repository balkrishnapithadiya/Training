import java.util.*;
public class calculate_intial_amount {
	int not;
	float da;
	
	public calculate_intial_amount(int numberoftemples, float donation_amount)
	{
		this.not=numberoftemples;
		this.da=donation_amount;
	}
	
	public void calculate_value()
	{
		int not1 = this.not;
		float da = this.da;
		float total_amount=0, amt=2;
		for(int i=1; i<=not1; i++)
		{
			total_amount=(total_amount*2)+da;
			amt *= 2;
		}
		float final_initial_amount = total_amount/(amt/2);
		System.out.println("The Intial Amount Is: "+final_initial_amount);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter The Number Of Temples Visited: ");
		int numberoftemples = sc.nextInt();
		System.out.print("Please Enter The Donation Amount Per Temple: ");
		float donation_amount = sc.nextFloat();
		sc.close();
		calculate_intial_amount obj = new calculate_intial_amount(numberoftemples, donation_amount);
		obj.calculate_value();
	}
}
