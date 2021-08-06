<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Employee Id</td>
			<td>${employee.empId}</td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td>${employee.empName}</td>
		</tr>
		<tr>
			<td>Employee Salary</td>
			<td>${employee.empSal}</td>
		</tr>
		<tr>
			<td>Employee Gender</td>
			<td>${employee.empGen}</td>
		</tr>
		<tr>
			<td>Employee Project</td>
			<td>${employee.empPrj}</td>
		</tr>
		<tr>
			<td>Employee Address</td>
			<td>${employee.empAddr}</td>
		</tr>
		<tr>
			<td>Employee Languages</td>
			<c:forEach var="lang" items="${employee.empLangs}">
				<td>${lang}</td>
			</c:forEach>
		</tr>
		<tr>
			<td>Employee Vendors</td>
			<c:forEach var="vendor" items="${employee.empVendors}">
				<td>${vendor}</td>
			</c:forEach>
		</tr>
	</table>
</body>
</html>