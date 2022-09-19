package com.jspdemo2.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
	public Connection getConnection() {
		Connection connection  = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "RamChandu@2020");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			return connection;
	}
}
