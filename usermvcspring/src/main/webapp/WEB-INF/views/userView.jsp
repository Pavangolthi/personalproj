<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">User Details</h2>
	<div align="center">
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>User Name</th>
			</tr>
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.username}</td>
			</tr>
		</table>
	</div>
</body>
</html>