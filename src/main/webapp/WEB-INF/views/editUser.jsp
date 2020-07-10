<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Update Form</title>
</head>
<body>
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