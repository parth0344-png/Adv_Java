package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateController")
public class UpdateController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		
		try {
			String dbUserName = "root";
			String dbPassword = "root";	
			String dbDriverName = "com.mysql.cj.jdbc.Driver";
			String dbUrl = "jdbc:mysql://localhost:3306/jjp";
			
			Class.forName(dbDriverName);

			Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);

			PreparedStatement pstmt = con.prepareStatement("select * from users where userId = ?");

			pstmt.setInt(1, Integer.parseInt(userId));
			ResultSet rs = pstmt.executeQuery();
			
			request.setAttribute("rs", rs);
			request.getRequestDispatcher("UpdateUser.jsp").forward(request, response);
			
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
	}
}
