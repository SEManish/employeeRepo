<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<form action="UpdateEmp" method="post">
Id<input type="text" name="id" value="${employee.id}">
Name<input type="text" name="name" value="${employee.name}">
Email<input type="text" name="email" value="${employee.email}">
Department<input type="text" name="department" value="${employee.department}">
Salary<input type="text" name="salary" value="${employee.salary}">
<input type="submit" value="Update">
</form>
</body>
</html>