<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Product</title>
	</head>
	<body>
		<jsp:include page="Head01.jsp"></jsp:include>
		<jsp:include page="Head02.jsp"></jsp:include>
		<div style="color:red">${ message }</div>
		<form action="submitProduct.do" method="POST">
			<table>
				<tr>
					<th>Product Id</th>
					<td><input type="text" name="productId" /></td>
				</tr>
				<tr>
					<th>Product Name</th>
					<td><input type="text" name="productName" /></td>
				</tr>
				<tr>
					<th>Product Category</th>
					<td><input type="text" name="productCategory" /></td>
				</tr>
				<tr>
					<th>Product Price</th>
					<td><input type="text" name="productPrice" /></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Add" />
					</td>
				</tr>
			</table>
		</form>
		<a href="mainMenu.do">Return to Main Menu</a>
	</body>
</html>