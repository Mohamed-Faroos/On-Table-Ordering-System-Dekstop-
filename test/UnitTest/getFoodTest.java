/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBFood;
import DB.DBUser;
import main.Food;
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
public class getFoodTest {
    
    public getFoodTest() {
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
    public void testGetFood() {
        System.out.println("Get Food By ID");
        String id = "P001";
        DBFood instance = new DBFood(); 
        Food result = instance.getFood(id);
        assertEquals(430, result.getPrice());
        assertEquals("C002", result.getCid());
    }
}
