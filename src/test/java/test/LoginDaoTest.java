/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.LoginDao;
import java.sql.SQLException;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kabita
 */
public class LoginDaoTest {
    
    public LoginDaoTest() {
    }
    
    
    @Test
    public void Authenticate1() throws ClassNotFoundException, SQLException {
        System.out.println("authenticate");
        String username = "hamla";
        String password = "";
        System.out.println("Username= "+ username+", Password= "+ password);
        LoginDao instance = new LoginDao();
        User result = instance.authenticate(username, password);
        assertNull(result);
    }
    @Test
    public void testAuthenticate() throws ClassNotFoundException, SQLException {
        System.out.println("authenticate");
        String username = "";
        String password = "1234";
        System.out.println("Username= "+ username+", Password= "+ password);
        LoginDao instance = new LoginDao();
        User result = instance.authenticate(username, password);
        assertNull(result);
    }
    @Test
    public void testAuthenticate3() throws ClassNotFoundException, SQLException {
        System.out.println("authenticate");
        String username = "";
        String password = "";
        System.out.println("Username= "+ username+", Password= "+ password);
        LoginDao instance = new LoginDao();
        User result = instance.authenticate(username, password);
        assertNull(result);
}
    @Test
    public void testAuthenticate4() throws ClassNotFoundException, SQLException {
        System.out.println("authenticate");
        String username = "kabita";
        String password = "kabita1234";
        System.out.println("Username= "+ username+", Password= "+ password);
        LoginDao instance = new LoginDao();
        User result = instance.authenticate(username, password);
        assertNull(result);
    }
    
}

