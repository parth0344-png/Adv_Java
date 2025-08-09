package com.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static void main(String[] args) {

		String driverClass = "com.mysql.cj.jdbc.Driver";
		String dbUrl = "jdbc:mysql://localhost:3306/jjp";
		String dbUserName = "root";
		String dbPass = "root";
		
		try {
			Class.forName(driverClass);
			Connection con = DriverManager.getConnection(dbUrl,dbUserName,dbPass);
			System.out.println(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
	}
}