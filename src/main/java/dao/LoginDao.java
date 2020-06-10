/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controller.Login;
import Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import model.User;

public class LoginDao {
public LoginDao() { }

    public User authenticate(String username, String password) throws ClassNotFoundException, SQLException {
        String sql = "select * from registered_user where username=? and password=?";

        
            Connection connection = DBConnection.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            System.out.println("Authenticated");
            ResultSet rs =  preparedStatement.executeQuery();
                 
        User user = null;
 
        if (rs.next()) {
            user = new User();
            user.setFullname(rs.getString("fullname"));
            user.setEmail(rs.getString("email"));
            user.setUsername(rs.getString("username"));
            
        }
        return user;
            }
        }
       
    


