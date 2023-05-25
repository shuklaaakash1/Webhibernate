<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.dem.bean.Product" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display All</title>
</head>
<body>
<h3>DisplayAll.jsp</h3>
<%
  List<Product> l = (List<Product>) request.getAttribute("lpd");
  if (l != null) {
%>
<table border="2">
  <tr>
  <th>pid</th>
    <th>pname</th>
    <th>pcat</th>
    <th>price</th>
    <th>qty</th>
    <th>Action</th>
  </tr>
  <% for (Product pd : l) { %>
  <tr>
    <td><%= pd.getProductid() %></td>
     <td><%= pd.getProdname() %></td>
    <td><%= pd.getCatagory() %></td>
    <td><%= pd.getPrice() %></td>
    <td><%= pd.getQuantity() %></td>
    <td>
      <a href="DeleteServlet?productid=<%= pd.getProductid() %>">Delete</a>
      <a href="EditproductServlet?productid=<%= pd.getProductid() %>">Edit</a>
    </td>
  </tr>
  <% } %>
</table>
<%
  } else {
    out.println("No products found.");
  }
%>
</body>
</html>
