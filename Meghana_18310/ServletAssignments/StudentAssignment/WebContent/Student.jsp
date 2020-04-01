<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello, Please submit the form</h2>
	<form method="get">
	Student Name:	<input type="text" name="username" size="25" />
	Student Marks:	<input type="text" name="marks" size="4" />
	<p></p>
	<input type="submit" value="Submit">
	<input type="reset" value="Reset">
	</form>
	<%
	
	String user=request.getParameter("username");
	
	int m = request.getParameter("marks") != null ? Integer.getInteger(request.getParameter("marks")).intValue() : -1;
	
	if(m >=80 && user!=null && user.length()>0){
	%>
	<%@include file="response.jsp" %>
	<%
	}
	%>
	<%@page session="true" %>
	<% 
	session.setAttribute("stduser", user);
	session.setAttribute("stdmarks", m);
	%>
</body>
</html>