
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>

<title>Log in with your account</title>

<style>
div {
	height: 400px;
	width: 500px;
	background-color: powderblue;
}

.center {
	margin: auto;
	width: 40%;
	padding: 100px;
}
</style>

</head>

<body class="text-center">

	<!-- <div class="container"> -->
	<form method="POST" action="/login" class="form-signin">
		<div class="center">
			<h1 class="h3 mb-3 font-weight-normal"></h1>
			<label class="sr-only">Username</label> <input name="username"
				type="text" class="form-control" placeholder="Username" /> <label
				for="inputPassword" class="sr-only">Password</label> <input
				name="password" type="password" class="form-control"
				placeholder="Password" />

			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
			<h4 class="text-center">
				<a href="/register">Create an account</a>
			</h4>
			<p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
		</div>
	</form>

</body>
</html>







