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
        System.out.println("addUser");
        User ow = new User("U004", "Faroos", "Faroos123", 0,0);
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
        System.out.println("getUser");
        String id = "U004";
        DBUser instance = new DBUser(); 
        User result = instance.getUser(id);
        assertEquals("Faroos", result.getUsername());
        assertEquals("Faroos124", result.getPassword());
    }

    /**
     * Test of getAllUser method, of class DBUser.
     */
    @Test
    @Ignore
    public void testGetAllUser() {
        System.out.println("getAllUser");
        DBUser instance = new DBUser();
        List<User> expResult = null;
        List<User> result = instance.getAllUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of updateUser method, of class DBUser.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        User us = new User("U004", "Faroos", "Faroos124", 0, 0);
        DBUser instance = new DBUser();
        boolean expResult = true;
        boolean result = instance.updateUser(us);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLastID()
    {
        System.out.println("testLastID");   
        DBUser instance = new DBUser(); 
        String result = instance.lastID();
        assertEquals("U005", result);
    }
    
}
