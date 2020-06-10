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
          <header>
                <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
                    

                  
                </nav>
            </header>
            <br>
            
                        <form method="post" action="Adduser">
                     
                        <fieldset class="form-group">
                            <label> Full Name</label> <input type="text" value="" class="form-control" name="fname" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>User Name </label> <input type="text" value="" class="form-control" name="uname" required="required">
                        </fieldset>

                        <fieldset class="form-group">
                            <label>Email</label> <input type="email" value="" class="form-control" name="email" required="required">
                        </fieldset>
                        
                        <fieldset>
                            <label>Password</label> <input type="password" value="" class="form-control" name="pass" required="required">
                        </fieldset>
                        <button type="submit" class="btn btn-success">Save</button>
                        </form>
                    
               
            
    </body>
</html>
