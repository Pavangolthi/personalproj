<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="2">
		<tr>
			<th>ID</th><th>Name</th><th>User Name</th>
		</tr>
		<c:forEach items="${ulist}" var="user">
		<tr>
			<td>${user.id}</td><td>${user.name}</td><td>${user.userName}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>