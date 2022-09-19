package com.mtc.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Basedao {
	public Connection getConnection() {
		Connection connection = null;
		try {
			//Load the JDBC Drivers
			System.out.println("before connection");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("after");
			//Step1: Establish the connection
			//connection url
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "RamChandu@2020");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
