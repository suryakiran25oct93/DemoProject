package CallableStatementDemo;
import java.sql.*;
public class Program3
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
		  
		  
		  CallableStatement cstmt = con.prepareCall(" {call displaynamebyid(?,?)}  ");  // Displaying name using id
		  cstmt.setInt(1, 3);
		  cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
		  cstmt.execute(); // or you can use cstmt.executeUpdate() also
			 
		  System.out.println("Emp Name:"+cstmt.getString(2));
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
