<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Employee</title>
</head>
<body>
<table border=1>
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Department</th>
<th>Salary</th>
<th>Delete</th>
<th>Update</th>

</tr>
<c:forEach items="${employee}" var="employee">
<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
<td>${employee.email}</td>
<td>${employee.department}</td>
<td>${employee.salary}</td>
<th><a href="delete?id=${employee.id}">Delete</a></th>
<th><a href="getById?id=${employee.id}">Update</a></th>
</tr>
</c:forEach>
</table>

<br>
<h2>Search Employee By Name</h2>
<br>
<form action="getEmpByName" method="post">
Name<input type="text" name="name" >
<input type="submit" value="Search">
</form>
<br>
<h2>Search Employee By Name and Email</h2>
<br>
<form action="getEmpByNameAndEmail" method="post">
Name<input type="text" name="name" >
Email<input type="text" name="email" >
<input type="submit" value="Search">
</form>
<br>
<h2>Search Employee By Name Or Email</h2>
<br>
<form action="getEmpByNameOrEmail" method="post">
Name<input type="text" name="name" >
Email<input type="text" name="email" >
<input type="submit" value="Search">
</form>
<br>
<br>
<h2>Search Employee By Department</h2>
<br>
<form action="getEmpByDept" method="post">
Department<input type="text" name="department" >
<input type="submit" value="Search">
</form>
</body>
</html>