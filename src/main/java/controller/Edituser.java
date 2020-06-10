/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.DBConnection;
import dao.UserDAo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author Kabita
 */
@WebServlet(name = "Edituser", urlPatterns = {"/Edituser"})
public class Edituser extends HttpServlet {
    
     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
                 try{int id = Integer.parseInt(request.getParameter("id"));
        User existUser = UserDAo.selectUser(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editUser.jsp");
        request.setAttribute("user", existUser);
        dispatcher.forward(request, response);
       
        
         }catch(NumberFormatException e ){
             
             e.printStackTrace();
         
         }  
          
       
          
    
         
     

    }
        
     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{    

       try {
            Connection conn=DBConnection.getConnection();
            String email=request.getParameter("email");
            String fname=request.getParameter("fname");
            String uname=request.getParameter("uname");
            String pass=request.getParameter("pass");
            
            PreparedStatement st= conn.prepareStatement("update registered_user set fullname= ?,username= ?, password=? where email= ?");
            st.setString(4, email);
            st.setString(1, fname);
            st.setString(2, uname);
            st.setString(3, pass);
            
            int i=st.executeUpdate();
            
            if(i>0){
                response.sendRedirect("Update.jsp");
            }
            else{
                response.sendRedirect("error.jsp");
            }
        } 
        
        catch(Exception e){
            e.printStackTrace();
        }
    }
}



