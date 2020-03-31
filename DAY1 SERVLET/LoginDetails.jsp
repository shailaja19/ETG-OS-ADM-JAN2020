<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page session="true" %>
<%
	String userName=request.getParameter("uname");
	String passWord=request.getParameter("pass");
	out.print("Name : "+userName+" passWord : "+passWord);
	session.setAttribute("uname", userName);
	response.sendRedirect("./response.jsp");

%>
</body>
</html>