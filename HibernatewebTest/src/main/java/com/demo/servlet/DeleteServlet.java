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

import antlr.PrintWriterWithSMAP;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	int id=Integer.parseInt(request.getParameter("productid"));
	Product pd=new Product();
	pd.setProductid(id);
	ProductDao pdo=new ProductDaoimpl();
	Product pd1=pdo.searchbyId(pd);
	if(pd1 != null) {
		int del=pdo.deletebyId(pd);
		if(del==1) {
			out.println("deleed record <a href='Displayservlet'> list of all product</a>");
			
		}
		
		else {
			out.println("record not found");
			
		}
	}
	
	}
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter out = response.getWriter();
//        int id = Integer.parseInt(request.getParameter("productid"));
//        Product pd=new Product();
//        // Obtain the instance of ProductDao
//        ProductDao pdo = new ProductDaoimpl();
//
//        try {
//            Product pd1 = pdo.searchbyId(pd);
//            if (pd1 != null) {
//                int del = pdo.deletebyId(pd);
//                if (del == 1) {
//                    out.println("Deleted record <a href='Displayservlet'>List of all products</a>");
//                } else {
//                    out.println("Record not found");
//                }
//            }
//        } catch (Exception e) {
//            out.println("Error occurred during deletion: " + e.getMessage());
//        }
//    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
