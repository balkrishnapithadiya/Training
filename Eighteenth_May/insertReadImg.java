import java.sql.*;
import java.io.*;
public class insertReadImg {
	
	connectDatabase cd = new connectDatabase();
	
	public void insertImg()
	{
		try
		{
			Connection con = cd.getConnection();
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO img VALUES(?,?)");
		    pstmt.setString(1, "sample image");
		    InputStream in = new FileInputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\EighteenthMayPrograms\\1.jpg");
		    pstmt.setBlob(2, in);
		    pstmt.execute();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void readImg()
	{
		try
		{
			Connection con = cd.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from img");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next())
			{                
				Blob b=rs.getBlob(2);  
				byte barr[]=b.getBytes(1,(int)b.length());        
				FileOutputStream fout=new FileOutputStream("E:\\Office-Training-2021\\Office-Trainning-2021-Programs\\EighteenthMayPrograms");  
				fout.write(barr);    
				fout.close();  
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		insertReadImg ir = new insertReadImg();
		ir.insertImg();
		ir.readImg();

	}

}
