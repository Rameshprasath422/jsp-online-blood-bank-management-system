<%@page import="java.sql.*" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.PreparedStatement" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Blood Request Details</title>
<link rel="stylesheet" type=text/css href="login.css">
</head>
<body>
<%
String mobilenumber=request.getParameter("mobilenumber");
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Requestdetails","root","Ramesh@2308");
	PreparedStatement ps=connection.prepareStatement("delete from bloodrequest where mobilenumber='"+mobilenumber+"'");
	response.sendRedirect("BloodRequest.jsp");
}
catch(Exception e)
{
	response.sendRedirect("BloodRequest.jsp");
}
%>
</body>
</html>		
		