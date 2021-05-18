import java.sql.*;
public class connectDatabase {
	
	public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
        } catch (SQLException | ClassNotFoundException e) {
        }
        return connection;
    }

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_training","root","");
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
