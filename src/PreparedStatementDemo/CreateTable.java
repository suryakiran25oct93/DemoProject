package PreparedStatementDemo;
import java.sql.*;
public class CreateTable
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
String qry = "create table employee (empid int primary key, ename varchar(30) not null, salary decimal (10,4) not null, gender varchar(10))";
PreparedStatement pstmt = con.prepareStatement(qry);
pstmt.execute();
System.out.println("Table Created");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
