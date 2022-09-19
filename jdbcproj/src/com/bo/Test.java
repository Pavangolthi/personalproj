package com.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test{
	private final static String insertQuery = "insert into test.product(id,name,price,description,quantity) values(?,?,?,?,?)";
																											     //1,2,3,4,5
	private final static String selectQuery = "select * from test.product where id=?";
	
	private final static String selectAllQuery = "select * from test.product";
	
	public static List<Product> findAll(){
		ArrayList<Product> productList = new ArrayList<Product>();
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "RamChandu@2020")) {
			//When there are no bind parameters in the query then we can use the Statement object
			Statement statement = con.createStatement();
			//Unlike the preparedStatement, we pass the query as a parameter to the executeQuery() 
			ResultSet resultSet = statement.executeQuery(selectAllQuery);
			
			while(resultSet.next()){
			
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getFloat("price"));
				product.setDescription(resultSet.getString("description"));
				product.setQuantity(resultSet.getInt("quantity"));
				productList.add(product);
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		return productList;
	}
	
	public static Product findById(int id) {
		Product product =null;
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "RamChandu@2020")) {
			
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			//we need to check whether the record exists or not
			if(resultSet.next()) {
				product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("name"));
				product.setPrice(resultSet.getFloat("price"));
				product.setDescription(resultSet.getString("description"));
				product.setQuantity(resultSet.getInt("quantity"));
			}
			connection.close();
			return product;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	public static void add(Product product) {																	 
		try {
			
			//Load the JDBC Drivers
			Class.forName("com.mysql.jdbc.Driver");
			
			//Step1: Establish the connection
			//connection url
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "RamChandu@2020");
			
			//Step2: Create PreparedStatement object
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			//Step3: Replace the bind parameters with values
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setFloat(3, product.getPrice());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setInt(5, product.getQuantity());
			
			//Returns an integer value which 
			int noOfRows = preparedStatement.executeUpdate();
			
			if(noOfRows == 1) {
				System.out.println("Record added successfull");
			}
			
			connection.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		Product product = new Product(24, "Watch",200, 40,"Rolex");
		//add(product);
		Product product1 = findById(1);
		System.out.println(product1);
		
		ArrayList<Product> productList = (ArrayList<Product>) findAll();
		
		for (Product product2 : productList) {
			System.out.println(product2);
		}
	}
}
