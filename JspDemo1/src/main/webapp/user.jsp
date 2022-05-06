<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%="servlet context common for all the servlets "+application.getInitParameter("name") %><br>
<%="servlet config for differnt  servlets "+config.getInitParameter("name") %>

</body>
</html>