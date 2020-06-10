/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDAo;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import model.User;

/**
 *
 * @author Kabita
 */
@WebServlet(name = "Adminlistsearchuser", urlPatterns = {"/Adminlistsearchuser"})
public class Adminlistsearchuser extends HttpServlet {

 

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        
        List< User> listUser = UserDAo.ListAllUsers();
        request.setAttribute("listUser", listUser);
        System.out.println("listusre" + listUser);
     
      RequestDispatcher dispatcher = request.getRequestDispatcher("listUser.jsp");
       dispatcher.forward(request, response);
     
        
       
}

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException, NullPointerException {
        
  List< User> listUser = UserDAo.ListAllUsers();
        request.setAttribute("listUser", listUser);
        System.out.println("listusre" + listUser);
     
       RequestDispatcher dispatcher = request.getRequestDispatcher("listUser.jsp");
       dispatcher.forward(request, response);
       

    }

}


