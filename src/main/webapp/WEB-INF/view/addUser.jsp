

<html>
<head>
<title>AddUserPage</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link href="css/style.css" rel="stylesheet" id="bootstrap-css">
<body>
	<form action="addUser" method="post" onSubmit="">
		<div class="container register">
			<div class="row">
				<div class="col-md-3 register-left">
					<h3>Welcome</h3>
					<p>Fill the all field to add new user</p>
					<p>${Status}</p>
				</div>
				<div class="col-md-9 register-right">

					<div class="tab-content" id="myTabContent">
						<div class="tab-pane fade show active" id="home" role="tabpanel"
							aria-labelledby="home-tab">
							<h3 class="register-heading">Add User Details</h3>
							<div class="row register-form">
								<div class="col-md-6">
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="User Name *" value="" name="userName"
											required="required" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="First  Name *" value="" name="fName"
											required="required" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Last Name *" value="" name="lName" />
									</div>
									<div class="form-group">
										<input maxlength="10" minlength="10" type="text"
											class="form-control" placeholder="Conatact Number *" value=""
											name="cNumber" />
									</div>
									<div class="form-group">
										<div class="maxl">
											<label class="radio inline"> <input type="radio"
												name="gender" value="male" checked> <span>
													Male </span>
											</label> <label class="radio inline"> <input type="radio"
												name="gender" value="female"> <span>Female </span>
											</label>
										</div>
									</div>
								</div>
								<div class="col-md-6">
									<div class="form-group">

										<input type="number" min=1 max=60 class="form-control"
											placeholder="Enter Age *" value="" name="age" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Enter City *" value="" name="city"
											required="required" />
									</div>
									<div class="form-group">
										<input type="text" class="form-control"
											placeholder="Enter Full Address*" value="" name="uAdd"
											required="required" />
									</div>
									<div class="form-group">
										<input type="email" class="form-control" placeholder="Email *"
											value="" name="eMail" required="required" />
									</div>
									<div class="form-group">
										<input type="checkbox" value="Java" name="language" > Java<BR>
										<input type="checkbox"name="language" value="HTML"> HTML<BR> 
										<input type="checkbox" name="language" value="CSS"> CSS<BR>
										<input type="checkbox" name="language" value="Python">Python<BR>
										<input type="checkbox" name="language"value="Ruby"> Ruby <BR>
									</div>

									<input type="submit" class="btnRegister" value="Register" />
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>

</body>
</html>