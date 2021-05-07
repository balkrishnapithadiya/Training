import java.io.*;
import java.util.Scanner;

public class append {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press-1 to append content with filewriter and bufferwriter");
		System.out.println("press-2 to append content with printwriter");
		System.out.print("Enter Your Choice: ");
		int ch = sc.nextInt();
		System.out.print("Please Enter The Text That You Want To Add In File: ");
		String str = sc.nextLine();
		sc.close();
		switch(ch){
		case 1:
			appendwithfilebuffer(str);
			break;
		case 2:
			appendwithprintwritter(str);
			break;
			default:
				System.out.println("Please Enter Valid Choice");
		}
	}
	
	public static void appendwithfilebuffer(String str)
	{
		try
		{
			File f = new File("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\bufferedWriter.txt");
			FileWriter fw = new FileWriter(f,true);
			BufferedWriter bw = new BufferedWriter(fw);
	    	bw.write(str);
	    	bw.close();

		}catch(Exception e) {
			
		}
	}
	
	public static void appendwithprintwritter(String str)
	{
		try
		{
			File f = new File("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\bufferedWriter.txt");
			FileWriter fw = new FileWriter(f,true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(str);
	    	bw.close();
	    	pw.close();

		}catch(Exception e) {
			
		}
	}
}



