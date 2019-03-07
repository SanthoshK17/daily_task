package packageDmo;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Composite_conflict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s;
		Connection con = null;
		Statement stmt = null;
		int opt=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",""); 
			
			stmt = con.createStatement(); 
			String sql = "CREATE TABLE COMP_TEST_1" + "(ID INTEGER not NULL, " +
	                "Reg_No INTEGER not NULL,"+
					" Name VARCHAR(255), " + 
	                " Marks_SCI INTEGER, " + 
	                " Marks_MATH INTEGER, " + 
	                " Marks_LANG INTEGER, " + 
	                " PRIMARY KEY ( ID,Reg_No))";
		      stmt.executeUpdate(sql);
		      System.out.println("Table created successfully...");
		      
		      sql = "INSERT INTO COMP_TEST " +
		                "VALUES (100,1401,'Drake',77,83,75)";
				 stmt.executeUpdate(sql);
				 sql = "INSERT INTO COMP_TEST " +
			                "VALUES (100,1401,'Brake',73,13,45)";
					 stmt.executeUpdate(sql);
					 sql = "INSERT INTO COMP_TEST " +
				                "VALUES (101,1401,'Kane',97,93,85)";
						 stmt.executeUpdate(sql);
		
			System.out.println("Data inserted successfully...");			
			
			 sql= "Select * from COMP_TEST";
				ResultSet rs= stmt.executeQuery(sql);
				 while(rs.next())
				 {
					 int ID = rs.getInt("ID");
					 int Reg_No = rs.getInt("Reg_No");
					 String name= rs.getString("Name");
					 int M_SCI = rs.getInt("Marks_SCI");
					 int M_MATH = rs.getInt("Marks_MATH");
					 int M_LANG = rs.getInt("Marks_LANG");
					 
					 System.out.println("ID ="+ ID);
					 System.out.println("Reg_No ="+ Reg_No);
					 System.out.println("Name ="+ name);
					 System.out.println("Marks scored in Science ="+ M_SCI);
					 System.out.println("Marks scored in Mathematics ="+ M_MATH);
					 System.out.println("Marks scored in Language ="+ M_LANG);
					 
					 System.out.println("");
					 System.out.println("");
				 }
				 
			
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
