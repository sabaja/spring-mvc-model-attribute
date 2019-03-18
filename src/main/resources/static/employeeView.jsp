<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" action="/spring-mvc-java/addEmployee"
		modelAttribute="employee">
		<form:label path="name">Name</form:label>
		<form:input path="name" />

		<form:label path="id">Id</form:label>
		<form:input path="id" />

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>