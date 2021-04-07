package CallableStatementDemo;
import java.sql.*;
public class Program1
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
		  
	      CallableStatement cstmt = con.prepareCall(" {call insertrecord(?,?,?)}  ");
		 cstmt.setInt(1,3);
		 cstmt.setString(2, "KLEF");
		 cstmt.setString(3,"male");
		 cstmt.execute(); // or you can use cstmt.executeUpdate() also
		 System.out.println("Record is inserted");
		 
		 con.close();  //closing the connection
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
