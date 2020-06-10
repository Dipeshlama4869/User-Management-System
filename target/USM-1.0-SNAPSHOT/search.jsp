<%-- 
    Document   : search
    Created on : Jun 6, 2020, 6:27:59 PM
    Author     : Kabita
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <center>
            <table id="table">
            <tr>
                <td> ID</td>
                <td>FullName</td>
                <td>UserName</td>
                <td>Email</td>
                <td>password</td>

            </tr>
            <% List<User> userlist = (ArrayList<User>) request.getAttribute("searchUser"); %>
            <% for(User user:userlist) {%>

            <tr>
                <td> <%= user.getId()%> </td>
                <td><%= user.getFullname()%></td>
                <td><%= user.getUsername()%></td>
                <td><%= user.getEmail()%></td>
                <td><%= user.getPassword()%></td>
                
              
                
            </tr>
            
            <% } %>

        </table>
    </body>
</html>
