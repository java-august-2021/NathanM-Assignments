<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visit Count</title>
</head>
<body>
<h2> You have visited <a href="/"></a><c:out value="${current}"/> times.</h2>
<p><a href="/">Return Home</a> | <a href="/reset">Reset Count</a></p>
</body>
</html>