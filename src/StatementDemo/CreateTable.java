package StatementDemo;
import java.sql.*;

public class CreateTable
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
		  
String qry = "create table employee (empid integer primary key, ename varchar(30) not null, salary decimal (10,4) not null, gender varchar(10))";

stmt.executeUpdate(qry);

System.out.println("Table Created");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
