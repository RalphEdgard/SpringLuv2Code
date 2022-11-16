<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Customer Name: ${customer.firstName} - ${customer.lastName} <br> Free Pass: ${customer.freePasses} <br> postal code: ${customer.postalCode} <br> Course Code: ${customer.courseCode}</h1>
</body>
</html>