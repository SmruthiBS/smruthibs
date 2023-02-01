<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<h1>page to display details of fav person</h1>
</body>
<form action="send" method="post">
<pre>
First name <input type="text" name="fname">
Last name  <input type="text" name="lname">
Gender   male<input type="radio" name="gender" value="male">
        female<input type="radio" name="gender" value="female">  
reason  <textarea rows="5" cols="25" name="reason"></textarea>
address <textarea rows="5" cols="25" name="address"></textarea>
<input type="submit" value="send">

</pre>

</form>
</html>