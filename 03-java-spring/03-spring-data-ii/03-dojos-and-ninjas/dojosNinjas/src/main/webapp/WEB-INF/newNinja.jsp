<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<header>New Ninja</header>
<body>
	<form:form action="/ninjas/new" method="POST" modelAttribute="ninja">
	<div class="form-group">
		<form:label path="dojo">Dojo</form:label>
		<form:select path="dojo">
			<c:forEach items="${allDojos}" var="dojo">
				<form:option value="${dojo.id}">${dojo.name}</form:option>form:option>
			</c:forEach>
		</form:select>
		<div>
		<form:label path="firstName">First Name</form:label>
		<form:input path="firstName"/>
		</div>
		<div>
		<form:label path="lastName">Last Name</form:label>
		<form:input path="lastName"/>
		</div>
		<div>
		<form:label path="age">Age</form:label>
		<form:input path="age"/>
		</div>
		</div>
		<button type="submit">Add Ninja</button>
		</form:form>

</body>
</html>