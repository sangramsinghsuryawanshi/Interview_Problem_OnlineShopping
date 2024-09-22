<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
	<table border="2">
		<tr>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>delete</th>
		</tr>
		<c:forEach var="p" items="${pro}">
			<tr>
				<td>${p.serchaProductName}</td>
				<td>${p.sPrice}</td>
				<td><a href="delte/${p.sid}">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<h2>${msg}</h2>
</body>
</html>