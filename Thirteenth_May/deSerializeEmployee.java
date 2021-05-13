
import java.io.*;
public class deSerializeEmployee {

	public static void main(String[] args) {
		try
		{   
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\thirteenthMayPrograms\\src\\employee.txt"));  
		  employee e=(employee)in.readObject();  
		  System.out.println(e.eid+" "+e.Name+" "+e.salary);    
		  in.close();  
		  }catch(Exception e){
			  System.out.println(e);
			  }  

	}

}
