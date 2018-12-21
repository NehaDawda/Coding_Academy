		<%-- <jsp:include page="Head01.jsp" />
		<jsp:include page="Head02.jsp" /> --%>
		
		<table border="1">
			<tr>
				<th>Employee Id </th>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
			<tr>
				<td>${ requestScope.model.empDetails.empId }</td>
				<td>${ requestScope.model.empDetails.firstName }</td>
				<td>${ requestScope.model.empDetails.lastName }</td>
			</tr>
		</table>
		<a href="getEmpList.hr">Go back to list</a>
	