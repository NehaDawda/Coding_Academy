<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Product Details</title>
	</head>
	<body>
		<jsp:include page="Head01.jsp"></jsp:include>
		<jsp:include page="Head02.jsp"></jsp:include>
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Category</th>
				<th>Price</th>
				<th></th>
				<th></th>
			</tr>
			<tr>
				<td>${ requestScope.productDetails.productId }</td>
				<td>${ requestScope.productDetails.productName }</td>
				<td>${ requestScope.productDetails.productCategory }</td>
				<td>${ requestScope.productDetails.productPrice }</td>
				<td><a href="updateProductDetails.do?id=${ productDetails.productId }">Edit</a></td>
				<td><a href="removeProduct.do?id=${ productDetails.productId }">Delete</a></td>
			</tr>
		</table>
		<a href="productList.do">Go Back to list</a>
	</body>
</html>