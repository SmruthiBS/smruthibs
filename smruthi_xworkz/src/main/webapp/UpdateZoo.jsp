<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"> <img
				src="https://media.istockphoto.com/id/1361301152/vector/zoo-entrance-gates-animals-park-fences-visitors-take-selfies-parents-and-children-excursion.jpg?s=612x612&w=0&k=20&c=OnFI3UhqC6E953dtrGwcgZt6Ej6HiJYdGclMPntR4T4=""
				alt="" height="60" width="100">
			</a>
			<ul>
				<li style="display: inline-block; padding: 20px;">
				<li style="display: inline-block;"><a href="index.jsp"
					class="col-lg-2 col-sm-2">Home</a>
			</ul>
		</div>
	</nav>

	<h1>Welcome to zoo Update</h1>

	<c:forEach items="${errors}" var="e">
		<br>
	</c:forEach>
	<span style="color: green" >${message}</span>

	<form action="update" method="post">
		<pre>
		Id<input type="text" name="id" readonly value="${dto.id}"
				readonly="readonly" />
		Name<input type="text" name="name" value="${dto.name}"
				readonly="readonly" />
		Location<input type="text" name="location" value="${dto.location}"
				required="required" />
		area<input type="number" name="area" value="${dto.area }"
				required="required" />
		entry fees<input type="number" name="entryFees" value="${dto.entryFees}"
				 required="required" />
		visitortype<select name="visitorType" required="required" />
		<option value="${dto.visitorType }">${dto.visitorType}</option>
		<c:forEach items="${visitorType}" var="n">
		<option value="${n}">${n}</option>
		</c:forEach>
		</select>
			
		<input type="submit" value="update" class="btn-btn-primary" />
	</pre>
	</form>
</body>
</html>