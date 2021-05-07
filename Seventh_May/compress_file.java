import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
public class compress_file {
	public static void main(String [] args)
	{
		try
		{
			FileOutputStream fs = new FileOutputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\zip.txt");
			fs.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		try
		{
		 String sourceFile = "E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\zip.txt";
		  FileOutputStream fos = new FileOutputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\compressed.zip");
		  ZipOutputStream zipOut = new ZipOutputStream(fos);
		  File fileToZip = new File(sourceFile);
		  FileInputStream fis = new FileInputStream(fileToZip);

		  ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		  zipOut.putNextEntry(zipEntry);
		  byte[] bytes = new byte[1024];
		  int length;
		  while ((length = fis.read(bytes)) >= 0) {
		   zipOut.write(bytes, 0, length);
		  }
		  zipOut.close();
		  fis.close();
		  fos.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
