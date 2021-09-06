<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Page</title>
</head>
<body>
	<div class="container">
	<h1><c:out value="${dojoDisplay.name}"/></h1>
		<table>
			<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
			</tr>
			<tbody>
				<c:forEach items="${allNinjas}" var="ninja">
				<tr>
					<td>${ninja.firstName}</td>
					<td>${ninja.lastName}</td>
					<td>${ninja.age}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>