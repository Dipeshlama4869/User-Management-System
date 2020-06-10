
import dao.UserDAo;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class search extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

   
        List< User> listUser = UserDAo.SearchUsers();
        request.setAttribute("listUser", listUser);
        System.out.println("searchUser" + listUser);
     
      RequestDispatcher dispatcher = request.getRequestDispatcher("listUser.jsp");
       dispatcher.forward(request, response);
          

}
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List< User> listUser = UserDAo.SearchUsers();
        request.setAttribute("searchUser", listUser);
        System.out.println("searchUser" + listUser);
     
      RequestDispatcher dispatcher = request.getRequestDispatcher("search.jsp");
       dispatcher.forward(request, response);
          
        
    }
}
