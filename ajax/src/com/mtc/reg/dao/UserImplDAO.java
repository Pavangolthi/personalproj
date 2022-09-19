package com.mtc.reg.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mtc.reg.bo.User;

public class UserImplDAO extends Basedao implements IUserDAO{
	
	private final static String selectQuery = "select * from test.user";
	//private final static String insertQuery = "insert into user(id,name,username) VALUES(?,?,?);";
	
	@Override
	public User getUserName(String username) {
		User user = null;
		try(Connection connection = getConnection()) {
			Statement statement  = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery);
			while(resultSet.next()) {
				if(username.equals(resultSet.getString("username"))) {
						user = setResultSet(resultSet);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(user.getName()+" "+user.getUsername());
		return user;
	}
	
	public User setResultSet(ResultSet resultSet) throws SQLException {
		User user = new User(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getString("username"));
		System.out.println(user.getId());
		return user;
	}
}
