package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dem.bean.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoimpl;

/**
 * Servlet implementation class EditproductServlet
 */
public class EditproductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditproductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("productid"));
		Product pd = new Product();
		pd.setProductid(id);
		ProductDao pdao = new ProductDaoimpl();
		Product pd1 = pdao.searchbyId(pd);
		if (pd1 != null) {
			RequestDispatcher rd = request.getRequestDispatcher("edit.jsp");
			request.setAttribute("product", pd1);
			rd.forward(request, response);
		}

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
