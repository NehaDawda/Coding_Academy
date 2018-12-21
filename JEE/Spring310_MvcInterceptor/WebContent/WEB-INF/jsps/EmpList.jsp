<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<table border="1">
			<tr>
				<th>Employee Id </th>
				<th>View Details</th>
			</tr>
	
			<c:forEach items="${ requestScope.model.empList}" var="emp">
				<tr>
					<td>${ emp.empId }</td>  <!-- getEmpId -->
					<td><a href="empDetails.hr?id=${ emp.empId }">View</a></td>
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