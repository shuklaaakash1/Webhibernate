 package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dem.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoimpl;

import oracle.net.aso.a;

/**
 * Servlet implementation class Addproductservlet
 */
public class Addproductservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
ProductDao pd;
    /**
     * Default constructor. 
     */
    public Addproductservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname=request.getParameter("pname");
		String pcat=request.getParameter("pcat");
		int price=Integer.parseInt(request.getParameter("price"));
		int qty=Integer.parseInt(request.getParameter("qty"));
		Product p1=new Product(pname, pcat, qty, price);
		pd=new ProductDaoimpl();
		pd.addProduct(p1);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("added");
		out.println(p1);
		out.println("<a href='index.jsp'>goto addproduct</a>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
