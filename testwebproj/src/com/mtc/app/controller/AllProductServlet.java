package com.mtc.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.app.bo.Product;
import com.mtc.app.dao.IProductDAO;
import com.mtc.app.dao.ProductDAOImpl;

@WebServlet("/allproducts")
public class AllProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IProductDAO productDAO; 
	private static final String selectAllQuery = "select * from test.product";
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		productDAO = new ProductDAOImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> prodList= productDAO.findAll();
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html><body>");
		printWriter.println("<h2 align=center>All Products<h2>");
		printWriter.println("<div align=center>");
		printWriter.println("<table id=\"myTable\" border=2>");
			printWriter.println("<tr><th>Id</th><th>Name</th><th>Price</th><th>Quantity</th><th>Description</th>");
			for (Product product : prodList) {
				printWriter.println("<tr id =row"+product.getId()+"><td id=productId value=prodId>"+product.getId()+"</td><td id=productName >"+product.getName()+"</td><td id=productPrice>"+product.getPrice()+"</td><td id=productQuantity>"+product.getQuantity()+"</td><td id=productDesc>"+product.getDescription()+"</td><td onclick=rowEdit("+product.getId()+")> <input type=submit value=Edit></td><td onclick=deleteRow("+product.getId()+")><input type=submit value=Delete></td>");
			}
		printWriter.println("</table></div>");
		printWriter.println("<script type=text/javascript> function deleteRow(y){document.getElementById(\"row\"+y).outerHTML=\"\";}; function rowEdit(x){var tbName,tbLen,check,id,name=\"\",price=\"\",quantity=\"\",description=\"\"; tbName = document.getElementById(\'myTable\'); tbLen=tbName.rows.length; for(var i=1; i<tbLen; i++){check=tbName.rows[i].cells[0].innerHTML; if(check==x){tbName.rows[i].cells[1].innerHTML = \"<input type=text value=\"+name+\">\"; tbName.rows[i].cells[2].innerHTML=\"<input type=text value=\"+price+\">\"; tbName.rows[i].cells[3].innerHTML=\"<input type=text value=\"+quantity+\">\"; tbName.rows[i].cells[4].innerHTML= \"<input type=text value=\"+description+\">\"}}}; </script>");
		printWriter.println("</body></html>");
			
		
	}
	
	/*
	 * public static List<Product> findAll(){ ArrayList<Product> productList = new
	 * ArrayList<Product>(); try { Class.forName("com.mysql.jdbc.Driver");
	 * Connection connection =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root",
	 * "RamChandu@2020"); Statement statement = connection.createStatement();
	 * ResultSet resultSet = statement.executeQuery(selectAllQuery);
	 * 
	 * while(resultSet.next()){ Product product = new Product();
	 * 
	 * product.setId(resultSet.getInt("id"));
	 * product.setName(resultSet.getString("name"));
	 * product.setPrice(resultSet.getFloat("price"));
	 * product.setQuantity(resultSet.getInt("quantity"));
	 * product.setDescription(resultSet.getString("description"));
	 * 
	 * 
	 * productList.add(product); }
	 * 
	 * } catch (Exception e) { // TODO: handle exception } return productList; }
	 */

}
