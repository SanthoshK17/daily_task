package hashMap_excercise1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExcerciseUsingDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map_A= new HashMap();
		HashMap<String,Integer> map_B= new HashMap();
		HashMap<String,Integer> map_C= new HashMap(); 
		
		Set setA = map_A.entrySet();
		Iterator itr1 = setA.iterator();
		
		
		Iterator<String> itr3 = map_B.keySet().iterator();
		Iterator<Integer> itr4 = map_B.values().iterator();
		
		Iterator<String> itr6 = map_C.keySet().iterator();
		Iterator<Integer> itr5 = map_C.values().iterator();
		
		Connection con = null;
		Statement stmt = null;
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",""); 
		
		stmt = con.createStatement(); 
		String sql_marks="SELECT * from Subject_Marks";
		String sql_A="SELECT a.Subject_ID as Sub_ID, b.Subject_Name as SubName, a.Marks as Sub_Marks, count(a.Marks) as Count FROM Subject_Marks a join Subject_Details b on a.Subject_ID = b.Subject_ID where a.marks > 80 group by a.Subject_ID;";
		//String sql_B="SELECT a.Subject_ID as Sub_ID, a.Marks as Sub_Marks, count(a.Marks) as Count FROM Subject_Marks a join Subject_Details b on a.Subject_ID = b.Subject_ID where a.marks > 60 AND a.marks <80 group by a.Subject_ID;";
		
		
		 ResultSet rs_m =stmt.executeQuery(sql_marks);
		 ResultSet rs_countA=stmt.executeQuery(sql_A);
		// ResultSet rs_countB=stmt.executeQuery(sql_B);  
		 while(rs_countA.next())
		 {			 
			 //String Sub_name=rs_countA.getString("Subject_Name");
			 //String S_ID = rs_m.getString("Student_ID");
			 //int marks= rs_m.getInt("Marks");
			 String Subj_IDA = rs_countA.getString("SubName");
			 int noA=rs_countA.getInt("Count");
			 
			 //String Subj_IDB = rs_countB.getString("Sub_ID");
			 //int noB=rs_countB.getInt("Count");
			 
			 map_A.put(Subj_IDA,noA);
			 
		 }
		System.out.println(); 
		
	}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",""); 
		
		stmt = con.createStatement(); 
		String sql_marks="SELECT * from Subject_Marks";
		//String sql_A="SELECT a.Subject_ID as Sub_ID, a.Marks as Sub_Marks, count(a.Marks) as Count FROM Subject_Marks a join Subject_Details b on a.Subject_ID = b.Subject_ID where a.marks > 80 group by a.Subject_ID;";
		String sql_B="SELECT a.Subject_ID as Sub_ID, b.Subject_Name as SubName, a.Marks as Sub_Marks, count(a.Marks) as Count FROM Subject_Marks a join Subject_Details b on a.Subject_ID = b.Subject_ID where a.marks > 60 AND a.marks <80 group by a.Subject_ID;";
		
		 ResultSet rs_countB=stmt.executeQuery(sql_B);  
		 while(rs_countB.next())
		 {			 
			 
			 String Subj_IDB = rs_countB.getString("SubName");
			 int noB=rs_countB.getInt("Count");
			 
			 
			map_B.put(Subj_IDB,noB);
			 
			//System.out.println("Subject ID: "+Subj_IDB+" Count of B: "+noB);
			//System.out.println("Subject ID: "+B.get(Subj_IDB)+" Count of B: "+noB);
		 }
		System.out.println(); 
	}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		
		
		try
		{
		
		Class.forName("com.mysql.jdbc.Driver"); 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",""); 
		
		stmt = con.createStatement(); 
		String sql_marks="SELECT * from Subject_Marks";
		String sql_C="SELECT a.Subject_ID as Sub_ID, b.Subject_Name as SubName, a.Marks as Sub_Marks, count(a.Marks) as Count FROM Subject_Marks a join Subject_Details b on a.Subject_ID = b.Subject_ID where a.marks <60 group by a.Subject_ID;";
		
		
		 ResultSet rs_m =stmt.executeQuery(sql_marks);
		 ResultSet rs_countC=stmt.executeQuery(sql_C);
		// ResultSet rs_countB=stmt.executeQuery(sql_B);  
		 while(rs_countC.next())
		 {			 
			 //String Sub_name=rs_countA.getString("Subject_Name");
			 //String S_ID = rs_m.getString("Student_ID");
			 //int marks= rs_m.getInt("Marks");
			 String Subj_IDC = rs_countC.getString("SubName");
			 int noC=rs_countC.getInt("Count");
			 
			 //String Subj_IDB = rs_countB.getString("Sub_ID");
			 //int noB=rs_countB.getInt("Count");
			 
			 map_C.put(Subj_IDC,noC);
			// map_A.put(Subj_IDB,noB);
			 
			//System.out.println("Subject ID: "+Subj_IDC+" Count of C: "+noC);
			// System.out.println("Subject ID: "+map_A.get(Subj_IDB)+" Count of A: "+noB);
		 }
		System.out.println(); 
	}
		catch(Exception e)
		{
			 e.printStackTrace();
		}
		try
		{
		System.out.println("Count of A");
		System.out.println("Subject Code - Count");
		
		map_A.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " - " + entry.getValue());  
		 });
		
		
		System.out.println("Count of B");
		System.out.println("Subject Code - Count");
		
		map_B.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " - " + entry.getValue());  
		 });
		System.out.println("Count of C");
		System.out.println("Subject Code - Count");
		
		map_C.entrySet().forEach(entry->{
		    System.out.println(entry.getKey() + " - " + entry.getValue());  
		 });
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
	
