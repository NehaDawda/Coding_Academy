<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<h1>
		Hello world!  
	</h1>
	
	<P>  The time on the server is ${serverTime}. </P>
	
	<table border="1">
		<tr>
			<th>EmpNo</th><th>Name</th><th>Salary</th>
		</tr>
		<c:forEach items="${empList }" var="emp">
			<tr>
				<td><c:out value="${ emp.empNo} "></c:out></td>
				<td><c:out value="${ emp.empNm} "></c:out></td>
				<td><c:out value="${ emp.empSal} "></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
