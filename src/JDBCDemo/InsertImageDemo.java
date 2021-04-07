package JDBCDemo;
import java.io.*;
import java.sql.*;
public class InsertImageDemo
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
			  
			  File file = new File("D://Images//klcse.JPG"); 
			  FileInputStream fis = new FileInputStream(file);
			  PreparedStatement pstmt = con.prepareStatement("  insert into person values(?,?)  ");
			  
			  pstmt.setString(1, "KLU");
			  pstmt.setBinaryStream(2, fis, (int)file.length());
			  pstmt.execute();
		
			  System.out.println("Process Done");
			  
			  fis.close();
			  con.close();
		 }
		 catch(Exception e)		 {			 System.out.println(e);		 }	 }    
}
