<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>
	
	<input type="hidden" 
		name="${_csrf.parameterName}"
		value="${_csrf.token}" /> <!-- Cross site request forgery -->
	
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	   <h2>Welcome : ${pageContext.request.userPrincipal.name} </h2>
	   		 <a href="<c:url value="/admin/innerPage" />" >InnerPage</a> 
           | <a href="<c:url value="/j_spring_security_logout" />" >Logout</a></h2>  
	</c:if>
</body>
</html>