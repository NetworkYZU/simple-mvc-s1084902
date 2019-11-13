<%-- 
    Document   : UnknownStudent
    Created on : Sep 24, 2018, 7:35:46 AM
    Author     : lendle
--%>

<%@page import="lendle.courses.network.simplemvc.SchoolStudent"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            SchoolStudent student=(SchoolStudent)request.getAttribute("student");
        %>
        <h1>Hello, <%=student.getScore()%></h1>
        下次再加油！
    </body>
</html>
