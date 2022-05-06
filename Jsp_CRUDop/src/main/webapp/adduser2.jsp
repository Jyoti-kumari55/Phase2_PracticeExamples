<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="com.javatpoint.dao.UserDao"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="u" class="com.javatpoint.bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
int i=UserDao.save(u);  
if(i>0){  
response.sendRedirect("adduser2-success.jsp");  
}else{  
response.sendRedirect("adduser2-error.jsp");  
}  
%>  
</body>
</html>