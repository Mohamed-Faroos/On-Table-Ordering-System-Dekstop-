/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBTablet;
import main.Tablet;
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
public class addTabletTest {
    
    public addTabletTest() {
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
    public void testAddTablet() {
        System.out.println("addTablet");
        Tablet tb = new Tablet("T005", "tablet005", 0,0);
        DBTablet instance = new DBTablet();
        boolean expResult = true;
        boolean result = instance.addTablet(tb);
        assertEquals(expResult, result);
    }
}
