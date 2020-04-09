/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.List;
import main.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Faroos
 */
public class DBUserTest {
    
    public DBUserTest() {
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

    /**
     * Test of addUser method, of class DBUser.
     */
    @Test
    public void testAddUser() {
        System.out.println("Test Add User");
        User ow = new User("U006", "Rushad", "rushad123", 1,0);
        DBUser instance = new DBUser();
        boolean expResult = true;
        boolean result = instance.addUser(ow);
        assertEquals(expResult, result);
    }

    /**
     * Test of getUser method, of class DBUser.
     */
    @Test
    public void testGetUser() {
        System.out.println("Test Get User");
        String id = "U006";
        DBUser instance = new DBUser(); 
        User result = instance.getUser(id);
        assertEquals("Rushad", result.getUsername());
        assertEquals("rushad456", result.getPassword());
    }

    /**
     * Test of getAllUser method, of class DBUser.
     */
    @Test
    public void testGetAllUser() {
        System.out.println("Test Get All User");
        DBUser instance = new DBUser();
        List<User> result = instance.getAllUser();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of updateUser method, of class DBUser.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("Test Update User");
        User us = new User("U006", "Rushad", "rushad456", 1, 0);
        DBUser instance = new DBUser();
        boolean expResult = true;
        boolean result = instance.updateUser(us);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLastID()
    {
        System.out.println("Test Last ID");   
        DBUser instance = new DBUser(); 
        String result = instance.lastID();
        assertEquals("U007", result);
    }
    
      
    @Test
    public void testLogin() {
        System.out.println("Test Login");
        User us = new User();
        us.setUid("U006");
        us.setPassword("rushad123");
        us.setUserType(1);
        DBLogin instance = new DBLogin();
        
        User result = instance.login(us);
        assertEquals("U006", result.getUid());
        assertEquals("rushad123", result.getPassword());
        assertEquals(1, result.getUserType());

    }
    
}
