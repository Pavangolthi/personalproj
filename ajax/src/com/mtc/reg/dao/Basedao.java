package com.mtc.reg.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Basedao {
	public Connection getConnection() {
		Connection connection = null;
		try {
			//Load the JDBC Drivers
			Class.forName("com.mysql.jdbc.Driver");
			//Step1: Establish the connection
			//connection url
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "RamChandu@2020");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
