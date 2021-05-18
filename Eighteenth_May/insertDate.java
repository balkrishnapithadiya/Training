import java.sql.*;

public class insertDate {
	connectDatabase cd = new connectDatabase();
	public void insertdate()
	{
		try
		{
			Connection con = cd.getConnection();
			PreparedStatement st = con.prepareStatement("Insert into student values name=?,age=?,roll=?,date=?");
			java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
			st.setString(1, "rajesh");
			st.setInt(2, 10);
			st.setInt(3, 110);
			st.setDate(4, sqlDate);
			st.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		insertDate id = new insertDate();
		id.insertdate();
	}

}
