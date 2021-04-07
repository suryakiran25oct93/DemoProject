package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class MYSQLDBConnection 
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
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
   }
}
