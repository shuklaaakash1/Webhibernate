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

/**
 * Servlet implementation class EditData
 */
public class EditData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("pname");
		String cat = request.getParameter("pcat");
		int qty = Integer.parseInt(request.getParameter("qty"));
		int price = Integer.parseInt(request.getParameter("price"));
		Product pd = new Product(id, name, cat, qty, price);
		ProductDao pdao = new ProductDaoimpl();

		pdao.updateProduct(pd);
		out.println("<h2> record update</h2>");
		out.println("<h2> <a href='index.jsp'>goto index page</a></h2>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
