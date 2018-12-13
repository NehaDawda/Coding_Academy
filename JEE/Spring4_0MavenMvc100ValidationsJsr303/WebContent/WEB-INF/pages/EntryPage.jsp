<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
    prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Save Page</title>
<style>
.error {
    color: #ff0000;
    font-style: italic;
    font-weight: bold;
}
</style>
</head>
<body>
 	<p>
 		Employee ID: <b>No validation.</b><br/>
 		Employee Name: <b>Size 3-20, Pattern: [a-z-A-Z]*</b><br/>
 		Age: <b>Range 18-60</b><br/>
 		Contact No: <b>NotNull, NotBlank, Pattern: [0-9]*</b><br/>
 		Email: <b>Not Null, NotBlank, Email</b><br/>
 	</p>
    <springForm:form method="POST" commandName="employee"
        action="postRegistrationData.do">
        <table>
            <tr>
                <td>Employee ID:</td>
                <td><springForm:input path="empNo" /></td>
                <td><springForm:errors path="empNo" cssClass="error" /></td>
            </tr>
            <tr>
                <td>Employee Name:</td>
                <td><springForm:input path="empNm" /></td>
                <td><springForm:errors path="empNm" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Employee Age:</td>
                <td><springForm:input path="age" value="18"/></td>
                <td><springForm:errors path="age" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Contact Number:</td>
                <td><springForm:input path="contactNo" /></td>
                <td><springForm:errors path="contactNo" cssClass="error" /></td>
            </tr>
            <tr>
            	<td>Employee Email:</td>
                <td><springForm:input path="email" /></td>
                <td><springForm:errors path="email" cssClass="error" /></td>
            </tr>
            <%-- <tr>
                <td>Employee Role:</td>
                <td><springForm:select path="role">
                        <springForm:option value="" label="Select Role" />
                        <springForm:option value="ceo" label="CEO" />
                        <springForm:option value="developer" label="Developer" />
                        <springForm:option value="manager" label="Manager" />
                    </springForm:select></td>
                <td><springForm:errors path="role" cssClass="error" /></td>
            </tr> --%>
            <tr>
                <td colspan="3"><input type="submit" value="Save"></td>
            </tr>
        </table>
 
    </springForm:form>
 
</body>
</html>
