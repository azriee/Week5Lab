<%-- 
    Document   : home
    Created on : Feb 13, 2023, 1:48:58 AM
    Author     : azriee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${user.username}.</h2>
        <a href="login?logout">Log out</a>
        
    </body>
</html>
