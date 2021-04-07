package JDBCDemo;

import java.sql.*;

public class DBConnectionDemo 
{
	public static void main(String args[])
	{
		try
		{
			Driver d = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			System.out.println("Driver Class Loaded");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ep","ep");
			
			System.out.println("Connected");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
