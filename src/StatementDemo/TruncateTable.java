package StatementDemo;
import java.sql.*;
public class TruncateTable
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
		  
		  Statement stmt = con.createStatement();
		  
String qry = " truncate table employee ";

stmt.executeUpdate(qry);

System.out.println("Table is truncated");

	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
