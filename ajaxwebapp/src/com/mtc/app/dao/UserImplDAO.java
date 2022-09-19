package com.mtc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mtc.app.bo.User;

public class UserImplDAO extends Basedao implements IUserDAO{
	
	private final static String selectQuery = "select * from test.user where username=?";
	
	@Override
	public User getUserName(String username) {
		User user = null;
		try(Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				if(username == resultSet.getString("username")) {
					user.setId(resultSet.getInt("id"));
					user.setName(resultSet.getString("name"));
					user.setUsername(resultSet.getString("username"));
					System.out.println(user.getId()+" "+user.getName());
				}
				System.out.println("UserDAoimpl "+user);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return user;
	}
}
