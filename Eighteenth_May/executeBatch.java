import java.sql.*;
public class executeBatch {
	connectDatabase cd = new connectDatabase();
	public void addBatch()
	{
		try
		{
			Connection con = cd.getConnection();
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			st.addBatch("insert into student(name,age,roll) value ('dharmesh',14,102)");
			st.addBatch("insert into student(name,age,roll) value ('ram',13,104)");
			st.addBatch("insert into student(name,age,roll) value ('sneh',16,105)");
			st.executeBatch();
			con.commit();  
			con.close();  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		executeBatch eb = new executeBatch();
		eb.addBatch();
		System.out.print("Records Added");
	}

}
