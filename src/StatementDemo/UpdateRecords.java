package StatementDemo;
import java.sql.*;
import java.util.*;
public class UpdateRecords
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
		  String ename=null;
		  Double salary;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Employee ID for which you want to change the name");
		  eid = sc.nextInt();
		  System.out.println("Enter Employee Name:");
		  ename = sc.next();
		  System.out.println("Enter Employee Salary:");
		  salary = sc.nextDouble();
String qry = " update employee set ename = '"+ename+"' , salary = "+salary+" where empid = "+eid+" ";
int n = stmt.executeUpdate(qry);
System.out.println(n+" Record(s) are updated");
	  }
	  catch(Exception e)  	  {  		  System.out.println(e);  	  }    }  }  