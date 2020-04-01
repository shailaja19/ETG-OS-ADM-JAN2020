<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "com.sonata.Students.Student" %>

<%
request.getSession(false);
		Student s1 = (Student)session.getAttribute("Student");
		out.print("Student Information " +s1);
		 %>

</body>
</html>