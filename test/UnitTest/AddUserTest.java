/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBUser;
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
public class AddUserTest {
    
    public AddUserTest() {
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

     //Add User Testing
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User ow = new User("U006", "Rushad", "rushad123", 1,0);
        DBUser instance = new DBUser();
        boolean expResult = true;
        boolean result = instance.addUser(ow);
        assertEquals(expResult, result);
    }
}
