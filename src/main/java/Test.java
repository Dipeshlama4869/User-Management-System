/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;


import dao.UserDAo;
import model.User;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Kabita
 */
@WebServlet(urlPatterns = {"/test"})
public class Test extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.sendRedirect("register.jsp");
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           UserDAo userDao = new UserDAo();
           System.out.println("reached into post method");
        try {
            
           
            userDao.insertUser(request.getParameter("fullname"),
                    request.getParameter("username"),
                    request.getParameter("email"),
                    request.getParameter("password"));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
           response.sendRedirect("registered.jsp");
        
        
       
        
        
      
    }
}


/*
    private static final long serialVersionUID = 1L;
    private JDBC jdbc;
    
    @Override
     public void init() {
        jdbc = new JDBC(); 
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String fullname=request.getParameter("fname");
        String username=request.getParameter("uname");
        String email=request.getParameter("email");
        String password=request.getParameter("pass");
        String confirmpass=request.getParameter("conpass");
        System.out.println("do post on register");
        
    if( fullname.isEmpty()){
            response.sendRedirect("register.jsp");
            System.out.println("enter fullname");
            
            } else if(username.isEmpty()){
            response.sendRedirect("register.jsp");
            System.out.println("enter username");
            
            }  else if(email.isEmpty()){
            response.sendRedirect("register.jsp");
            System.out.println("enter email");
            }
            
            else if( password.isEmpty()){
            response.sendRedirect("register.jsp");
             System.out.println("enter password");
            
            } else if(  !password.equals(confirmpass)){
            response.sendRedirect("register.jsp");
            System.out.println("enter matched password");
            } else{
                
                response.sendRedirect("registered.jsp");

    
    
            }
    
        User user = new User();
        user.setFullname(fullname);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
         try {
            jdbc.registerEmployee(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

     
    }
      
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
    }
}
    */






    
   /* @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String fullname=request.getParameter("fname");
        String username=request.getParameter("uname");
        String email=request.getParameter("email");
        String password=request.getParameter("pass");
        String confirmpass=request.getParameter("conpass");
        System.out.println("do post on register");
        
    if( fullname.isEmpty()){
            response.sendRedirect("register.jsp");
            System.out.println("enter fullname");
            
            } else if(username.isEmpty()){
            response.sendRedirect("register.jsp");
            System.out.println("enter username");
            
            }  else if(email.isEmpty()){
            response.sendRedirect("register.jsp");
            System.out.println("enter email");
            }
            
            else if( password.isEmpty()){
            response.sendRedirect("register.jsp");
             System.out.println("enter password");
            
            } else if(  !password.equals(confirmpass)){
            response.sendRedirect("register.jsp");
            System.out.println("enter matched password");
            } else{
                
                response.sendRedirect("registered.jsp");

    
    
                        }
    
      
       
    
    
    
    }
    
    }


    */
    
    
 

            
    
     
     
        
     
        
        
      
            
           


    


    

    
   
   


    

