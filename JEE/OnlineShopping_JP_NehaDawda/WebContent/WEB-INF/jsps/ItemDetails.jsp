<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Item Details</title>
	</head>
	<body>
		<jsp:include page="Head01.jsp"></jsp:include>
		<jsp:include page="Head02.jsp"></jsp:include>
		<h3 align="center">Item Details</h3>
		<table border="1">
			<tr>
				<th>Item Id</th>
				<th>Name</th>
				<th>Category</th>
				<th>Price</th>
			</tr>
			<tr>
				<td>${ requestScope.itemDetails.itemId }</td>
				<td>${ requestScope.itemDetails.name }</td>
				<td>${ requestScope.itemDetails.category }</td>
				<td>${ requestScope.itemDetails.price }</td>
			</tr>
		</table>
		<a href="itemList.do">Go Back to list</a>
	</body>
</html>