<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Update Form</title>
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
<div>
	<form action="update_college" method="post">
		<fieldset>
		<legend> Update Form</legend>
			<div>
				<label> Id</label>
				<input type ="text" name="id" readonly="readonly" value= "${college.id}">
			</div>
			<div>
				<label>College Name</label>
				<input type ="text" name="collegeName" value= "${college.collegeName}">
			</div>
			<div>
				<label> Email</label>
				<input type ="email" name="email" value= "${college.email}">
			</div>
			<div>
				<label>Mobile Number</label>
				<input type ="number" name="mobileNumber" value= "${college.mobileNumber}">
			</div>
			<div>
				<label> Courses</label>
				<input type ="checkbox" name="courses" value="Arts"
				<c:if test="${fn:contains(college.courses, 'Arts')}">checked</c:if>
				> Arts
				<input type ="checkbox" name="courses" value="Business"
				<c:if test="${fn:contains(college.courses, 'Business')}">checked</c:if>
				> Business
				<input type ="checkbox" name="courses" value="Computer Science"
				<c:if test="${fn:contains(college.courses, 'Computer Science')}">checked</c:if>
				> Computer Science
			</div>
			
			
			<div>
			<label style="font-weight: bold;">Address</label>
			
			<div>
			<label>City Name</label>
			<input type ="text" name="address.cityName" value= "${college.address.cityName}">
			</div>
			<div>
				<label>Country Name</label>
				<input type ="text" name="address.countryName" value= "${college.address.countryName}">
			</div>
			
			</div>
			
			<div>
				<input type="submit" value="Submit">
			</div>
		</fieldset>
	</form>
</div>
</body>
</html>