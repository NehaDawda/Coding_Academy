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
	<c:if test="${not empty msg}">
				<div class="msg">${msg}</div>
	</c:if>
	<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
