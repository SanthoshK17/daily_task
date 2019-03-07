package packageDmo;

import java.sql.*;
 
public class JDBC_selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		Statement stmt = null;
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",""); 
		
		stmt = con.createStatement(); 
		String sql= "Select * from STUDENTS";
		ResultSet rs= stmt.executeQuery(sql);
		 while(rs.next())
		 {
			 int ID = rs.getInt("ID");
			 String name= rs.getString("Name");
			 int M_SCI = rs.getInt("Marks_SCI");
			 int M_MATH = rs.getInt("Marks_MATH");
			 int M_LANG = rs.getInt("Marks_LANG");
			 
			 System.out.println("ID ="+ ID);
			 System.out.println("Name ="+ name);
			 System.out.println("Marks scored in Science ="+ M_SCI);
			 System.out.println("Marks scored in Mathematics ="+ M_MATH);
			 System.out.println("Marks scored in Language ="+ M_LANG);
			 
			 System.out.println("");
			 System.out.println("");
		 }
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
