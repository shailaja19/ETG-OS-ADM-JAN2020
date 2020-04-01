<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Marks</title>
</head>
<body>
<%@ page import ="com.sonata.Students.Student" %>

<% if(Integer.parseInt(request.getParameter("stdMarks"))>=80)
	{
	Student s1= new Student();
	 String id = request.getParameter("stdId");
	 int id1= Integer.parseInt(id);
	 String stdName= request.getParameter("stdName");
	 
	 String marks1 = request.getParameter("stdMarks");
	
	 int marks= Integer.parseInt(marks1);
	 
	 s1.setStdId(id1);
	 s1.setStdName(stdName);
	 s1.setStdMarks(marks);
	 
	 	session = request.getSession(true);
		session.setAttribute("Student", s1);
%>
	<jsp:forward page="display.jsp"/>
	<% ;
	
	}%>
</body>
</html>