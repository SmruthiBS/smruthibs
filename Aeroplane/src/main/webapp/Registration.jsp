<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" />
</head>
<body>


	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://images.pexels.com/photos/104826/aircraft-holiday-sun-tourism-104826.jpeg?cs=srgb&dl=pexels-pixabay-104826.jpg&fm=jpg"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="index.jsp">home</a>

		</div>

	</nav>

	<h1>welcome to  registration</h1>
	<pre>
	<c:forEach items="${errors}" var="e">
		<span style="color: red;">${e.message}</span>
	</c:forEach>
</pre>
	<form action="plane" method="post">
		<pre>
		Name<input type="text" name="name" required="required"/>
		Company<input type="text" name="company" required="required"/>
		Cost<input type="number" name="cost" required="required"/>
		Type<select name="type" required="required">
		<option value="">select</option>
		<c:forEach items="${type}" var="t">
		<option value="${t}">${t}</option>
		</c:forEach>
		</select>
		Country<select name="country" required>
		<option value="">select</option>
		<c:forEach items="${country}" var="c">
		<option value="${c}">${c}</option>
		</c:forEach>
		</select>
		<input type="submit" value="save"/>
		</pre>
	</form>
</body>
</html>