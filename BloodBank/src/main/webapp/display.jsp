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
<title>Display Donor Details</title>
<link rel="stylesheet" type=text/css href="login.css">
</head>
<body>

<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Mobile Number</th>
			<th>Address</th>
			<th>Blood Group</th>
		</tr>
		<%
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/blooddonor","root","Ramesh@2308");
			Statement st=connection.createStatement();
			String str= "select * from details_donor";
			ResultSet rs=st.executeQuery(str);
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("firstname")%></td>
			<td><%=rs.getString("lastname")%></td>
			<td><%=rs.getString("mobilenumber")%></td>
			<td><%=rs.getString("address")%></td>
			<td><%=rs.getString("bloodgroup")%></td>
		</tr>
		<%
		}
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
</table>
</body>
</html>