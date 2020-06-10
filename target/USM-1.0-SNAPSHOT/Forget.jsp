<%-- 
    Document   : Forget
    Created on : Jun 3, 2020, 6:33:15 PM
    Author     : Kabita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
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
  height: 370px;
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



     </style>

    </head>
    <body>
        <center>
   
            <div class="center">
        <form id="foret" action="Forget" method="post">
             <div class="txt_field">
            <input type="text" name="email" required="required"><br><br>
            <span></span>
        <label>Email</label>
        </div>
            <div class="txt_field">
            <input type="password" name="pass" required="required"> <br><br>
             <span></span>
        <label>Password</label>
        </div>
            <div class="txt_field">
            <input type="password" name="cpass" required="required"><br><br>
             <span></span>
        <label>Confirm Password</label>
        </div>
            <input type="submit" value="Submit" width="100%">
        </form>
                
            </div>
    </center>
    </body>
</html>
