<%-- 
    Document   : listUser
    Created on : Jun 2, 2020, 11:37:15 AM
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
          <form method="post" action="Edituser">    
                       

                                                                                                                    
                            <label>Full Name</label> <input type="text" value="${user.fullname}" class="form-control" name="fname" required="required">
                            <br>
                        

                   
                            <label>User Name</label> <input type="text" value="${user.username}" class="form-control" name="uname">
                            <br>
                        
                        
                        
                        <label>Email</label> <input type="text" value="${user.email}" class="form-control" name="email">
                     <br>


                        
                            <label>Password</label> <input type="text" value="${user.password}" class="form-control" name="pass">
                       <br>

                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    </div>
                </div>
            
        
    </body>
</html>
