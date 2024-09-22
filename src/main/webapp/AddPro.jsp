<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	form{
		justify-content: center;
		text-align: center;
		align-items: center;
		border: 2px solid black;
		width: 30%;
		margin-top: 20px;
		padding: 40px;
		margin-left: 30%;
	}
</style>
</head>
<body>
	<%@include file="header.jsp" %>
	<form action="/insertProduct" method="post">
	
		<label>product Name:</label>
		<input type="text" name="productName" placeholder="Enter product Name.." required="required"><br><br>
		<label>price:</label>
		<input type="number" name="price" placeholder="Enter product price.." required="required"><br><br>
		<label>stock:</label>
		<input type="text" name="stock" placeholder="stocks availble yes or no.." required="required"><br><br>
		<button type="submit">submit</button>
	</form>
	<h2>${msg}</h2>
</body>
</html>