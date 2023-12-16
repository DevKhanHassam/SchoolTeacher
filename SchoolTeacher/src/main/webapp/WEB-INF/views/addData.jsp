<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Data for new Student</title>
</head>
<body>
<div align="center">
<h3>ADD NEW STUDENT</h3>

<form:form action="newstudentadded" modelAttribute="studentData" method="POST">
<label for="n">Name</label>
<form:input path="name" id="n"/>
<br>
<label for="m">mobile</label>
<form:input path="mobile" id="m"/>
<br>
<label for="c">country</label>
<form:input path="country" id="c"/>
<br>
<input type="submit" value="submit">

</form:form>
</div>
</body>
</html>