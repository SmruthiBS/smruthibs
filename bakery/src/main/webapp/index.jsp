<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
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
				
			</div>
		</div>
	</nav>
	<h1>Save details of bakery</h1>
	<form action="bake" method="post">
	<div class="mb-3">
			<label for="formFile" class="food" >bakery name</label>
			 <input class="form-control" type="text" id="foodname" name="bakeryName"
				placeholder="enter bakery name">
		</div>
		<div class="mb-3">
			<label for="formFile" class="food" >bakery owner name</label>
			 <input class="form-control" type="text" id="foodname" name="ownerName"
				placeholder="enter owner name">
		</div>
		<div class="mb-3">
			<label for="formFile" class="food" >bakery owner  wife name</label>
			 <input class="form-control" type="text" id="foodname" name="wifeName"
				placeholder="enter owner wife name name">
		</div>
		 owner wife married   yes<input type="radio" name="married" value="yes">
                              no<input type="radio" name="married" value="no"> 
        <div>          
		Famous for<textarea rows="5" cols="25" name="famousFor"></textarea></div>
		<div class="mb-3">
			<label for="formFile" class="food" >bakery since</label>
			 <input class="form-control" type="text" id="foodname" name="bakerySince"
				placeholder="enter bakery since">
		</div>
		<input type="submit" value="save">
	</form>
</body>
</html>