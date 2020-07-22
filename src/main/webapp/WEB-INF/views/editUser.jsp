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
<%@ include file="navbar.jsp" %>
<div>
	<form action="update_user" method="post">
		<fieldset>
		<legend> User Registration Form</legend>
			<div>
				<label> Id</label>
				<input type ="text" name="id" readonly="readonly" value= "${user.id}">
			</div>
			<div>
				<label> Name</label>
				<input type ="text" name="name" value= "${user.name}">
			</div>
			<div>
				<label> Email</label>
				<input type ="email" name="email" value= "${user.email}">
			</div>
			<div>
				<label> User Name</label>
				<input type ="text" name="username" value= "${user.username}">
			</div>
			<div>
				<label> Password</label>
				<input type ="password" name="password" value= "${user.password}">
			</div>
			
			<div>
				<input type="submit" value="Submit">
			</div>
		</fieldset>
	</form>
</div>
</body>
</html>