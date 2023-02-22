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
	<h1>Welcome to search Page</h1>

	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://images.pexels.com/photos/104826/aircraft-holiday-sun-tourism-104826.jpeg?cs=srgb&dl=pexels-pixabay-104826.jpg&fm=jpg"
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="plane">click here to search</a> <a href="index.jsp">home</a>
		</div>

	</nav>
	<h3>Search</h3>
	<h3>
		<span style="color: red;">${message}</span>
	</h3>
	<form action="find" method="get">
		SearchById<input type="text" name="id" /> <input type="submit"
			value="search" required="required">
	</form>
	<div>
		<h4>result</h4>
		<h4>Name:${dto.name}</h4>
		<h4>Company:${dto.company}</h4>
		<h4>Cost:${dto.cost}</h4>
		<h4>Type:${dto.type}</h4>
		<h4>Country:${dto.country}</h4>
	</div>
</body>
</html>