<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Addprod.jsp</h3>
<form action="Addproductservlet">
product name=<input type="text" name="pname">
<br><br>
product catagory=<input type="text" name="pcat">
<br><br>
product quantity=<input type="text" name="qty">
<br><br>
product price=<input type="text" name="price">
<br><br>
<input type="submit" value="Add product">
<input type="reset" >
</form>

</body>
</html>