package PreparedStatementDemo;
import java.sql.*;
import java.util.*;
public class UpdateRecords
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
		  String ename=null;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Employee ID for which you want to change the name");
		  eid = sc.nextInt();
		  System.out.println("Enter Employee Name:");
		  ename = sc.next();
PreparedStatement pstmt = con.prepareStatement(" update employee set ename=? where empid=? ");
pstmt.setString(1, ename);
pstmt.setInt(2, eid);
int n = pstmt.executeUpdate();
System.out.println(n+" Record(s) Updated");
	  }
	  catch(Exception e)  {		  System.out.println(e); 	  }   	  
	  }      
  }
