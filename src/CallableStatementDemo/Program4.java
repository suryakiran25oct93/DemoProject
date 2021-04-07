package CallableStatementDemo;
import java.sql.*;

public class Program4
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
		  
		  CallableStatement cstmt = con.prepareCall(" {call updaterecord(?,?)}  "); //updating name using id
		  cstmt.setInt(1, 3);
		  cstmt.setString(2, "KLU");
		  
		  int n = cstmt.executeUpdate();
		
		  System.out.println(n+" Record(s) Updated"); 
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
