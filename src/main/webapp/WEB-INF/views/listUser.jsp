<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
</head>
<body>

<div>
	<a href="add_user" Add STUDENT>Add STUDENT </a>
</div>

<div>
	<h1> User List</h1>
</div>

<c:if test= "${!empty users }">
<table>
	<thead>
	<tr>
		<th>SN </th>
		<th>ID </th>
		<th>Name </th>
		<th> Username </th>
		<th>Password </th>
		<th> Email </th>
		<th> Actions </th>
		
	</tr>
	</thead>
	
	<tbody>
	
		<c:forEach items="${users}" var="user" varStatus="i">
		<tr>
			<td>${i.count}</td>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			<td>${user.email}</td>

			<td><a href="edit_user?id=${user.id}">Edit</a>|<a href="delete_user?id=${user.id}">Delete</a></td>
		</tr>
		
		</c:forEach>
	
	</tbody>

</table>
 </c:if>
</body>
</html>