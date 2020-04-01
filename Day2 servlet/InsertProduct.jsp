<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@ page import="com.sonata.prdDAOImpl.PrdDAOImpl" %>
  		<%@ page import= "com.sonata.prdModel.Product"%>
  		<%@ page import = "java.util.List" %>
  		<%@ page import = "java.util.ArrayList" %>

<% 	String id = request.getParameter("prdId");
	String prdName = request.getParameter("prdName");
	String cost = request.getParameter("prdcost");
	
	int prdId= Integer.parseInt(id);
	double prdcost = Double.parseDouble(cost);
	
	  Product prd1 = new Product();
	  prd1.setPrdID(prdId);
	   prd1.setPrdName(prdName);
	   prd1.setPrdPrice(prdcost);
	   
	   PrdDAOImpl p2 = new PrdDAOImpl();
	   int s1 = p2.addProduct(prd1);
	   out.println("one row is inserted " + s1);
	
		List <Product> al = new ArrayList<Product>();
		   		   al=p2.displayProduct();
		   out.print(al);
	%>
</body>
</html>