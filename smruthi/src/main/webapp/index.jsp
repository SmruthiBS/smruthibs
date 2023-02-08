<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">


<body>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="100px" width="100px"> </a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">
							Dropdown </a>
						<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
							<li><a class="dropdown-item" href="#">Action</a></li>
							<li><a class="dropdown-item" href="#">Another action</a></li>
							<li><hr class="dropdown-divider"></li>
							<li><a class="dropdown-item" href="#">Something else
									here</a></li>
						</ul></li>
					<li class="nav-item"><a class="nav-link disabled" href="#"
						tabindex="-1" aria-disabled="true">Disabled</a></li>
				</ul>
				
			</div>
		</div>
	</nav>
<div>
<form action="mail">
<h5>displaying mail: ${email }</h5>
<input type="submit" value="email" >
</form>
</div>
<div>
<form action="cell">
<h5>displaying mobile: ${mob}</h5>
<input type="submit" value="mobile" >
</form>
</div><div>
<form action="adhar">
<h5>displaying adhar: ${number}</h5>
<input type="submit" value="adhar" >
</form>
</div>
<form action="age">
<h5>displaying age: ${age}</h5>
<input type="submit" value="age" >
</form>
</div>
<div>
<form action="dob">
<h5>displaying DOB: ${dob}</h5>
<input type="submit" value="dob" >
</form>
</div>
<div>
<form action="salary">
<h5>displaying desired salary: ${salary}</h5>
<input type="submit" value="salary" >
</form>
</div>
<div>
<form action="bff">
<h5>displaying list of bestfriends:</h5>
<input type="submit" value="besties" >
<ul>
<c:forEach items="${ bff}" var="item">
<li></li>${item }</c:forEach></ul>
</form>
</div>

<div>
<form action="place">
<h5>displaying list of bestfriends:</h5>
<input type="submit" value="places visited" >
<ul>
<c:forEach items="${place}" var="item">
<li></li>${item}</c:forEach></ul>
</form>
</div>
<div>
<form action="skills">
<h5>displaying list of skills:</h5>
<input type="submit" value="skill set" >
<ul>
<c:forEach items="${skills}" var="item">><li></li>${item}</c:forEach></ul>
</form>
</div>
<form action="eduDTO">
<h6>display education DTO: </h6>
<input type="submit" value="show education"><br>
<label>sslc percentage: ${data.SSLCpercentage}</label><br>
<label>school: ${data.school}</label><br>
<label>:PUpercentage ${data.PUpercentage}</label><br>
<label>:PUCollege ${data.PUCollege}</label><br>
<label>:degree ${data.degree}</label><br>
<label>:degreeCollege ${data.degreeCollege}</label><br>
<label>:degreepercentage ${data.degreepercentage}</label><br>
<label>:higestQualification ${data.higestQualification}</label><br>
<label>: degreeYearOfPassOut${data.degreeYearOfPassOut}</label><br>
<label>:degreeUniversity ${data.degreeUniversity}</label><br>
</form>
<div>
<form action="fmlyDTO">
<h6>display family DTO: </h6>
<input type="submit" value="show family"><br>
<label>: type ${value.type}</label><br>
<label>:familyName ${value.familyName}</label><br>
<label>: fatherName ${value.fatherName}</label><br>
<label>:motherName ${value.motherName}</label><br>
<label>: totalMembers ${value.totalMembers}</label><br>
<label>: nativePalace ${value.nativePalace}</label><br>
<label>:grandfatherName ${value.grandfatherName}</label><br>
<label>:grandMotherName ${value.grandMotherName}</label><br>
<label>: income ${value.income}</label><br>
<label>:brotherName ${value.brotherName}</label><br>
</form>
</div>
<form action="phone">
<h6>display mobile DTO: </h6>
<input type="submit" value="show mobile"><br>
<label>:brand${info.brand}</label><br>
<label>:model ${info.model}</label><br>
<label>: price${info.price}</label><br>
<label>:RAM ${info.RAM}</label><br>
<label>:colour ${info.colour}</label><br>
</form>
</div>
<form action="drink">
<h6>display beverage DTO: </h6>
<input type="submit" value="show beverage">
<br>
<label>:name ${item.name}</label><br>
<label>:price ${item.price}</label><br>
<label>: type ${item.type}</label><br>
<label>:colour ${item.colour}</label><br>
<label>: mainIngredient ${item.mainIngredient}</label><br>
<label>: flavour${item.flavour}</label><br>
<label>: availableAt ${item.availableAt}</label><br>
<label>: topings ${item.topings}</label><br>
</form>
</div>
<form action="eat">
<input type="submit" value="show chat">
<br>
<label>:name ${food.name}</label><br>
<label>:price ${food.price}</label><br>
<label>: type ${food.type}</label><br>
<label>:colour ${food.colour}</label><br>
<label>: mainIngredient ${food.mainIngredient}</label><br>
<label>: flavour${food.flavour}</label><br>
<label>: availableAt ${food.availableAt}</label><br>
<label>: topings ${food.topings}</label><br>
<label>:  ingridents ${food.ingridents}</label><br>
<label>:fried ${food.fried}</label><br>
<label>:healthy ${food.healthy}</label><br>
</form>
</div>
</body>
</html>