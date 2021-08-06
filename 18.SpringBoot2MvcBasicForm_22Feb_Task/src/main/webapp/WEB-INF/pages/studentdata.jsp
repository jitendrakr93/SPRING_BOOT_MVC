<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>studentData Data</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>studentData Id</td>
			<td>${studentData.sid}</td>
		</tr>
		 <tr>
			<td>studentData name</td>
			<td>${studentData.sname}</td>
		</tr>
		<tr>
			<td>studentData fee</td>
			<td>${studentData.sfee}</td>
		</tr>
		<tr>
			<td>studentData fee</td>
			<td>${studentData.sgender}</td>
		</tr>
		<tr>
			<td>studentData Address</td>
			<td>${studentData.saddress}</td>
		</tr>
		<tr>
			<td>studentData Mobile No</td>
			<td>${studentData.smobileno}</td>
		</tr>
		<tr>
			<td>studentData Email No</td>
			<td>${studentData.semail}</td>
		</tr>
		<tr>
			<td>studentData Course</td>
			<td>${studentData.scourse}</td>
		</tr>
		<tr>
			<td>Time Slots</td>
			<c:forEach var="slots" items="${studentData.timeslots}">
				<td>${slots}</td>
			</c:forEach>
		</tr>
		<tr>
			<td>Time Slots</td>
			<c:forEach var="certificate" items="${studentData.certificates}">
				<td>${certificate}</td>
			</c:forEach>
		</tr>
	</table>
</body>
</html>