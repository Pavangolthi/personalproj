package com.mtc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mtc.app.bo.Product;

public class ProductDAOImpl extends BaseDAO implements IProductDAO{
	
	private final static String insertQuery = "insert into test.product(id,name,price,description,quantity) values(?,?,?,?,?)";
    //1,2,3,4,5
	private final static String selectQuery = "select * from test.product where id=?";

	private final static String selectAllQuery = "select * from test.product";
	
	private Product toProduct(ResultSet resultSet) {
		Product product = null;
		try {
			product = new Product();
			product.setId(resultSet.getInt("id"));
			product.setName(resultSet.getString("name"));
			product.setPrice(resultSet.getFloat("price"));
			product.setDescription(resultSet.getString("description"));
			product.setQuantity(resultSet.getInt("quantity"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product; 
	}


	@Override
	public Product findById(int id) {
		Product product = null;
		try(Connection connection = getConnection() ) {
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setInt(1, id);
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			//we need to check whether the record exists or not
			if(resultSet.next()) {
				product = toProduct(resultSet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	public List<Product> findAll() {
		ArrayList<Product> prodList = new ArrayList<Product>();
		try(Connection con = getConnection()) {
			Statement statement = con.createStatement();
			//Unlike the preparedStatement, we pass the query as a parameter to the executeQuery() 
			ResultSet resultSet = statement.executeQuery(selectAllQuery);
			
			while(resultSet.next()){
				prodList.add(toProduct(resultSet));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(prodList);
		return prodList;
	
	}
	
	
	
}
