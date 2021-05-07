import java.io.*;
public class create_text_file {
	public static void main(String [] args)
	{
		try
		{
			FileOutputStream fs = new FileOutputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\text_file.txt");
			fs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
