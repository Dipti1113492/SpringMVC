<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="empform">Add Employee</a>
	<a href="viewemp">View Employees</a>
	<table border="1">

		<th>ID</th>
		<th>Name</th>
		<th>Password</th>


		<c:forEach var="emp" items="${listEmp}">
			<tr>
				<td>${emp.ID}</td>
				<td>${emp.userName}</td>
				<td>${emp.password}</td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>