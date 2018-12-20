<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee Details</title>
	</head>
	<body>
		<jsp:include page="Head01.jsp" />
		<jsp:include page="Head02.jsp" />
		
		<table border="1">
			<tr>
				<th>Dept Id </th>
				<th>Name</th>
			</tr>
			<tr>
				<td>${ requestScope.deptDetails.deptNo }</td>
				<td>${ requestScope.deptDetails.deptNm }</td>
			</tr>
		</table>
		<table border="1">
			<tr>
				<th>Employee Id </th>
				<th>Employee name</th>
			</tr>
			<c:forEach items="${ requestScope.deptDetails.empList}" var="emp">
				<tr>
					<td>${ emp.empNo }</td>  <!-- getEmpId -->
					<td>${ emp.empNm }</td>
				</tr>
			</c:forEach>
		</table>
		<a href="getDeptList.hr">Go back to list</a>
	</body>
</html>