<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error{color: red}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First Name: <form:input path="firstName" />
		<br><br>
		Last Name: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" /> 
		Free passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" /> 
		
		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" /> 
		 
 		Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error" /> 
		
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>