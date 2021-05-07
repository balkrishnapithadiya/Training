import java.io.FileOutputStream;
import java.util.*;
public class fileOutputStream {
	public static void main(String [] args)
	{
		System.out.print("Please Enter The Text That You Want To Add In File: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		byte b[] = str.getBytes();
		try
		{
			FileOutputStream fs = new FileOutputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\output.txt");
			fs.write(b);    
            fs.close();    
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
