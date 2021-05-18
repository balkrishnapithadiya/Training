import java.sql.*;
public class commitandrollback {

	public static void main(String[] args) throws SQLException {
		connectDatabase cd = new connectDatabase();
		Connection con = cd.getConnection();
		con.setAutoCommit(false);
		try
		{
		     Statement stmt=con.createStatement();
		     String query1="INSERT INTO dept(dept_id,dept_name) VALUES(22,'sanskrit')";
		     stmt.executeUpdate(query1);
		     String query2="INSERT INTO employee(name,age,dept_id) VALUES('sneh',25,22)";
		     stmt.executeUpdate(query2);
		     con.commit();
		     System.out.println("Row Inserted");
		     
		 } 
		 catch (SQLException e) 
		 {
		     con.rollback();
		     e.printStackTrace();
		     con.close();
		 }
	}

}
