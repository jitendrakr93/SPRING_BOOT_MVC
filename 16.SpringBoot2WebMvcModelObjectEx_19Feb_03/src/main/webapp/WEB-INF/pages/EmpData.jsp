<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.m
in.css" />
</head>
<body>
	<div class="container">
		<h3>WELCOME TO EMPLOYEE DATA PAGE!!</h3>
		<%-- ${employees} --%>
		<table class="table table-hover">
			<tr class="bg-primary text-white">
				<th>ID</th>
				<th>NAME</th>
				<th>SALARY</th>
				<th>OPERATIONS</th>
			</tr>
			<c:forEach items="${employees}" var="ob">
				<tr>
					<td>${ob.eid}</td>
					<td>${ob.ename}</td>
					<td>${ob.esal}</td>
					<td><a href="#" class="btn btn-danger">DELETE</a> | 
					<a href="#" class="btn btn-success">EDIT</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>