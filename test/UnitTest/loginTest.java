/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBLogin;
import main.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Faroos
 */
public class loginTest {
    
    public loginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
       @Test
    public void testLogin() {
        System.out.println("login");
        User us = new User();
        us.setUid("U001");
        us.setPassword("admin123");
        us.setUserType(0);
        DBLogin instance = new DBLogin();
        
        User result = instance.login(us);
        assertEquals("U001", result.getUid());
        assertEquals("admin123", result.getPassword());
        assertEquals(0, result.getUserType());

    }
}
