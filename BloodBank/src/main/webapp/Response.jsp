<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Blood Response</title>
<link rel="stylesheet" type=text/css href="login.css">
</head>
<body>
<div style="padding-top : 50px; text-align: center">

<label for="html">Blood Group Details</label> <br><br>

<form action="Bloodrequest" method="post" style="text-align:center; margin-top : 20px;padding-top:30px">







<label style= "padding-top: 20;text-align:left;"for="html">
Select Blood group:</label>


<select id="bloodgroup" name="bloodgroup">
       <option value="A+">Apositive</option>
       <option value="A-">Anegative</option>
       <option value="B+">Bpositive</option>
       <option value="B-">Bnegative</option>
       <option value="AB+">ABpositive</option>
       <option value="AB-">ABnegative</option>
       <option value="O+">Opositive</option>
       <option value="O-">Onegative</option>
</select>
<br/></br>
<label style= "padding-top: 20; text-align:left; "for="html">
Enter number of units:</label>
<input type="number" name="Units" required><br/></br>
<input type="submit" name="submit/">
</form>
</div>
</body>
</html>
