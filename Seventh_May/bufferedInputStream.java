import java.io.*;
public class bufferedInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\text_file.txt");    
		    BufferedInputStream bis = new BufferedInputStream(fs);    
		    int i;    
		    while((i=bis.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bis.close();    
		    fs.close();    
		}catch(Exception e) {
			System.out.println(e);
			}
		}
}
