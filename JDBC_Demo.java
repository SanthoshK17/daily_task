package packageDmo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement stmt = null;
		try
		{
		Class.forName("com.mysql.jdbc.Driver"); 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",""); 
		
		stmt = con.createStatement(); 
		String sql = "CREATE TABLE STUDENTS_1" + "(ID INTEGER not NULL, " +
                " Name VARCHAR(255), " + 
                " Marks_SCI INTEGER, " + 
                " Marks_MATH INTEGER, " + 
                " Marks_LANG INTEGER, " + 
                " PRIMARY KEY ( ID ))";
	      stmt.executeUpdate(sql);
	      System.out.println("Table created successfully...");
		
		}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		finally
		{
			 try
			 {
		         if(stmt!=null)
		            stmt.close();
		      }
			 catch(SQLException se2)
			 {
		     se2.printStackTrace(); 
			 }
		      try
		      {
		         if(con!=null)
		            con.close();
		      }
		      catch(SQLException se)
		      {
		    	  se.printStackTrace(); 
		      }
		         
		}

	}

}
