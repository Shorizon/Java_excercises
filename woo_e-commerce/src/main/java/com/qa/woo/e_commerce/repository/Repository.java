package com.qa.woo.e_commerce.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Repository {



	public Connection getDbConnection() {
		Connection connection = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db", "root", "root");
				if(connection != null) {
					System.out.println("Connected to database success:: product"  );
				}

			} catch (SQLException e) {
				System.out.println("Invalid credentials");
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver cannot be found, please check");
			e.printStackTrace();
		}

		return connection;

	}
}
