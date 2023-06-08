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
				src="https://media.istockphoto.com/id/1361301152/vector/zoo-entrance-gates-animals-park-fences-visitors-take-selfies-parents-and-children-excursion.jpg?s=612x612&w=0&k=20&c=OnFI3UhqC6E953dtrGwcgZt6Ej6HiJYdGclMPntR4T4="
				alt="" width="90" height="60" class="d-inline-block align-text-top">

			<a href="index.jsp">home</a>

		</div>

	</nav>

	<h1>welcome to  registration</h1>
	<pre>
	<c:forEach items="${errors}" var="e">
		<span style="color: green;">${e.message}</span>
	</c:forEach>
</pre>
	<form action="fun" method="post">
		<pre>
		Name<input type="text" name="name" required="required" value="${dto.name}"/>
		Location<input type="text" name="location" required="required" value="${dto.location}" />
		EntryFess<input type="number" name="entryFees" required="required" value="${dto.entryFees}"3x/>
		Area<input type="text" name="area" required="required"  value="${dto.area}"  />
		VisitorType<select name="visitorType" required="required" value="${dto.visitorType}"> >
		<option value="">select</option>
		<c:forEach items="${visitorType}" var="t">
		<option value="${t}">${t}</option>
		</c:forEach>
		</select>
		
		<input type="submit" value="save"/>
		</pre>
	</form>
</body>
</html>