<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>User</title>
</head>
<body>
	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th scope="col">User Id</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Gender</th>
				<th scope="col">Age</th>
				<th scope="col">City</th>
				<th scope="col">E-Mail</th>
				<th scope="col">Action</th>

			</tr>

		</thead>

		<tbody>
			<tr>
				<td>${user.userName}</td>
				<td>${user.fName}</td>
				<td>${user.lName}</td>
				<td>${user.gender}</td>
				<td>${user.age}</td>
				<td>${user.city}</td>
				<td>${user.eMail}</td>

				<td><a href="updatepage?userName=${user.userName}" style="color: Pink">Edit</a></td>

			</tr>

		</tbody>
	</table>

</body>

</html>