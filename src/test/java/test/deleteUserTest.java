/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.LoginDao;
import dao.UserDAo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class deleteUserTest {
    
    public deleteUserTest() {
    }
  
  
    
   @Test
    public void test(){
    UserDAo test = new UserDAo();
        try {
            boolean output = test.deleteUser(9);
            assertEquals(true, output);
        } catch (SQLException ex) {
            Logger.getLogger(deleteUserTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(deleteUserTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    }
    
    

