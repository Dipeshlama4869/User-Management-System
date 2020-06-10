<%-- 
    Document   : register
    Created on : May 8, 2020, 2:13:31 PM
    Author     : Kabita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> User Management</title>

     


<style>
 
       
body{
    margin: 0;
    padding: 0;
    background: #a992a9;
    height: 100vh;
    overflow: hidden;
    font-family: 'Noto Sans TC',sans-serif;
}

.center{ 
    margin: 70px auto;
    width: 540px;
    border: 1px solid #3F0F3F;
    border-radius: 5px;
    position: relative;
    background: #3F0F3F;
    border-radius: 10px;
}


.center .header{
    text-align: center;
    font-size: 35px;
    font-weight: 700;
    color: white;
    padding: 5px 0 30px 0;
    margin-top: -20px;
}

form input{
    height: 45px;
    width: 200px;
    font-size: 16px;
    font-weight: 545;
    background: none;
    border: 1px solid #D15FEE;
    border-radius: 2px;
    padding: 0 10px;
    margin-left: 35px;
    outline: none;
    color: white;
}

::placeholder{
    color: #D15FEE;
}

form input.last{
    margin-left: 20px;
}

form input.add{
    margin-left: 20px;
    margin-top: 20px;
}

form input.dob{
    margin-left: 20px;
    margin-top: 20px;
}

input[type="date"]:before {
    content: attr(placeholder) !important;
    color: #D15FEE;
    margin-right: 0.5em;
  }
  input[type="date"]:focus:before,
  input[type="date"]:valid:before {
    content: "";
  }


form input.pass{
    width: 445px;
    margin-top: 20px;
}

form input[type="submit"]{
    margin: 30px 0 40px 35px;
    width: 465px;
    height: 50px;
    font-size: 23px;
    cursor: pointer;
    color: white;
    background: #3A0A3A;
    border: 1px solid #D15FEE;
    border-radius: 25px;
}
form input[type="submit"]:hover{
    opacity: 0.2;
    

}
        
    
    
</style>
    </head>
    <body>
        <h2 style="text-align:center;">Register Here</h2>
         <center>
        <div class="center"> 
           
            <form action="test" method="post">
               
                <input  class="pass" type="text" placeholder="Enter your full name" name="fullname" required="required"/><br>
                
                
                <input class="pass" type="text" placeholder="Enter your username" name="username" required="required"/><br> 
            
                
                <input class="pass" type="email" placeholder="Enter your Email address" name="email" required="required"/><br>
                
                
               
                <input  class="pass" type="password" placeholder="Enter your password" name="password" required="required"/><br>
                
                <span style="display: none;"> Enter minimum 8 character.</span>              
               
                <input   class="pass"type="password" placeholder="Enter your confirm password" name="conpass" required="required"/><br><br>
                
            
         
         
                              
                <input type="Submit" value="Register"/><br>
                
                <div style="color: #fff;">
                <a href="login.jsp">Go to login</a>
                </div>
            </form>
            
        
        </div>
        </center>
    </body>
</html>
