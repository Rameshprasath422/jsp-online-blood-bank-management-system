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
<title>Blood Availability</title>
<link rel="stylesheet" type=text/css href="login.css">
</head>
<form action="Request.jsp" method="post" style="text-align:center">
<body>
<pre>
<p style="text-align:center"><font size=20>Welcome to RP Blood Bank</font></p>
                    <a href="Request.jsp"><button id="button" type="button"><span></span>Home</button></a>    <a href="about.html"><button id="button" type="button"><span></span>About us</button></a>    <a href="contact.html"><button id="button" type="button"><span></span>Contact us</button></a>    <a href="home.jsp"><button id="button" type="button"><span></span>Admin Login</button></a>    <a href="donor.jsp"><button id="button" type="button"><span></span>Donor Details</button></a> 
</pre>
<h1>Blood Availability</h1>
<table border="1">
		<tr>
			<th>Blood Group</th>
			<th>Units</th>
		</tr>
		<%
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodrequest","root","Ramesh@2308");
			Statement st=connection.createStatement();
			String str= "select * from blood_detail";
			ResultSet rs=st.executeQuery(str);
			while (rs.next()) {
		%>
		<tr>
			<td><%=rs.getString("bloodgroup")%></td>
			<td><%=rs.getString("Units")%></td>
		</tr>
		<%
		}
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
</table>
 <input type="submit" name="Request/">
 </form>
</body>
</html>