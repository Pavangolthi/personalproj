package com.jsp.app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.app.bo.Product;
import com.jsp.app.dao.IProductDAO;
import com.jsp.app.dao.ProductDAOImpl;


@WebServlet("/productserv")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IProductDAO productdao;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		productdao = new ProductDAOImpl();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int prodId = Integer.parseInt(request.getParameter("productid"));
		Product product = productdao.findById(prodId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("products.jsp");
		request.setAttribute("product", product);
		dispatcher.forward(request, response);
	}

}
