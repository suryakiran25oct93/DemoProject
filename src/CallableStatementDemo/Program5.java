package CallableStatementDemo;
import java.sql.*;

public class Program5
{
  public static void main(String args[])
  {
	  try
	  {
		  Connection con = null;
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  System.out.println("Driver Class Loaded");
		  con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "ep","ep");
		  System.out.println("Connection Established");
		  
		  CallableStatement cstmt = con.prepareCall(" {call deleterecord(?)}  "); //deleting record by using id
		  cstmt.setInt(1, 3);
		  
		  int n = cstmt.executeUpdate();
		
		  System.out.println(n+" Record(s) Deleted"); 
		  
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
