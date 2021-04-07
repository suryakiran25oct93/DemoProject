package CallableStatementDemo;
import java.sql.*;
import java.util.*;

public class Program6
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
		  
		  
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
