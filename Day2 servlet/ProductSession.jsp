<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Session</title>
</head>
<body>

<%@ page import = "com.sonata.prdModel.Product" %>


<% 
	Product p= new Product();
	 String id = request.getParameter("prdId");
	 int id1= Integer.parseInt(id);
	 String prdName= request.getParameter("prdName");
	 
	 String cost = request.getParameter("prdCost");
	
	 double cost1= Double.parseDouble(cost);
	 
	 p.setPrdID(id1);
	 p.setPrdName(prdName);
	 p.setPrdPrice(cost1);
	 
	 session = request.getSession(true);
	session.setAttribute("Product", p);

	out.print("<a href ='./ProductSession1.jsp' >Visit </a>");

%>
</body>
</html>