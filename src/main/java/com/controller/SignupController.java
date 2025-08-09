package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignupController extends HttpServlet{

		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
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
				
				
				PreparedStatement pstmt = con.prepareStatement("insert into users (firstName,lastName,email,password) values (?,?,?,?)");
				pstmt.setString(1, firstName);
				pstmt.setString(2, lastName);
				pstmt.setString(3, email);
				pstmt.setString(4, password);
				
				int record = pstmt.executeUpdate();  
				System.out.println(record+" record inserted...");
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			response.sendRedirect("Login.jsp");

		}
	
}