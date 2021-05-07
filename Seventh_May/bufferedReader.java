import java.io.*;
public class bufferedReader {
	public static void main(String[] args)
    {
        File f = new File("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\SeventhMayPrograms\\src\\text_file.txt");
 
        try (BufferedReader br = new BufferedReader(new FileReader(f)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
