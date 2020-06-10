/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kabita
 */
@WebServlet(name = "Forget", urlPatterns = {"/Forget"})
public class Forget extends HttpServlet {
    
    
      @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      response.sendRedirect("Forget.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            Connection conn=DBConnection.getConnection();
            
            String email=request.getParameter("email");
            String pass=request.getParameter("pass");
            
            PreparedStatement st= conn.prepareStatement("update registered_user set password=? where email=?");
            st.setString(2,email);
            st.setString(1, pass);
            
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


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


