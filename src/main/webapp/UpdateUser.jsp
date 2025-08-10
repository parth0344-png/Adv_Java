<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>

<h2>User Registration</h2>

<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>

	<%
			rs.next();
				int userId = rs.getInt("userId");
				String firstName = rs.getString("firstName");

				String lastName = rs.getString("lastName");
				
				String email = rs.getString("email");
				
				String pass = rs.getString("password");
				
				String id = rs.getString("userId");
			%>
<form action="UpdateUserController" method="Get">
    <label for="firstname">User Id:</label>
    <input type="text" id="userId" name="userId" value="<%=id %>" required>
    <br><br>


    <label for="firstname">First Name:</label>
    <input type="text" id="firstName" name="firstName" value="<%=firstName %>" required>
    <br><br>

    <label for="lastname">Last Name:</label>
    <input type="text" id="lastName" name="lastName" value="<%= lastName %>" required>
    <br><br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="<%= email %>" required>
    <br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" value="<%= pass %>>" required>
    <br><br>

    <input type="Submit" value="Register">
</form>

</body>
</html>
