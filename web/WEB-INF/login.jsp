<%-- 
    Document   : login
    Created on : Feb 13, 2023, 1:46:31 AM
    Author     : azriee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post">
            <label for="username">Username:</label>
            <input type="text" name="username" value=""><br>
            <label for="password">Password:</label>
            <input type="password" name="password" value=""><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
