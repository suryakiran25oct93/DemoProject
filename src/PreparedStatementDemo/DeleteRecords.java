package PreparedStatementDemo;
import java.sql.*;
import java.util.*;

public class DeleteRecords
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
		  int eid;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Employee ID to delete");
		  eid = sc.nextInt();
PreparedStatement pstmt = con.prepareStatement(" delete from employee where empid=? ");
pstmt.setInt(1, eid);
int n = pstmt.executeUpdate();
System.out.println(n+" Record(s) Deleted");		  
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
