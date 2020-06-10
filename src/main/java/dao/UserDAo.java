/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Kabita
 */

import Database.DBConnection;
import static Database.DBConnection.getConnection;
import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.ClassNotFoundException;
import static java.lang.System.out;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
public class UserDAo {

  
   
    
      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet= null;
      PreparedStatement preparedStatement= null ;
      private static final String CREATE_USERS_SQL= "INSERT INTO registered_user(fullname,username,email,password,account_creation_date)VALUES" +
        " (?, ?,?,?,?);";
    private static final String SELECT_USER_BY_ID = "select * from registered_user where id=?";
      private static final String SELECT_USER_BY_USERNAME = "select * from registered_user where username=?";
    private static final String LIST_ALL_USERS = "select * from registered_user";
    private static final String DELETE_USERS = "delete from registered_user where id = ?;";
    private static final String UPDATE_USERS = "update registered_user set fullname= ?,username= ?,email= ?, password=? where id = ?;";


      
      public UserDAo(){
          
      }
      
    public  void insertUser(String fullname, String username, String email, String password) throws ClassNotFoundException {
         try{
             System.out.println("Reached insert user");
             connection = DBConnection.getConnection();
             preparedStatement = connection.prepareStatement(CREATE_USERS_SQL);
             System.out.println("inserted");
             java.sql.Timestamp accountCreatedDate = new java.sql.Timestamp(new java.util.Date().getTime());
             preparedStatement.setString(1, fullname);
             if (fullname==null)
               fullname="";
             preparedStatement.setString(2, username);
             preparedStatement.setString(3,email);
             preparedStatement.setString(4,password);
             preparedStatement.setTimestamp(5, accountCreatedDate);
             preparedStatement.executeUpdate();
             
       
        Statement st=connection.createStatement();
        ResultSet rs=st.executeQuery("select * from registered_user");
        while(rs.next()){
            rs.getString(1);
            rs.getString(2);
            rs.getString(3);
            rs.getString(4);
            rs.getString(5);

        }
        } catch (Exception e) { 
        out.print(e);

             
             
         
        
    }
    
}
    
    
    public  static List < User > ListAllUsers(){

        // make object of arraylist
        List < User > users = new ArrayList < > ();
        // set  a Connection
        try (Connection connection = getConnection();

            // Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(LIST_ALL_USERS);) {
            System.out.println(preparedStatement);
            
            //  Execute the query 
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String fullname = rs.getString("fullname");
                String username= rs.getString("username");
                String email = rs.getString("email");
                String password=rs.getString("password");
                users.add(new User(id, fullname,username, email, password));
            }
            return users;
        } catch (SQLException e) {
            
        printSQLException(e);
        }
        return null;
    }
    
    
    
     
    
     public static   List < User > SearchUsers(){

        // make object of arraylist
        List < User > users = new ArrayList < > ();
        // set  a Connection
        try (Connection connection = getConnection();

            // Create a statement using connection object"
            PreparedStatement preparedStatement = connection.prepareStatement("select * from registered_user where username=?")) {
            System.out.println(preparedStatement);
            
            //  Execute the query 
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                //int id = rs.getInt("id");
                String username= rs.getString("username");
                
            }
            return users;
        } catch (SQLException e) {
            
        printSQLException(e);
        }
        return null;
    }
    
    public static User selectUser(int id) {
        User user = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String fullname = rs.getString("fullname");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                user = new User(id, fullname,username, email, password);
            }
            return user; 
        } catch (SQLException e) {
            printSQLException(e);
        }
        return null;
    }
    
      public  static void AddUser(User newUser) {
         //To change body of generated methods, choose Tools | Templates.
                 System.out.println(CREATE_USERS_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection();
           PreparedStatement preparedStatement = connection.prepareStatement(CREATE_USERS_SQL)) {
           java.sql.Timestamp accountCreatedDate = new java.sql.Timestamp(new java.util.Date().getTime());
            preparedStatement.setString(1, newUser.getFullname());
            preparedStatement.setString(2, newUser.getUsername());
            preparedStatement.setString(3, newUser.getEmail());
            preparedStatement.setString(4, newUser.getPassword());
             preparedStatement.setTimestamp(5, accountCreatedDate);
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
 
         
    }

    
    
    

    //delete function for the delete the user from list
       public static boolean deleteUser(int id) throws SQLException,NullPointerException{
        boolean rowDeleted;
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_USERS);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }   
       
       
              
    
    
    
    /*public User selectUser(int id) {
        User user = null;
        // Establishing a Connection
        try (Connection connection = getConnection();
           //Create a statement using connection object
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            //  Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            //  Process the ResultSet object.
            while (rs.next()) {
                String fullname = rs.getString("fullname");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                user = new User(id, fullname,username, email, password);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }
    
    
 

    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); 
           PreparedStatement statement = connection.prepareStatement(UPDATE_USERS);) {
            statement.setString(1, user.getFullname());
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.setInt(4, user.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }
    
    */

  
       private  static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
      
      
      
}

}
    

