<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%@page import="com.sonata.DAOImpl.ProductDAOImpl"%>
  		<%@page import="com.sonata.Model.Product"%>
  		<%@page import="java.util.List" %>

<% 	String id = request.getParameter("proId");
	String proName = request.getParameter("proName");
	String proPrice = request.getParameter("proPrice");
	
	int proID= Integer.parseInt(id);
	double proPrice1 = Double.parseDouble(proPrice);
	 
	   Product p=new Product();
		p.setProId(proID);
		p.setProName(proName);
		p.setProPrice(proPrice1);
		
		ProductDAOImpl dao=new ProductDAOImpl();
		int s1=dao.addP(p);
		 out.println("one row is inserted " + s1);
		
		List<Product> list=dao.getData();
		for(Product pi:list) {
			
			out.println(pi.getProId());
			out.println(pi.getProName());
			out.println(pi.getProPrice());
		}
	     
	%>
</body>
</html>