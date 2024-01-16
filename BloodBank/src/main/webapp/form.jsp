<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request</title>
<link rel="stylesheet" type=text/css href="login.css">
<form action="response.jsp" method="post">
</head>
<body>
<div class="container" >
<%
String name=(String)session.getAttribute("Name");
out.println("Name:"+name);
String mobilenumber=(String)session.getAttribute("Mobilenumber");
out.println("Mobile Number:"+mobilenumber);
String email=(String)session.getAttribute("Email");
out.println("Email:"+email);
String bloodgroup=(String)session.getAttribute("Bloodgroup");
out.println("Bloodgroup:"+bloodgroup);
String units=(String)session.getAttribute("Units");
out.println("Units:"+units);

%>
</div>
<input type="submit" name="Reply"/>
</form>
</body>
</html>