package com.database;

import java.util.*;
import java.sql.*;

public class DbConnection {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/test?verifyServerCertificate=false&useSSL=true";

	static final String USER = "root";
	static final String PASS = "password";

	public static Connection staticConn = null;


	public static void main(String[] args) {
		DbConnection dbConnection = new DbConnection();
	}

	public DbConnection() {
		Statement stmt = null;
		Connection localConn = null;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database server...");
			localConn = DriverManager.getConnection(DB_URL, USER, PASS);
			setConnection(localConn);

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt!=null)
					stmt.close();
			} catch (SQLException se2) {
			}

			try {
				if (localConn!=null)
					localConn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}

	public void setConnection(Connection connection) {
		staticConn = connection;
	}

	public Connection getConnection() {
		return staticConn;
	}

	protected void CreateSimpleDbTables() {
			Statement stmt = null;
			Connection createSimpleDbTablesConn = this.staticConn;

			System.out.println("Creating database");

			String[] sqls = new String[2];

			sqls[0] = "CREATE DATABASE IF NOT EXISTS students";
			sqls[1] = "CREATE TABLE IF NOT EXISTS students.student(id INTEGER AUTO_INCREMENT PRIMARY KEY, name TEXT NOT NULL)";

			System.out.println("sqls length: "+sqls.length);

			for(int x=0; x<(sqls.length); x++) {
				System.out.println("executing: "+sqls[x]);

				try {
					stmt = createSimpleDbTablesConn.createStatement();
					stmt.executeUpdate(sqls[x]);
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			System.out.println("Database created successfully...");
	}
}
