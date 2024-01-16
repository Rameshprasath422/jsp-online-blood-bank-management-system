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
<form action="output" method="post" style="text-align:center">
<table border="1">
		<tr>
			<th>User Name</th>
			<th>Mobile Number</th>
			<th>Email ID</th>
			<th>Blood Group</th>
			<th>Units</th>
			<th>Date</th>
		</tr>
		<%
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Requestdetails","root","Ramesh@2308");
			Statement st=connection.createStatement();
			String str= "select * from details_request";
			ResultSet rs=st.executeQuery(str);
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("username")%></td>
			<td><%=rs.getString("mobilenumber")%></td>
			<td><%=rs.getString("email")%></td>
			<td><%=rs.getString("bloodgroup")%></td>
			<td><%=rs.getString("units")%></td>
			<td><%=rs.getString("date")%></td>
			
		</tr>
		<%
		}
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
</table>
<input type="submit" name="submit/">
</body>
</html>
