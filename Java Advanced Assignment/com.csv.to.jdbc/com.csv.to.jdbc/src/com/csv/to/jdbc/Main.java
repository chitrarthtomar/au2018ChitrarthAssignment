package com.csv.to.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {

	private static String JDBC_CONNECTION_URL = 
			"jdbc:mysql://localhost:3306/emp";

	
	public static void main(String[] args) {
		try {

			CSVLoader loader = new CSVLoader(getCon());
			loader.loadCSV("C:\\employee.sql", "CUSTOMER", true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Connection getCon() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(JDBC_CONNECTION_URL);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}

