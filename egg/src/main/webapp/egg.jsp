<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>x-workz</title>
</head>
<body>
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
				<form class="d-flex">
					<a href="index.jsp">Home</a>
				</form>
			</div>
		</div>
	</nav>
	<h1>egg application page</h1>
	<form action="egg" method="post">
	<br>
		<div class="mb-3">
			<label for="formFile" class="food" >enter name</label>
			 <input class="form-control" type="text" id="name" name="hotelName""
				placeholder="enter  name">
		</div>
		<br>
		<div>
		
		egg dish name<select name="dishName">
		<option>select </option>
		<option>egg rice </option>
		<option>egg masala </option>
		<option>egg maggie </option>
		<option>half boil </option>
		<option> omlet </option>
		<option>egg bonda </option>
		<option>egg chilli </option>
		<option>egg puff </option>
		</select>
		</div>
	<br>
		<div>
		egg type<select name="type">
		<option>select </option>
		<option>nati </option>
		<option>farm </option>
		<option>boiler </option>
		<option>duck </option>
		<option> ostrich</option>
		</select>
		</div>
		<br>
		<div class="mb-3">
			<label for="formFile" class="food" > enter price</label>
		 <input class="form-control"  type="text" id="name" name="price" placeholder="Enter price">
		</div>
		<br>
		<div>
		quantity<select name="quantity">
		<option>select </option>
		<option>1 </option>
		<option>2 </option>
		<option>3 </option>
		<option>5 </option>
		<option>10</option>
		</select>
		</div>
		<br>
		<div>
			<label >TakeAway</label>
			 <input type="radio" value="yes" name="takeAway"> yes 
				<input type="radio" value="no" name="takeAway">no
		</div>
	<br>
	<button type="Submit" class="btn btn-primary">order</button>
	
	</form>

</body>
</html>