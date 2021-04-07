package JDBCDemo;
import java.io.*;
import java.sql.*;
public class RetrieveImageDemo
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
			  File file = new File("D:\\klef.JPG");
			  FileOutputStream fos = new FileOutputStream(file);
			  byte b[];
			  Blob blob;
			  PreparedStatement pstmt = con.prepareStatement(" select * from person where name='KLU' ");
			  ResultSet rs = pstmt.executeQuery();
			  if(rs.next())
			  {
				  blob =rs.getBlob("imagedata");
				  b = blob.getBytes(1, (int)blob.length());
				  fos.write(b);
			  }
			  fos.close();
			  con.close();
		 }
		 catch(Exception e)  {   System.out.println(e);  }  }  }
