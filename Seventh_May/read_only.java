import java.io.*;

public class read_only {
	public static void main(String [] args) {
		try
		{
			FileOutputStream fs = new FileOutputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\readme.txt");
			fs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		File f = new File("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\readme.txt");
		if(f.setReadOnly())
		{
			System.out.println("Suceess");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}
}
