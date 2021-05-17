import java.util.Scanner;

public class fibo extends Thread {

	int n;
	public void run()
	{
		int a=0,b=1,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter Number of Terms: ");
		this.n = sc.nextInt();
		int n1=this.n;
		System.out.print("Finbonacci Series: ");
		while (n1>0)
        {
             System.out.print(c+" ");
             a=b;
             b=c;
             c=a+b;
             n1=n1-1;
        }
		System.out.println();
		sc.close();
	}
}
