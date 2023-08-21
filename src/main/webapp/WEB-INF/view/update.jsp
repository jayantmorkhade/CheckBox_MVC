

<html>
<head>
<title>Update Page</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link href="../css/style.css" rel="stylesheet" id="bootstrap-css">

</head>
<body>
	<form action="update" method="post" onSubmit="">
		<div class="container register">
			<div class="row">
				<div class="col-md-3 register-left">
					<h3>Welcome</h3>
					<p>Fill the all field to update user</p>
					<p>${Status}</p>
				</div>
				<div class="col-md-9 register-right">

					<div class="tab-content" id="myTabContent">
						<div class="tab-pane fade show active" id="home" role="tabpanel"
							aria-labelledby="home-tab">
							<h3 class="register-heading">Update Details</h3>
							<div class="row register-form">
								<div class="col-md-6">
									<div class="form-group">
										<input type="text" maxlength="30" class="form-control"
											placeholder="User Name *" value="${user.userName}"
											name="userName" required="required" readonly="readonly" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="First  Name *" value="${user.fName}"
											name="fName" required="required" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Last Name *" value="${user.lName}" name="lName" />
										<div class="form-group">
											<input maxlength="10" minlength="10" type="text"
										         placeholder="Conatact Number *" value="${user.cNumber}"
												name="cNumber" />
										</div>
										

										<div class="form-group">
											<div class="maxl">
												<label>Change Gender:</label>

												<c:if test="${user.gender=='male'}" var="male">

													<label class="radio inline"> <input type="radio"
														name="gender" value="male" checked="checked" /><span>
															Male </span></label>
													<label class="radio inline"> <input type="radio"
														name="gender" value="female" /><span> Female </span></label>
												</c:if>
												<c:if test="${user.gender=='female'}" var="female">
													<label class="radio inline"><input type="radio"
														name="gender" value="male" /><span> Male </span></label>
													<label class="radio inline"><input type="radio"
														name="gender" value="female" checked="checked" /> <span>
															Female </span></label>
												</c:if>

											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<input type="number" min=1 max=60 class="form-control"
												placeholder="Enter Age *" value="${user.age}" name="age" />
										</div>
										<div class="form-group">
											<input type="text" class="form-control"
												placeholder="Enter City *" value="${user.city}" name="city"
												required="required" />
										</div>
										<div class="form-group">
											<input type="text" class="form-control"
												placeholder="Enter Full Address *" value="${user.uAdd}"
												name="uAdd" required="required" />
										</div>
										<div class="form-group">
											<input type="email" class="form-control"
												placeholder=" Enter Email*" value="${user.eMail}"
												name="eMail" required="required" />
										</div>


										<input type="submit" class="btnRegister"
											value="Update Details" />
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
	</form>