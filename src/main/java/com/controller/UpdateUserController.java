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

@WebServlet("/UpdateUserController")
public class UpdateUserController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer userId = Integer.parseInt(request.getParameter("userId"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			
				String dbUserName = "root";
				String dbPassword = "root";
				String dbDriver = "com.mysql.cj.jdbc.Driver";
				String dbUrl = "jdbc:mysql://localhost:3306/jjp";

				Class.forName(dbDriver);

				Connection con = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
				
				PreparedStatement pstmt = con.prepareStatement("UPDATE users SET firstName = ?, lastName = ?, email = ?, password = ? WHERE userId = ?");
				pstmt.setInt(5, userId);
				pstmt.setString(1, firstName);
				pstmt.setString(2, lastName);
				pstmt.setString(3, email);
				pstmt.setString(4, password);
				
				int record = pstmt.executeUpdate(); 
				System.out.println(record+" record updated...");
				
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("listuser");
	}
}