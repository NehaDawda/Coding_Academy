<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Employee Saved Successfully</title>
</head>
<body>
<h3>
    Employee Saved Successfully.
</h3>
 
<strong>Employee ID:${emp.empNo}</strong><br>
<strong>Employee Name:${emp.empNm}</strong><br>
<strong>Employee Email:${emp.email}</strong><br>
 
</body>
</html>
