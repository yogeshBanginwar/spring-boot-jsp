<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div align="left">
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#">Logo</a>
  
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="#">Link 1</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link 2</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link 3</a>
    </li>
  </ul>
</nav>
</div>

<form class="form-horizontal" action="/save" method="POST">
	<fieldset>
		<div align="center">
			<!-- Form Name -->
			<legend>Form Name</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="user_name">Name</label>
				<div class="col-md-4">
					<input id="user_name" name="user_name" type="text"
						placeholder="enter name" class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="user_email">Email</label>
				<div class="col-md-4">
					<input id="user_email" name="user_email" type="text"
						placeholder="email" class="form-control input-md">

				</div>
			</div>

			<!-- Password input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="user_password">Password
				</label>
				<div class="col-md-4">
					<input id="user_password" name="user_password" type="password"
						placeholder="enter password" class="form-control input-md">

				</div>
			</div>

			<!-- Button (Double) -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="button"></label>
				<div class="col-md-8">
					<button id="button" name="button" class="btn btn-success">Register</button>
					<button id="clear" name="clear" class="btn btn-default">Clear</button>
				</div>
			</div>
		</div>
	</fieldset>
</form>


<div class="container-scroller">
	<div class="col-lg-12 grid-margin stretch-card">
		<div class="card">
			<div class="card-body">
				<h4 class="card-title">Student Table</h4>
				<p class="card-description">
					Add class
					<code>.table-striped</code>
				</p>
				<div class="table-responsive">
					<!-- put new button: Add Customer -->

					<table class="table table-striped">
						<thead>
							<tr>
								<th>Id</th>
								<th>User Name</th>
								<th>Password</th>
								<th>Email</th>
								<th>Action</th>
								<th>Action</th>
								 
							</tr>
						</thead>
						<tbody>
						
							<c:forEach var="use" items="${userlist}">
								<tr>
									<td>${use.id}</td>
									<td>${use.user_name}</td>
									<td>${use.user_email}</td>
									<td>${use.user_password}</td>
									<td><a href="deleteUser?id=${use.id}"
										onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a></td>

								</tr>

							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>