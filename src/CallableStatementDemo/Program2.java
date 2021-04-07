package CallableStatementDemo;
import java.sql.*;
public class Program2
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
		  
	     CallableStatement cstmt = con.prepareCall(" {call empcount(?)}  "); // Total Number of Employees in EMP Table
		 cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
		 cstmt.executeUpdate();
		 
		 System.out.println("Total Count:"+cstmt.getInt(1));
		 
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
