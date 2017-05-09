package com.database;

import java.util.*;
import java.sql.*;


public class DbConnectionTest {

	public static void main(String[] args) {
		DbConnection dbConn = new DbConnection();

		System.out.println("DbConnectionTest dbConn: "+dbConn.getConnection());
	}
}
