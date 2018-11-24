<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Details</title>
<style>
table {
	text-align: center;
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 15px;
}
</style>
</head>
<body>
	<div align="center">
		<table border=1>
			<tr>
				<h1>Scheduled Session</h1>
				<th>Name</th>
				<th>duration</th>
				<th>faculty</th>
				<th>mode1</th>
				<!-- <th>Available Rooms</th> -->
			</tr>
			<c:forEach items="${hotellist}" var="list">
				<tr>
					
					<td>${list.name}</td>
					<td>${list.duration}</td>
					<td>${list.faculty}</td>
					<td>${list.mode1}</td>
					<td><a href="booking.do">enroll me</a></td>
				</tr>
			</c:forEach>
		</table>
		<br>
	
	</div>
</body>
</html>