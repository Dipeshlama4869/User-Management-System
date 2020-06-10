<%-- 
    Document   : listUser
    Created on : Jun 2, 2020, 11:37:15 AM
    Author     : Kabita
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.User"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        #table{
            
        background-color: #f2f2f2;
         border: 1px solid tomato;
        }
        #table.tr:hover{background-color: #fff;}
        
            
         #table.th, td {
                border-bottom: 1px solid tomato;
                
                padding: 15px;
                text-align: left;
}

        

        </style>
    </head>
    <body>
                    <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato;width: 100%;height: 40px; " >
                    <div>
                        <h1 style="padding: 10px;"> User Management </h1>
                    </div>

                   
            </header>
 
        

        <h2 style="text-align: center":>List Of User
            
                <form  action="search"  method="post">
                    <input type="text" name="uname" placeholder="Enter username" required="required">
                    <input type="submit" value="search">
            </form>
        
        </h2>
        

        <center>
            <table id="table">
            <tr>
                <td> ID</td>
                <td>FullName</td>
                <td>UserName</td>
                <td>Email</td>
                <td>password</td>

            </tr>
            <% List<User> userlist = (ArrayList<User>) request.getAttribute("listUser"); %>
            <% for(User user:userlist) {%>

            <tr>
                <td> <%= user.getId()%> </td>
                <td><%= user.getFullname()%></td>
                <td><%= user.getUsername()%></td>
                <td><%= user.getEmail()%></td>
                <td><%= user.getPassword()%></td>
                
                <td><a href="Edituser?id=<%=user.getId() %>">Edit</a> <a href="delete?id=<%=user.getId() %>">Delete</a></td>
                
            </tr>
            
            <% } %>

        </table>
            <br>
           
        </center>
    </body>
</html>