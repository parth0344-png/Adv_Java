<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Delete User</title>
</head>
<body>
    <h2>Delete User</h2>
    <form action="deleteUser" method="Get">
        <label for="userId">User ID to Delete:</label>
        <input type="text" name="userId" required>
        <br><br>
        <input type="submit" value="Delete">
    </form>
</body>
</html>