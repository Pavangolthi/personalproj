package com.mtc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.app.bo.Product;
import com.mtc.app.dao.IProductDAO;
import com.mtc.app.dao.ProductDAOImpl;

@WebServlet("/searchproduct")
public class ProductSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final static String findquery = "select * from test.product where id=?";
	IProductDAO productDAO;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		productDAO = new ProductDAOImpl();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("productid"));
		Product product = productDAO.findById(id);
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html><body>");
		printWriter.println("<h2 align=center>Product Record</h2>");
		printWriter.println("<div align=center><table border=2>");
			printWriter.println("<tr><th>Id</th><th>Name</th><th>Price</th><th>Quantity</th><th>Description</th></tr>");
			printWriter.println("<tr><td>"+product.getId()+"</td><th>"+product.getName()+"</th><th>"+product.getQuantity()+"</th><th>"+product.getQuantity()+"</th><th>"+product.getDescription()+"</th></tr>");
		printWriter.println("</table></div></body></html>");
	}
	/*
	 * public static Product findById(int id) { Product product = null; try {
	 * Class.forName("com.mysql.jdbc.Driver"); Connection con =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root",
	 * "RamChandu@2020"); PreparedStatement preparedStatement =
	 * con.prepareStatement(findquery); preparedStatement.setInt(1, id); ResultSet
	 * resultSet = preparedStatement.executeQuery();
	 * 
	 * if(resultSet.next()) { product = new Product();
	 * 
	 * product.setId(resultSet.getInt("id"));
	 * product.setName(resultSet.getString("name"));
	 * product.setPrice(resultSet.getFloat("price"));
	 * product.setQuantity(resultSet.getInt("quantity"));
	 * product.setDescription(resultSet.getString("description")); } }catch
	 * (Exception e) { // TODO: handle exception } return product; }
	 */
}
