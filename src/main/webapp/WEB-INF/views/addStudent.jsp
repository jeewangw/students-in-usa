<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Add New Student</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="resources/college_registration/main.css">
</head>

<body>
<nav class="navbar navbar-expand-sm bg-primary navbar-dark">
  <ul class="navbar-nav ml-auto">
    <li class="nav-item active">
      <a class="nav-link" href="add_college">Add Colleges</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="add_student">Add Students</a>
    </li>
     <li class="nav-item active">
      <a class="nav-link" href="list_college">List Colleges</a>
    </li>
    <li class="nav-item active">
      <a class="nav-link" href="list_student">List Students</a>
    </li>
    <li class="nav-item active">
      <div class="dropdown">
		  <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
		    ${uname}
		  </button>
		  <div class="dropdown-menu">
		    <a class="dropdown-item" href="logout_user">Log Out</a>
		  </div>
	</div>
    </li>
  </ul>
</nav>

<div class="container register ">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>Welcome</h3>
                        <p>Please fill up the form to add new student information !!</p>
                    </div>
		<div class="col-md-9 register-right">
			<form action="save_student" method="post">
				<fieldset>
				<h3 class="register-heading">New Student Information</h3>
				<div class="row register-form">
				<div class="col-6">
					<div>
						<label> Student Name </label>
						<input type ="text" name="studentName">
					</div>
		
					<div>
						<label> Email</label>
						<input type ="email" name="email">
					</div>
					
					<div>
						<label>Mobile Number</label>
						<input type ="number" name="mobileNumber">
					</div>
					<div>
						<label>Date of Birth</label>
						<input type ="date" name="dob">
					</div>
					<div>
					<label> Verification Type</label>
						<select name = "verificationType">
						<option value="Citizenship">Citizenship</option>
						<option value="Passport"> Passport </option>
						<option value = "SSN"> SSN </option>
						</select>
					 </div>
					</div>
				<div class="col-9">
				
					<div>
					<label> Process Status</label>
						<select name = "processStatus">
						<option value="Incomplete Documents">Incomplete Documents</option>
						<option value="Waiting for Approval"> Waiting for Approval </option>
						<option value = "Admission Approved"> Admission Approved </option>
						</select>
					 </div>
		
					<div>
						<label> Documents</label>
						<input type ="checkbox" name="documents" value="SOP"> SOP
						<input type ="checkbox" name="documents" value="SAT"> SAT
						<input type ="checkbox" name="documents" value="TOEFL"> TOEFL
						<input type ="checkbox" name="documents" value="Transcript"> Transcript
						<input type ="checkbox" name="documents" value="Certificates"> Certificates		
					</div>
					
					
					<div>
					<label>City Name</label>
					<input type ="text" name="address.cityName">
					</div>
					<div>
						<label>Country Name</label>
						<input type ="text" name="address.countryName">
					</div>
					
					<c:if test= "${!empty college }">
						<div>
							<label class="font-weight-bold"> Preferred Colleges</label>
							<c:forEach items="${college}" var="colleges" varStatus="i">
							</br>
							<input type ="checkbox" name="colleges" value="${colleges.collegeName}">${colleges.collegeName}	
							</c:forEach>
						</div>
					</c:if>
					
					
					
					<div>
						<input type="submit" value="Submit">
					</div>
					</div>
					</div>
				</fieldset>
			</form>
		</div>
	</div>
</div>
</body>
</html>