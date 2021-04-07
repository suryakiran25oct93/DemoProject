package StatementDemo;
import java.sql.*;

public class AlterTable
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
		  
String qry = " alter table employee add (dept varchar(20) default 'CSE')";

stmt.executeUpdate(qry);

System.out.println("Table is Altered");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
