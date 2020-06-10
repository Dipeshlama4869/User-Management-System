<%-- 
    Document   : UserProfile
    Created on : Jun 2, 2020, 10:52:50 AM
    Author     : Kabita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>User Profile</title>
    </head>
    <%response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);%>
    
    <%
    if(session.getAttribute("user")==null){
        response.sendRedirect("login.jsp");
    }
    %>
    <body>
        
    
    <div class="row">
        <div class="col-xs-12 col-sm-6 col-md-6">
            <div class="well well-sm">
                <div class="row">
                    <div class="col-sm-6 col-md-4">
                       
                            
                        </form>
                    </div>
                    <div class="col-sm-6 col-md-8">
                        <h4>
                            ${user.fullname} </h4>
                        <small>Known as ${user.username} <i class="glyphicon glyphicon-map-marker">
                        </i></small>
                        
                        <p>
                            <i class="glyphicon glyphicon-envelope"></i><p>${user.email}</p>
                            <br />
                            
                            <a href="Logout.jsp">logout</a>
                            <a href="editUser.jsp"> Edit User</a>
                           
                       
                        
                    </div>
                </div>
            </div>
        </div>
    </div>


    </body>
</html>
