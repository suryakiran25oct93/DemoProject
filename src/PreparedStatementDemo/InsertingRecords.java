package PreparedStatementDemo;
import java.sql.*;
import java.util.*;
public class InsertingRecords 
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
			  
			  int id=0;
			  String name=null,gender=null;
			  int n;
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter number of records that you want to insert?");
			  n = sc.nextInt();
			  PreparedStatement pstmt = con.prepareStatement("  insert into emp values(?,?,?) ");
			  int i=1;
			  while(i<=n)
			  {
				  System.out.println("Enter ID");
				  id = sc.nextInt();
				  System.out.println("Enter Name");
				  name = sc.next();
				  System.out.println("Enter Gender");
				  gender = sc.next();
				  
				  pstmt.setInt(1, id);
				  pstmt.setString(2, name);
				  pstmt.setString(3,gender);
				  pstmt.executeUpdate();			
				  i++;
			  }
                  System.out.println("done");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
}
}
