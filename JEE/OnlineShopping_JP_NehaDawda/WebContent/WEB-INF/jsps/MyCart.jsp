<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.jp.shopping.entities.Item, java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>My Cart</title>
	</head>
	<body>
		<jsp:include page="Head01.jsp"></jsp:include>
		<jsp:include page="Head02.jsp"></jsp:include>
		<h3 align="center">Cart</h3>
		<table class=".table .table-striped" border="1">
			<tr>
				<th>Item Id</th>
				<th>Name</th>
				<th>Category</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
			<c:set var="total" value="${0}"/>
			<c:forEach items="${sessionScope.myCart.items}" var="item">
				<tr>
					<td>${ item.itemId }</td>
					<td>${ item.name }</td>
					<td>${ item.category }</td>
					<td>${ item.price }</td>
					<td>1</td>
					<c:set var="total" value="${total +  item.price}" />
				</tr>
			</c:forEach>
			<tr>
				<td colspan="2">Total</td>
				<td colspan="2"><c:out value="${total}"/></td>
				<td></td>
			</tr>
		</table>
		<a href="itemList.do">Item list</a>
		<a href="placeOrder.do">Place Order</a>
	</body>
</html>