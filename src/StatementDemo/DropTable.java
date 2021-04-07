package StatementDemo;
import java.sql.*;

public class DropTable
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
String qry = " drop table employee ";
stmt.executeUpdate(qry);
System.out.println("Table is dropped");

	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
