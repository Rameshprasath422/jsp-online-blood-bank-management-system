package com.aspire;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Request extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String mobilenumber=request.getParameter("mobilenumber");
		String email=request.getParameter("email");
        String bloodgroup=request.getParameter("bloodgroup");
        String units=request.getParameter("units");
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Requestdetails","root","Ramesh@2308");
        	String Query="insert into details_request(username,mobilenumber,email,bloodgroup,units)values('"+username+"','"+mobilenumber+"','"+email+"','"+bloodgroup+"','"+units+"')";
        	PreparedStatement preparedStatement=connection.prepareStatement(Query);
        	        	preparedStatement.executeUpdate();
        	        	
        	        	PrintWriter out=response.getWriter();
        	        	response.sendRedirect("BloodRequest.jsp");
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