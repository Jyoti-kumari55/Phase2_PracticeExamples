<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page errorPage="show.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%int in1=Integer.parseInt(request.getParameter("in1"));
int in2=Integer.parseInt(request.getParameter("in2"));
int in3=in1/in2;
out.print("the result is: "+in3);
%>

</body>
</html>