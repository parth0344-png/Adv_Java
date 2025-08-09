<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" />

</head>
<body>
	<h2>List User</h2>

	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>

`
	<table class="table table-hover table-bordered">
		<thead class="bg-primary">
			<tr>  
				<td>action</td>
				<td>action</td>
				<td>Id</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Email</td>
				<td>password</td>
			</tr>
		</thead>
		<tbody>
			<%
			while (rs.next()) {
				int userId = rs.getInt("userId");
				String firstName = rs.getString("firstName");

				String lastName = rs.getString("lastName");
				
				String email = rs.getString("email");
				
				String pass = rs.getString("password");
			%>
			<tr>
				<td><a href="deleteUser?userId=<%=userId %>">delete</a></td>
				<td><a href="UpdateController?userId=<%=userId %>">Update</a></td>
				<td><%=userId%></td>
				<td><%=firstName%></td>
				<td><%=lastName%></td>
				<td><%=email%></td>
				<td><%=pass%></td>
				
			</tr>
			<%
			}
			%>
		</tbody>
	</table>


</body>
</html>