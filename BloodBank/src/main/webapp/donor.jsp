<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DONOR DETAILS</title>
<link rel="stylesheet" type=text/css href="login.css">
</head>
<form action="donor.jsp"  style=text-align:center>
<body>
<pre>
                    <a href="Request.jsp"><button id="button" type="button"><span></span>Home</button></a>    <a href="about.html"><button id="button" type="button"><span></span>About us</button></a>    <a href="contact.html"><button id="button" type="button"><span></span>Contact us</button></a>    <a href="home.jsp"><button id="button" type="button"><span></span>Admin Login</button></a>    <a href="donor.jsp"><button id="button" type="button"><span></span>Donor Details</button></a> 
</pre>
<div class="container">
  <div class="topic">
   <h1>Admin Login</h1>
    <div class="form">
     <table>
      <tr>
        <td  style = "text-align: left;" ><label for="name">Username</label></td>
        <td><input type="text" name="name" required></td>
      </tr>
      <tr>
        <td style = "text-align: left;"><label for="password">Password</label></td>
        <td><input type="text" name="password" required></td>
      </tr>
      </table>
    </div>
    <input type="submit" name="submit/">
  </div>
</div> 
</form>
</body>
</html>