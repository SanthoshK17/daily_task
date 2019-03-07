package packageDmo;

import java.sql.*;


public class JDBC_innsertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement stmt = null;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",""); 
		
		stmt = con.createStatement(); 
		String sql = "INSERT INTO STUDENTS " +
                "VALUES (100,'Drake',77,83,75)";
		 stmt.executeUpdate(sql);
		 sql = "INSERT INTO STUDENTS " +
	                "VALUES (101,'CJ',90,98,54)";
			 stmt.executeUpdate(sql);
			 sql = "INSERT INTO STUDENTS " +
		                "VALUES (102,'Tommy Vinceti',67,80,91)";
				 stmt.executeUpdate(sql);
				 System.out.println("Inserted records into the table...");
		}
		catch(ClassNotFoundException | SQLException e)
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
