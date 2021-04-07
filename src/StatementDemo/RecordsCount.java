package StatementDemo;
import java.sql.*;
import java.util.*;
public class RecordsCount
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
		 // System.out.println("Enter Employee ID");
		 // eid = sc.nextInt();
String qry = " select * from employee ";
//String qry = " select * from employee where "+eid+" ";
ResultSet rs = stmt.executeQuery(qry);
int count=1;
while(rs.next())
{
	/*System.out.println("*****Employee Record-"+count+"*****");
	System.out.println("Employee ID:"+rs.getInt(1));
	System.out.println("Employee Name:"+rs.getString(2));
	System.out.println("Employee Salary:"+rs.getDouble(3));
	System.out.println("Employee Gender:"+rs.getString(4));
	count=count+1;*/
	System.out.println("*****Employee Record-"+count+"*****");
	System.out.println("Employee Record-"+count);
	System.out.println("Employee ID:"+rs.getInt("empid"));
	System.out.println("Employee Name:"+rs.getString("ename"));
	System.out.println("Employee Salary:"+rs.getDouble("salary"));
	System.out.println("Employee Gender:"+rs.getString("gender"));
	count=count+1;
}
	  }
	  catch(Exception e)  	  {   		  System.out.println(e);  	  }    }  }

