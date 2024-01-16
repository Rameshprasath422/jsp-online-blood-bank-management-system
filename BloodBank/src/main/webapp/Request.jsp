<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Request details</title>
<link rel="stylesheet" type=text/css href="login.css">
<form action="First.jsp" method="post" style="text-align:center">
</head>
<body>
<pre>
<p style="text-align:center"><font size=20>Welcome to RP Blood Bank</font></p>
                    <a href="Request.jsp"><button id="button" type="button"><span></span>Home</button></a>    <a href="about.html"><button id="button" type="button"><span></span>About us</button></a>    <a href="contact.html"><button id="button" type="button"><span></span>Contact us</button></a>    <a href="home.jsp"><button id="button" type="button"><span></span>Admin Login</button></a>    <a href="donor.jsp"><button id="button" type="button"><span></span>Donor Details</button></a> 
</pre>
<div class="container">
  <div class="topic">
   <h1>Request  for  Blood</h1>
    <div class="form">
     <table>
      <tr>
        <td style = "text-align: left;" ><label for="name">Username</label></td>
        <td><input type="text" name="username" required></td>
      </tr>
      <tr>
        <td style = "text-align: left;"><label for="mobilenumber">Mobile Number</label></td>
        <td><input type="text" name="mobilenumber" required></td>
      </tr>
      <tr>
        <td style = "text-align: left;"><label for="email">Email ID</label></td>
        <td><input type="text" name="email" required></td>
      </tr>
      <tr>
        <td style = "text-align: left;"><label for="bloodgroup">Blood Group</label></td>
        <td><input type="text" name="bloodgroup" required></td>
      </tr>
      <tr>
        <td style="text-align:left;"><label for="units">Units</label></td>
        <td><input type="text" name="units" required></td> 
       </tr>
      </table>
    </div>
    <input type="submit" name="submit/">
  </div>
</div> 
</body>
</html>