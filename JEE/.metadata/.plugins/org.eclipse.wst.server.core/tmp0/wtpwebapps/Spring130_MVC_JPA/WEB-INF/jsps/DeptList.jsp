<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="com.jp.hr.entities.Dept,java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:include page="Head01.jsp" />
		<jsp:include page="Head02.jsp" />
		
		<table border="1">
			<tr>
				<th>DeptNo</th>
				<th>Name</th>
			</tr>
			<c:forEach items="${ requestScope.deptList}" var="dept">
				<tr>
					<td>${ dept.deptNo }</td>  <!-- getEmpId -->
					<td><a href="deptDetails.hr?id=${ dept.deptNo }">View</a></td>
				</tr>
			</c:forEach>
			
			<%-- <% for(Employee emp : (ArrayList<Employee>)request.getAttribute("empList")) {
			%>
				<tr>
					<td><%= emp.getEmpId() %></td>
					<td><%= emp.getFirstName() %></td>
					<td><%= emp.getLastName() %></td>
				</tr>
			<%}%> --%>
		</table>
		<a href="homePage.hr">Go to Home page</a>
	</body>
</html>