import java.sql.*;
public class joins {
	connectDatabase cd = new connectDatabase();
	public void innerJoin()
	{
		try
		{
			Connection con = cd.getConnection();
			String select = "SELECT employee.dept_id, employee.name, dept.dept_name from employee inner join dept on employee.dept_id=dept.dept_id";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("dept_id")+" Name: "+rs.getString("Name")+" And Department: "+rs.getString("dept_name"));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void leftJoin()
	{
		try
		{
			Connection con = cd.getConnection();
			String select = "SELECT employee.dept_id, employee.name, dept.dept_name from employee left join dept on employee.dept_id=dept.dept_id";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("dept_id")+" Name: "+rs.getString("Name")+" And Department: "+rs.getString("dept_name"));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void rightJoin()
	{
		try
		{
			Connection con = cd.getConnection();
			String select = "SELECT employee.dept_id, employee.name, dept.dept_name from employee right join dept on employee.dept_id=dept.dept_id";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("dept_id")+" Name: "+rs.getString("Name")+" And Department: "+rs.getString("dept_name"));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void fullJoin()
	{
		try
		{
			Connection con = cd.getConnection();
			String select = "SELECT employee.dept_id, employee.name, dept.dept_name from employee full outer join dept on employee.dept_id=dept.dept_id";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(select);
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("dept_id")+" Name: "+rs.getString("Name")+" And Department: "+rs.getString("dept_name"));
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		joins j = new joins();
		System.out.println("Inner Join");
		j.innerJoin();
		System.out.println();
		System.out.println("Left Join");
		j.leftJoin();
		System.out.println();
		System.out.println("Right Join");
		j.rightJoin();
		System.out.println();
		System.out.println("Full Outer Join");
		j.fullJoin();

	}

}
