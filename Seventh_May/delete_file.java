import java.io.*;
public class delete_file {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fs = new FileOutputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\delete.txt");
			fs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		File file = new File("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\delete.txt");
        if(file.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }

	}

}
