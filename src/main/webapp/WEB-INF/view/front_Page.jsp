<!DOCTYPE html>
<html lang="en">
<head>
<title>front page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand">CRUD Operation</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="adduserpage">Add User</a></li>
				<li><a href="userlist">List of User</a></li>
			</ul>
			<form class="navbar-form navbar-left" action="getuser" method="post"
				onSubmit="">
				<div class="form-group">

					<input type="text" class="form-control" placeholder="Enter user Name"
						name="userName">
				</div>
				<button type="submit" value="Login" class="btn btn-default">GET USER</button>
			</form>
		</div>

	</nav>

	
	<p>${msg}</p>

</body>
</html>


