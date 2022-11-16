<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
		<title>This is pretty cool</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="studentName">
			First Name: <form:input path="firstName"/>
			<br><br>
			Last Name: <form:input path="lastName" />
			<br><br>
			<form:radiobutton path="gender" value="male" label="Male" />
			<form:radiobutton path="gender" value="female" label="Female" />
			
			<br><br>
			<br><br>
			
			<form:select path="country">
				<form:options items="${studentName.countryOptions}" />
			</form:select>
			<input type="submit" value="Submit" />
		</form:form>
	</body>
</html>