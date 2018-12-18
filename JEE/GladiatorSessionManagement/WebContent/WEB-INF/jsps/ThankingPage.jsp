<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
		<meta http-equiv="Pragma" content="no-cache" />
		<meta http-equiv="Expires" content="-1" />
		<title>InnerPage02</title>
		<script type = "text/javascript">
		    function changeHashOnLoad() {
			    window.location.href += "#";
		        setTimeout("changeHashAgain()", "50");
		    }
		
		    function changeHashAgain() 
		    {          
		        window.location.href += "1";
		    }
		
		    var storedHash = window.location.hash;
		    window.setInterval(function () {
		        if (window.location.hash != storedHash) {
		            window.location.hash = storedHash;
		        }
		    }, 50);
    </script>
		
	</head>
	<body onload="changeHashOnLoad();">
		<H1>Thanking page</H1>
		<a href='homePage'>Home</a> 
	</body>
</html>