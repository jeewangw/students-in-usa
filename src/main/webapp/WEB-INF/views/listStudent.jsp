<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>STUDENT LIST</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="resources/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<!--===============================================================================================-->
</head>
<body>
<%@ include file="navbar.jsp" %>


<div class="jumbotron mt-3">
	<div class="row">
	
		  <div class="col-sm-4">
		    <script src="https://unpkg.com/@lottiefiles/lottie-player@latest/dist/lottie-player.js"></script>
		    <lottie-player src="https://assets8.lottiefiles.com/private_files/lf30_H1RzK9.json"  background="transparent"  speed="1"  style="width: 300px; height: 300px;"  loop  autoplay></lottie-player>
		  </div>
		  
		  <div class="col-sm-8 mt-5">
		    <h1 class="text-success text-center display-2">STUDENT LIST</h1>
		    <p class="text-center">Here is the list of students who wants to apply</p>
		  </div>
	  
	</div>
</div>

<c:if test= "${!empty student }">
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">SN</th>
      <th scope="col">ID</th>
      <th scope="col">Student Name</th>
      <th scope="col">Email</th>
      <th scope="col">Mobile Number</th>
      <th scope="col">Date</th>
      <th scope="col">Address</th>
      <th scope="col">Verification Type</th>
      <th scope="col">Documents</th>
      <th scope="col">Colleges</th>
      <th scope="col">Process Status</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  	<tbody>
	
		<c:forEach items="${student}" var="student" varStatus="i">
		<tr>
			<td>${i.count}</td>
			<td>${student.id}</td>
			<td>${student.studentName}</td>
			<td>${student.email}</td>
			<td>${student.mobileNumber}</td>
			<td>${student.dob}</td>
			<td>${student.address.cityName},${student.address.countryName}</td>
			<td>${student.verificationType}</td>
			<td>${student.documents}</td>
			<td>${student.colleges}</td>
			<td>${student.processStatus}</td>

			<td><a href="edit_student?id=${student.id}"class="text-success">Edit</a>|<a href="delete_student?id=${student.id}" class="text-danger">Delete</a></td>
		</tr>
		
		</c:forEach>
	
	</tbody>

</table>
 </c:if>

<!--===============================================================================================-->
	<script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/bootstrap/js/popper.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/daterangepicker/moment.min.js"></script>
	<script src="resources/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="resources/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="resources/js/main.js"></script>

</body>
</html>