package com.aspire;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Blood
 */
@WebServlet("/Blood")
public class Blood extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Blood() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Statement stmt=null;
        ResultSet rs=null;
        Connection conn= null;
   
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Database Result";
        String docType =
        "<!doctype html" +
        "transitional//en\">\n";
        out.println(docType +
        "<html>\n" +
        "<head><title>" + title + "</title></head>\n" +
        "<body>");
        try
        {
             // Register JDBC driver
             Class.forName("oracle.jdbc.driver.OracleDriver");

             // Open a connection
             conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "local", "test");

             // Execute SQL query
             stmt = conn.createStatement();
             String sql;
             sql = "SELECT * FROM blood_detail";
             rs = stmt.executeQuery(sql);
             out.println("<table border=1 >");
             out.println("<caption><h2>blood_detail</h2></caption>");

             out.println("<tr style='background-color:#ffffb3; color:red'>");
             out.println("<th>Blood Group</th>");
             out.println("<th> Units</th>");
            
             out.println("</tr>");
             // Extract data from result set
             while(rs.next())
             {
                  //Retrieve by column name
                  

                  //Display values
                  out.println("<tr style='background-color:#b3ffd9;'>");
                  out.println("<td>" + rs.getString(1) + "</td>");
                  out.println("<td>" + rs.getInt(2) + "</td>");
                 
                  out.println("</tr>");
             }
             out.println("</table>");
             out.println("</bod;=y></html>");

             // Clean-up environment
             rs.close();
             stmt.close();
             conn.close();
        }
       
        catch(Exception e)
        {
             e.printStackTrace();
        }
        finally
        {
             //finally block used to close resources
             
                  
						try {
							if(stmt!=null)
							stmt.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
            
            
             
				try {
					if(conn!=null)
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             
             
        }
   }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bloodgroup=request.getParameter("bloodgroup");
		 int Units = Integer.parseInt(request.getParameter("Units"));
		 try
	     {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodrequest","root","Ramesh@2308");
	        	String Query = "select * from blood_detail";
	        	PreparedStatement preparedStatement=connection.prepareStatement(Query);
	        	ResultSet rs=preparedStatement.executeQuery();
	        	while(rs.next())
	        	{
	        		if(bloodgroup.equals("A+") && rs.getString(1).equals("Apositive"))
	        		{
	        			int updateunit = rs.getInt(2) - Units;
	        		
	        			String updateQuery ="update blood_detail set Units="+updateunit+" where bloodgroup = 'Apositive'";
	        			PreparedStatement preupdate=connection.prepareStatement(updateQuery);
	        			preupdate.executeUpdate();
	        		}
	        		else if(bloodgroup.equals("A-") && rs.getString(1).equals("Anegative"))
	        		{
	        			int updateunit = rs.getInt(2) - Units;
	        			String updateQuery ="update blood_detail set Units="+updateunit+" where bloodgroup = 'Anegative'";
	        			PreparedStatement preupdate=connection.prepareStatement(updateQuery);
	        			preupdate.executeUpdate();
	        		}
	        		else if(bloodgroup.equals("B+") && rs.getString(1).equals("Bpositive"))
	        		{
	        			int updateunit = rs.getInt(2) - Units;
	        			String updateQuery ="update blood_detail set Units="+updateunit+" where bloodgroup = 'Bpositive'";
	        			PreparedStatement preupdate=connection.prepareStatement(updateQuery);
	        			preupdate.executeUpdate();
	        		}
	        		else if(bloodgroup.equals("B-") && rs.getString(1).equals("Bnegative"))
	        		{
	        			int updateunit = rs.getInt(2) - Units;
	        			String updateQuery ="update blood_detail set Units="+updateunit+" where bloodgroup = 'Bnegative'";
	        			PreparedStatement preupdate=connection.prepareStatement(updateQuery);
	        			preupdate.executeUpdate();
	        		}
	        		else if(bloodgroup.equals("AB+") && rs.getString(1).equals("ABPositive"))
	        		{
	        			int updateunit = rs.getInt(2) - Units;
	        			String updateQuery ="update blood_detail set Units="+updateunit+" where bloodgroup = 'ABpositive'";
	        			PreparedStatement preupdate=connection.prepareStatement(updateQuery);
	        			preupdate.executeUpdate();
	        		}
	        		else if(bloodgroup.equals("AB-") && rs.getString(1).equals("ABnegative"))
	        		{
	        			int updateunit = rs.getInt(2) - Units;
	        			String updateQuery ="update blood_detail set Units="+updateunit+" where bloodgroup = 'ABnegative'";
	        			PreparedStatement preupdate=connection.prepareStatement(updateQuery);
	        			preupdate.executeUpdate();
	        		}
	        		else if(bloodgroup.equals("O+") && rs.getString(1).equals("Opositive"))
	        		{
	        			int updateunit = rs.getInt(2) - Units;
	        			String updateQuery ="update blood_detail set Units="+updateunit+" where bloodgroup = 'Opositive'";
	        			PreparedStatement preupdate=connection.prepareStatement(updateQuery);
	        			preupdate.executeUpdate();
	        		}
	        		else if(bloodgroup.equals("O-") && rs.getString(1).equals("Onegative"))
	        		{
	        			int updateunit = rs.getInt(2) - Units;
	        			String updateQuery ="update blood_detail set Units="+updateunit+" where bloodgroup = 'Onegative'";
	        			PreparedStatement preupdate=connection.prepareStatement(updateQuery);
	        			preupdate.executeUpdate();
	        		}
	        		response.sendRedirect("Success.jsp");
	        	}
	     }
		 catch(Exception exception)
	     {
	        	exception.printStackTrace();
	        	
	     }
	     finally
	     {
	        	        DriverManager out = null;
						out.println("SQL added successfully");
	     }
		 
	}
	}


