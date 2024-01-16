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
public class Register extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
        String mobilenumber=request.getParameter("mobilenumber");
        String address=request.getParameter("address");
        String bloodgroup=request.getParameter("bloodgroup");
        try
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blooddonor","root","Ramesh@2308");
        	String Query="insert into details_donor(firstname, lastname, mobilenumber, address, bloodgroup)values('"+firstname+"','"+lastname+"','"+mobilenumber+"','"+address+"','"+bloodgroup+"')";
        	PreparedStatement preparedStatement=connection.prepareStatement(Query);
        	        	preparedStatement.executeUpdate();
        	        	
        	        	  PrintWriter out=response.getWriter();

        	             Date date = new Date(); // 3

        	              out.println("Current date: "); // 4
        	              out.println(date);
        	        	response.sendRedirect("display.jsp");
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


