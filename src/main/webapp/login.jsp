<%-- 
    Document   : login
    Created on : May 8, 2020, 2:13:04 PM
    Author     : Kabita
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> User Management</title>
       <script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
<script type="text/javascript"
    src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>
   
    <style>
    
    
       

        
    
    body{
  margin: 0;
  padding: 0;
  font-family: 'Noto Sans TC',sans-serif;
  background: #a992a9;
  height: 100vh;
  overflow: hidden;
}
.center{
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 400px;
  background: #3F0F3F;
  border-radius: 10px;
  border: 1px solid #243342;
}
.center h1{
  text-align: center;
  padding: 0 0 20px 0;
  color: white;
}
.center form{
  padding: 0 40px;
  box-sizing: border-box;
}
form .txt_field{
  position: relative;
  margin: 30px 0;
}
.txt_field input{
  width: 100%;
  padding: 0 5px;
  height: 40px;
  font-size: 16px;
  border: none;
  background: none;
  outline: none;
  border: 1px solid #D15FEE	;
  color: white;
}
.txt_field label{
  position: absolute;
  top: 50%;
  left: 5px;
  color:#D15FEE;
  transform: translateY(-66%);
  font-size: 16px;
  pointer-events: none;
  transition: .5s;
}
.txt_field span::before{
  content: '';
  position: absolute;
  top: 40px;
  left: 0;
  width: 0%;
  height: 2px;
  background: #D15FEE;
  transition: .5s;
}
.txt_field input:focus ~ label,
.txt_field input:valid ~ label{
  top: -5px;
  color: #D15FEE;
}
.txt_field input:focus ~ span::before,
.txt_field input:valid ~ span::before{
  width: 100%;
}
.pass{
  margin: -5px 0 20px 5px;
  color: gold;
  cursor: pointer;
}
.pass:hover{
  text-decoration: underline;
}
input[type="submit"]{
  width: 100%;
  height: 50px;
  border: 1px solid;
  background:#3A0A3A;
  border-radius: 25px;
  font-size: 18px;
  color: #e9f4fb;
  font-weight: 700;
  cursor: pointer;
  outline: none;
}
input[type="submit"]:hover{
  border-color: #FF00FF	;
  transition: .5s;
}
.signup_link{
  margin: 30px 0;
  text-align: center;
  font-size: 16px;
  color: whitesmoke;
}
.signup_link a{
  color: rosybrown;
  text-decoration: none;
}
.signup_link a:hover{
  text-decoration: underline;
}

    
</style>
    
    </head>
    <body>
 <center>
    <div class="center">
     <form id="loinForm" action="Login" method="post" >  
        
        <div class="txt_field">
        <input type="text" name="uname" required="required"/><br/><br/>  
        <span></span>
        <label>Username</label>
        </div>
        <div class="txt_field">
            <input type="password" name="pass" required="required"/><br/><br/>  
        <span></span>
        <label>Password</label>
        </div>
 
         <div class="pass" method="post" action="Forget"><a href="Forget">Forget Password?</a></div>
                <input type="submit" value="Login">
                <div class="signup_link">
                    Not a member? <a href="register.jsp">Signup</a>
                </div>
                
    </div>

</form> 
     <br>
</center>

        
        <script type="text/javascript">
 
    $(document).ready(function() {
        $("#loginForm").validate({
            rules: {
                unmae: {
                    required: true,
                    uname: true
                },
         
                pass: "required",
            },
             
            messages: {
                uname: {
                    required: "Please enter username",
                    uname: "Please enter a valid username"
                },
                 
                pass: "Please enter password"
            }
        });
 
    });
</script>
    </body>
</html>
