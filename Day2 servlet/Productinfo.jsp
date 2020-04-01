<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./InsertProduct.jsp" method="get">
Product Id <input type ="text" name = "prdId" /> <br>
Product Name <input type ="text" name = "prdName" /> <br>
Product cost <input type ="text" name = "prdcost" /> <br>
<input type = "submit" value = "Insert" />
<input type = "reset" value = "Clear" />
</form>
</body>
</html>