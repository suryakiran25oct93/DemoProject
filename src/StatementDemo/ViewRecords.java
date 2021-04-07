package StatementDemo;
import java.sql.*;
public class ViewRecords
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
		  
		  ResultSet rs = stmt.executeQuery("select count(*) from employee");
		  
		  if(rs.next())
		  {
			  System.out.println("Total Number of Employees="+rs.getInt(1));
		  }
		
	  }
	  catch(Exception e)  	  
	  {   		 
		  System.out.println(e);  	  
		  }    
	  }  
  }

