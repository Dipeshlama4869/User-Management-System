<%-- 
    Document   : Logout
    Created on : Jun 3, 2020, 7:35:41 PM
    Author     : Kabita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%
        session.invalidate();
        response.sendRedirect("index.jsp");
        %>
        
        <h1>logout success</h1>
        <h1>Hello World!</h1>
    </body>
</html>
