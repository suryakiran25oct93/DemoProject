package PreparedStatementDemo;
import java.sql.*;
public class DropTable
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
PreparedStatement pstmt = con.prepareStatement("  drop table employee ");
pstmt.execute();
System.out.println("Table is Dropped");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
