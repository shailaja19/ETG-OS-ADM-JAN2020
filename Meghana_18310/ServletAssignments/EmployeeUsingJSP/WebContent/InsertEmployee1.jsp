<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Employee </title>
</head>
<body>
  <%@page import="com.sonata.DaoImpl.EmpDaoImpl"%>
  		<%@page import="com.sonata.Model.Employee"%>

<% 	String id = request.getParameter("empId");
	String empName = request.getParameter("empName");
	String sal = request.getParameter("empSal");
	
	int empID= Integer.parseInt(id);
	double empSal = Double.parseDouble(sal);
	
	  Employee e1 = new Employee();
	  e1.setEmpId(empID);
	   e1.setEmpName(empName);
	   e1.setEmpSal(empSal);
	   
	   EmpDaoImpl e2 = new EmpDaoImpl();
	   int s1 = e2.save(e1);
	   out.println("one row is inserted " + s1);
	
	%>
</body>
</html>