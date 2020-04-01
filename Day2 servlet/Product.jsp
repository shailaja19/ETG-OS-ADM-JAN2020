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

<form action="./ProductSession.jsp" method="get">
Product Id <input type ="text" name = "prdId" /> <br>
Product Name <input type ="text" name = "prdName" /> <br>
Product cost <input type ="text" name = "prdCost" /> <br>
<input type = "submit" value = "Insert" />
<input type = "reset" value = "Clear" />
</form>

</body>
</html>