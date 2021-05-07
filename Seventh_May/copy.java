import java.util.*;
import java.io.*;
public class copy {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);  
		  System.out.print("Enter source file name :");  
		  String sf = sc.next();  
		  System.out.print("Enter destination file name :");  
		  String df = sc.next();
		  sc.close();
		  try {
			  FileReader fr = new FileReader("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\"+sf+".txt");  
			  FileWriter fw = new FileWriter("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\"+df+".txt", true);  
			  int c;  
			  while ((c = fr.read()) != -1) {  
			   fw.write(c);  
			  }   
			  fr.close();  
			  fw.close();  
		  }catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  
	}
}
