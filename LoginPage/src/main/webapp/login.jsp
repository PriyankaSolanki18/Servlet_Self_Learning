<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
<h1 align="center">Login Page</h1>
<div align="center">
<form action="LoginServlet" method="post">
	<label for="username">Enter Username:</label>
	<input type="text" id="username" name="username" required><br><br>
	<label for="password">Enter Password:</label>
	<input type="password" id="password" name="password" required><br><br>
	<input type="submit" value="Login">
</form>
</div>
</body>
</html>