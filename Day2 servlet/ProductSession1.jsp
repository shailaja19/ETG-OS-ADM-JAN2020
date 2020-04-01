<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "com.sonata.prdModel.Product" %>

<%
request.getSession(false);
		Product p = (Product)session.getAttribute("Product");
		out.print("Product Information " +p);
		 %>
</body>
</html>