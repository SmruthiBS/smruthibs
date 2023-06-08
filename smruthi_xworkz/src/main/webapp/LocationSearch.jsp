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
	<style >
	table,th,td{
	border: 1px solid black;}
	
	</style>
</head>
<body>
	<h1>Welcome to search by location  Page</h1>

	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<img
				src="https://media.istockphoto.com/id/1361301152/vector/zoo-entrance-gates-animals-park-fences-visitors-take-selfies-parents-and-children-excursion.jpg?s=612x612&w=0&k=20&c=OnFI3UhqC6E953dtrGwcgZt6Ej6HiJYdGclMPntR4T4="
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="index.jsp">home</a>
		</div>

	</nav>
	<h3>Search</h3>
	<h3>
		<span style="color: red;">${message}</span>
	</h3>
	<form action="searchByLocation" method="get">
		SearchByLocation<input type="text" name="location" /> <input type="submit"
			value="search" required="required">
	</form>
	<div>
		<table>
		<tr>
		<th>id</th>
			<th>name</th>
			<th>location</th>
			<th>area</th>
			<th>entryFees</th>
			<th>visitorType</th>
			<th>edit</th>
			<th>delete</th>
							</tr>
					<c:forEach items="${list}" var="l">
					<tr>
					<td>${l.id}</td>
					<td>${l.name}</td>
					<td>${l.location}</td>
					<td>${l.area}</td>
					<td>${l.entryFees}</td>
					<td>${l.visitorType}</td>
					<td><a href="update?id=${l.id}">edit</a></td>
					<td><a href="delete?id=${l.id}">delete</a></td>
					</tr>
					</c:forEach>
							
		</table>
	</div>
</body>
</html>