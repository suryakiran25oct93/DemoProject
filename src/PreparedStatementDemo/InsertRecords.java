package PreparedStatementDemo;
import java.sql.*;
import java.util.*;
public class InsertRecords
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
		  int eid;   String ename=null;   Double salary;   String gender=null;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Employee ID:");
		  eid = sc.nextInt();
		  System.out.println("Enter Employee Name:");
		  ename = sc.next();
		  System.out.println("Enter Employee Salary:");
		  salary = sc.nextDouble();
		  System.out.println("Enter Employee Gender:");
		  gender = sc.next();
PreparedStatement pstmt = con.prepareStatement(" insert into employee values (?,?,?,?) ");
pstmt.setInt(1, eid);      pstmt.setDouble(3, salary);     pstmt.setString(2, ename);     pstmt.setString(4, gender);
pstmt.execute();
		  System.out.println("Record is Inserted");
	  }
	  catch(Exception e)     {  	  System.out.println(e);  	  }    }  }