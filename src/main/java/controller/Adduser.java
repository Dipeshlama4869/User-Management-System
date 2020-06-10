/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAo;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Adduser", urlPatterns = {"/Adduser"})
public class Adduser extends HttpServlet {
           
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.sendRedirect("addUser.jsp");
    
}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullname = request.getParameter("fname");
        String username= request.getParameter("uname");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        User newUser = new User(fullname,username, email, password);
        UserDAo.AddUser(newUser);
        response.sendRedirect("dashboard.jsp");
        
    }

  
   
}
