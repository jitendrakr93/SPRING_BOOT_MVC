<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
	<h3>WELCOME TO EMPLOYEE DATA PAGE !!</h3>
	<---- ${employees} ----->
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
		</tr>

		<c:forEach items="${employees}" var="ob">
			<tr>
				<td>${ob.eid}</td>
				<td>${ob.ename }</td>
				<td>${ob.esal }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>