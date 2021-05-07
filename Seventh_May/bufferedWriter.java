import java.io.*;
import java.util.Scanner;
public class bufferedWriter {

	public static void main(String[] args) {
		try {
		System.out.print("Please Enter The Text That You Want To Add In File: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		FileWriter fw = new FileWriter("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\bufferedWriter.txt");  
	    BufferedWriter bw = new BufferedWriter(fw);  
	    bw.write(str);  
	    bw.close();  
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
