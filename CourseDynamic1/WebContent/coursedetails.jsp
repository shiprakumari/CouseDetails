<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib  prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Course Details</h2>

<table>
<tr>
<th>C_id</th>
<th>C_name</th>
<th>C_fees</th>
<th>Enroll</th>
</tr>
<a:forEach var="course" items="${temp}">
<tr>
<td>${course.cid}</td>
<td>${course.cname}</td>
<td>${course.cfees}</td>
<td><a href="success">enroll</a></td>

</tr>
</a:forEach>

</table>

</body>
</html>