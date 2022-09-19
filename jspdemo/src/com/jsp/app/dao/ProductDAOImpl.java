package com.jsp.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jsp.app.bo.Product;

public class ProductDAOImpl extends BaseDAO implements IProductDAO{
	
	public String selectQuery = "select * from test.product where id=?";

	@Override
	public Product findById(int id) {
		Product product = null;
		try(Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				product = new Product(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getFloat("price"), resultSet.getString("description"), resultSet.getInt("quantity"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	
}
