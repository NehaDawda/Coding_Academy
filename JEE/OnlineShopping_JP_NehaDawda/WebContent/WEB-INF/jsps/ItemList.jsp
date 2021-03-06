<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.jp.shopping.entities.Item, java.util.ArrayList" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Item List</title>
	</head>
	<body>
		<jsp:include page="Head01.jsp"></jsp:include>
		<jsp:include page="Head02.jsp"></jsp:include>
		
		<h3 align="center">Item List</h3>
		
		<table border="1">
			<tr>
				<th>Item Id</th>
				<th>Name</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach items="${ requestScope.itemList}" var="item">
				<tr>
					<td>${ item.itemId }</td>
					<td>${ item.name }</td>
					<td><a href="itemDetails.do?id=${ item.itemId }">Show Details</a></td>
					<td>
						<div><a href="addToCart.do?id=${ item.itemId }">Add to Cart</a></div>
						<c:if test="${item.itemId = requestScope.id }"><div style="color:red">${ requestScope.msg }</div></c:if>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div><a href="mainMenu.do">Return to Main Menu</a></div>
	</body>
</html>