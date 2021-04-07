package JDBCDemo;
import java.io.*;
import java.sql.*;
public class InsertFileDemo 
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
			  
			  File file = new File("D://sample.txt");
			  FileReader fr = new FileReader(file);
			  FileInputStream fis = new FileInputStream(file);
			  
			  PreparedStatement pstmt = con.prepareStatement("  insert into test values(?,?,?) ");
			  pstmt.setInt(1, 102);
			  pstmt.setString(2, "sample.txt");
			  pstmt.setCharacterStream(3, fr, (int)file.length());
			  pstmt.execute();
			  System.out.println("Record Inserted");
			 fis.close();
			 con.close(); 
		 }
		 catch(Exception e)	 {			 System.out.println(e);		 }	 }
}
