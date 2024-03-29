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
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://media.istockphoto.com/id/1361301152/vector/zoo-entrance-gates-animals-park-fences-visitors-take-selfies-parents-and-children-excursion.jpg?s=612x612&w=0&k=20&c=OnFI3UhqC6E953dtrGwcgZt6Ej6HiJYdGclMPntR4T4="
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h1>Welcome to zoo Update page</h1>

	<c:forEach items="${errors}" var="e">
		<br>
		<span style="color: red;">${e.message}</span>
		
	</c:forEach>
<div><span style="color: green;">${message}</span></div>
	<form action="update" method="post">
	<div class="mb-3">
	<label for="formFile" class="form-label">Id</label> <input
				type="text" class="form-control" name="id" readonly="readonly"
				 value="${dto.id}" />
	</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" id="formFile"  readonly="readonly"
				required="required"
				placeholder="Enter name" value="${dto.name}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Location</label> <input
				type="text" class="form-control" name="location" id="formFile" required="required"
				placeholder="Enter location" value="${dto.location}" />
		</div>
		 visitorType <select class="form-select"
			aria-label="Default select example" name="visitorType" required="required">
			<option selected value="${dto.visitorType}">${dto.visitorType}</option>
			<c:forEach items="${visitorType}" var="c">
			<option value="${c}">${c}</option>
			</c:forEach>
			</select>
			
			<div class="mb-3">
			<label for="formFile" class="form-label">Area</label> <input
				type="text" class="form-control" name="area" id="formFile" required="required"
				placeholder="Enter area" value="${dto.area}" />
		</div>

		<div class="mb-3">
			<label for="formFile" class="form-label">entryFees</label> <input
				type="number" class="form-control" name="entryFees" id="formFile" required="required"
				placeholder="Enter entryFees" value="${dto.entryFees}" />
		</div>
		<input type="submit" value="update" class="btn btn-primary"/>
		</form>
</body>
</html>