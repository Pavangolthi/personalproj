package com.jspdemo2.app.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jspdemo2.app.bo.User;

public class UserDaoImp  extends BaseDao  implements IUserDao{
	public static String selectQuery = "select * from test.user";
	
	@Override
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<User>(); 
		try(Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery);
			while(resultSet.next()) {
				User user = new User(resultSet.getInt("id"), resultSet.getString("name"),resultSet.getString("username"));
				userList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}

}
