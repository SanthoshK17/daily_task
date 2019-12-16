import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RetrieveDataServlet extends HttpServlet {
	
	private ServletConfig config;

	String page="DataPage.jsp";
	
	public void init(ServletConfig config) throws ServletException
	{
		this.config=config;
	
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
		{
		PrintWriter out = response.getWriter();
		String connectionURL= "jdbc:mysql://192.168.10.59/messagepaging";
		Connection connection=null;
		
		ResultSet rs_FromStudentDB;
		
		response.setContentType("text/html");

		List dataList= new ArrayList(); 
		
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root",""); 
			 String sqlStatement = "select * from Student_Details"; 
			 Statement s = connection.createStatement();
			 s.executeQuery (sqlStatement);

			  rs_FromStudentDB = s.getResultSet();
			  
			  while (rs_FromStudentDB.next ())
			  {
				  dataList.add(rs_FromStudentDB.getInt("Student_ID"));

				  dataList.add(rs_FromStudentDB.getString("Student_Name"));
				  
				  dataList.add(rs_FromStudentDB.getString("Contact"));

			  }
			  
			  rs_FromStudentDB.close();
			  s.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception is ;"+e);
		}
		
		request.setAttribute("data",dataList);
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		if (dispatcher != null){

			  dispatcher.forward(request, response);

			  } 

		}
	
	
}
