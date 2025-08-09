<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <style>
        body {
            background-color: #e9e9e9;
            font-family: Arial, sans-serif;
        }

        .login-container {
            width: 350px;
            margin: 120px auto;
            padding: 30px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0px 0px 10px #ccc;
        }

        .login-container h2 {
            text-align: center;
            margin-bottom: 25px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            font-weight: bold;
        }

        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        .login-btn {
            width: 100%;
            padding: 10px;
            background-color: #28a745;
            border: none;
            color: white;
            font-size: 16px;
            margin-top: 10px;
            cursor: pointer;
        }

        .login-btn:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<div class="login-container">
    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" name="email" id="email" required />
        </div>

        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" name="password" id="password" required />
        </div>

        <button type="submit" class="login-btn">Login</button>
    </form>
</div>

</body>
</html>