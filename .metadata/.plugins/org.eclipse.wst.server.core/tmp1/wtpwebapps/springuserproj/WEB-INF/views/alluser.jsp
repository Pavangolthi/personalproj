<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">All Users</h2>
	<div align="center">
		<table border="2">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>User Name</th>
			</tr>
			<s:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.userName}</td>
			</tr>
			</s:forEach>
		</table>
	</div>
</body>
</html>