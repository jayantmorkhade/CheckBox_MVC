<jsp:include page="front_Page.jsp"></jsp:include>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<html>

<title>list of user</title>

</head>

<body>
	<table class="table  table-striped">
		<thead>
			<tr>
				<th scope="col">User Name</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Contact Number</th>
				<th scope="col">Gender</th>
				<th scope="col">Age</th>
				<th scope="col">City</th>
				<th scope="col">Address</th>
				<th scope="col">E-Mail</th>
				<th scope="col">Action</th>

			</tr>

		</thead>
		<tbody>
			<c:forEach items="${Users}" var="user">
				<tr>
					<td><c:out value="${user.userName}"></c:out></td>
					<td><c:out value="${user.fName}"></c:out></td>
					<td><c:out value="${user.lName}"></c:out></td>
					<td><c:out value="${user.cNumber}"></c:out></td>
					<td><c:out value="${user.gender}"></c:out></td>
					<td><c:out value="${user.age}"></c:out></td>
					<td><c:out value="${user.city}"></c:out></td>
					<td><c:out value="${user.uAdd}"></c:out></td>
					<td><c:out value="${user.eMail}"></c:out></td>
					<td><a href="updatepage?userName=${user.userName}"
						style="color: green">Edit</a> <a
						href="delete?userName=${user.userName}" style="color: red">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h4 style="color: red">${status}</h4>
	<p>${Status}</p>

</body>
</html>