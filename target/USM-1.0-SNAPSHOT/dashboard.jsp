<%-- 
    Document   : dashboard
    Created on : May 8, 2020, 3:23:35 PM
    Author     : Kabita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
          <%response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);%>
    
    <%
    if(session.getAttribute("user")==null){
        response.sendRedirect("login.jsp");
    }
    %>
        
     <style>
body {
  font-family: "Lato", sans-serif;
   background-color:#a992a9;
}

.sidenav {
  height: 100%;
  width: 160px;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #3f0f3f;
  overflow-x: hidden;
  padding-top: 53px;
}

.sidenav a {
  padding: 6px 8px 6px 16px;
  text-decoration: none;
  font-size: 20px;
  color:white;
  display: block;
  margin-top: 30px;
}

.sidenav a:hover {
  color:black;
}

.main {
  margin-left: 160px; /* Same as the width of the sidenav */
  font-size: 20px; /* Increased text to enable scrolling */
  padding: 0px 10px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>   
    </head>
    <body>
        <h3 style="text-align:center;background-color:#3F0F3F;color: #fff; height:58px;
    margin-top:-10px;">    User Management</h3>
        
        <div class="sidenav">

  <a href="Adminlistsearchuser">List of user</a>
  <a href="Adduser">Add User</a>
  <a href="Logout.jsp">Log Out</a>
  
</div>

<div class="main" style=" border-radius: 25px;
    border: 2px solid #3f0f3f;
    box-shadow: 10px 10px 8px #3f0f3f;
    background-color: #3f0f3f;
    background-position: left top;
    background-repeat: repeat;
    padding: 10px;
    width: 221px;
    color: white;
    height: 115px;
    margin-left: 200px;
    text-align: center;
    margin-top: 37px;
  ">
  
    <b>List of User<br> <br>15</b>
 
  
</div>
        <br>
        
<div style="
      border-radius: 25px;
    border: 2px solid #3f0f3f;
    box-shadow: 10px 10px 8px #3f0f3f;
    background-color: #3f0f3f;
    background-position: left top;
    background-repeat: repeat;
    padding: 10px;
    color: white;
    width: 221px;
    height: 115px;
    font-size: 20px;
    margin-left: 501px;
    text-align: center;
    margin-top: 37px;" >
  
    <b> Blocked User<br><br>  6</b>
 
  
</div><br>
        
        
  <div  style=" 
         border-radius: 25px;
    border: 2px solid #3f0f3f;
    box-shadow: 10px 10px 8px #3f0f3f;
    background-color: #3f0f3f;
    background-position: left top;
    background-repeat: repeat;
    padding: 10px;
    width: 221px;
    font-size: 20px;
    color: white;
    height: 115px;

    margin-left: 915px;
    text-align: center;
    margin-top: 33px;">
  
      <b>Delete User<br> <br> 5</b>
 
  
</div>
              
   
    </body>
</html>
