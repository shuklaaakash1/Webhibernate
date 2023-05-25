<%@page import="com.dem.bean.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Product p1 = (Product) request.getAttribute("product");
	%>
	<form action="EditData" method="get">
		product id=<input type="text" name="id" readonly="readonly"
			value=<%=p1.getProductid()%>> <br>
		<br> product name=<input type="text" name="pname"
			value=<%=p1.getProdname()%>> <br>
		<br> product catagory=<input type="text" name="pcat"
			value=<%=p1.getCatagory()%>> <br>
		<br> product quantity=<input type="text" name="qty"
			value=<%=p1.getQuantity()%>> <br>
		<br> product price=<input type="text" name="price"
			value=<%=p1.getPrice()%>> <br>
		<br> <input type="submit" value="Edit Product">

	</form>
</body>
</html>