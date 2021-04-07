package StatementDemo;
import java.sql.*;
import java.util.*;

public class DeleteRecords
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
		  int eid;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Employee ID for which you want to delete");
		  eid = sc.nextInt();
String qry = " delete from employee where empid = '"+eid+"'  ";
//String qry = " delete from employee";  // It will remove all records in table that is equal to truncate table employee
int n = stmt.executeUpdate(qry);
System.out.println(n+" Record(s) are deleted");		  
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
