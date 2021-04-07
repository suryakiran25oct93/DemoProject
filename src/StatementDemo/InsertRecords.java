package StatementDemo;
import java.sql.*;
import java.util.*;
public class InsertRecords
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
		  int eid;  String ename=null;   Double salary; String gender=null;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Employee ID");
		  eid = sc.nextInt();
		  System.out.println("Enter Employee Name");
		  ename = sc.next();
		  System.out.println("Enter Employee Salary");
		  salary = sc.nextDouble();
		  System.out.println("Enter Employee Gender");
		  gender = sc.next();
String qry = " insert into employee values ( "+eid+" , '"+ename+"' , "+salary+" , '"+gender+"')";
stmt.executeUpdate(qry);
System.out.println("Record is inserted");
	  }
	  catch(Exception e) 	  {  		  System.out.println(e);  	  }    }  }  