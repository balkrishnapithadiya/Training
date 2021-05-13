import java.io.*;
public class employee implements Serializable {
	private static final long serialVersionUID = 1L;
	int eid;
	String Name;
	double salary;
	
	employee(int id, String n, double s)
	{
		this.eid=id;
		this.Name=n;
		this.salary=s;
	}
	public static void main(String[] args) {
		try {
			employee e = new employee(1,"Raj",45000);
			FileOutputStream fout=new FileOutputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\thirteenthMayPrograms\\src\\employee.txt");  
			  ObjectOutputStream out=new ObjectOutputStream(fout);  
			  out.writeObject(e);  
			  out.flush();    
			  out.close();
		}catch(Exception e)
		{
			System.out.print(e);
		}
	}

}
