package StatementDemo;
import java.sql.*;
public class ResultSetMetaDataDemo
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
		  ResultSet rs = con.createStatement().executeQuery("select * from employee");
		  ResultSetMetaData rsmd = rs.getMetaData();
		  int count = rsmd.getColumnCount();
		  System.out.println("Number of Columns="+count);
for(int i=1;i<=count;i++)
{
  System.out.println(rsmd.getColumnName(i));
  System.out.println(rsmd.getColumnLabel(i));
  System.out.println(rsmd.getColumnClassName(i)); // Java Class Name
  System.out.println(rsmd.getColumnDisplaySize(i));
  System.out.println(rsmd.getColumnType(i));//Fixed Integer value denotes the SQL type of the column
  System.out.println(rsmd.getColumnTypeName(i));
  System.out.println(rsmd.getPrecision(i)); //decimal(10,4) where Precision = 10 & Scale = 4
  System.out.println(rsmd.getScale(i));
 }
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
}
