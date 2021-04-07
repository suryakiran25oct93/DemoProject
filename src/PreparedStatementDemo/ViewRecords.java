package PreparedStatementDemo;
import java.sql.*;
import java.util.*;
public class ViewRecords
{
  public static void main(String args[])
  {
	  try
	  {
		  Connection con = null;
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("Driver Class Loaded");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc", "root","root");
		  System.out.println("Connection Established");
	PreparedStatement pstmt = con.prepareStatement("select * from employee");  // execute this query using where condition also.
	ResultSet rs = pstmt.executeQuery();
int count=1;
while(rs.next())
{
	/*System.out.println("Employee Record-"+count);
	System.out.println("Employee ID:"+rs.getInt(1));
	System.out.println("Employee Name:"+rs.getString(2));
	System.out.println("Employee Salary:"+rs.getDouble(3));
	System.out.println("Employee Gender:"+rs.getString(4));
	count=count+1;*/
	System.out.println("Employee Record-"+count);
	System.out.println("Employee ID:"+rs.getInt("empid"));
	System.out.println("Employee Name:"+rs.getString("ename"));
	System.out.println("Employee Salary:"+rs.getDouble("salary"));
	System.out.println("Employee Gender:"+rs.getString("gender"));
	count=count+1;
}
	  }
	  catch(Exception e)   {    System.out.println(e);  	  }    }  }