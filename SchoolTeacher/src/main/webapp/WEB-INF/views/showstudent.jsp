<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Student Data</h1>

	<div align="center">
		<table border="2">


			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Mobile</th>
				<th>Country</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>

			<c:forEach var="TempStudent" items="${showStudent}">

				<tr>
					<td>${TempStudent.id}</td>
					<td>${TempStudent.name}</td>
					<td>${TempStudent.mobile}</td>
					<td>${TempStudent.country}</td>
					<td><a href="update_student?id=${TempStudent.id} ">Update</a></td>
					<td><a href="delete_student?id=${TempStudent.id}"
						onclick="if(!(confirm('Are you sure to delete ${TempStudent.name} data?'))) return false">Delete</a></td>
				</tr>



			</c:forEach>







		</table>
	</div>
	<hr>
	<div align="center">
		<a href="add_data">
			<button>ADD DATA FOR NEW STUDENT</button>
		</a>
	</div>

</body>
</html>