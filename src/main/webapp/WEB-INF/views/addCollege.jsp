<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>College Information</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>

<body>
<div>
	<form action="save_college" method="post">
		<fieldset>
		<legend> New College Information</legend>
			<div>
				<label> College Name</label>
				<input type ="text" name="collegeName">
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
				<label> Courses</label>
				<input type ="checkbox" name="courses" value="Arts"> Arts
				<input type ="checkbox" name="courses" value="Business"> Business
				<input type ="checkbox" name="courses" value="Computer Science"> Computer Science		
			</div>
			
			
			<div>
			<label style="font-weight: bold;">Address</label>
			
			<div>
			<label>City Name</label>
			<input type ="text" name="address.cityName">
			</div>
			<div>
				<label>Country Name</label>
				<input type ="text" name="address.countryName">
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