/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.List;
import main.Tablet;
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
public class DBTabletTest {
    
    public DBTabletTest() {
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
     * Test of addTablet method, of class DBTablet.
     */
    @Test
    public void testAddTablet() {
        System.out.println("addTablet");
        Tablet tb = new Tablet("T001", "tablet001", 0,0);
        DBTablet instance = new DBTablet();
        boolean expResult = true;
        boolean result = instance.addTablet(tb);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllCategory method, of class DBTablet.
     */
    @Test
    @Ignore
    public void testGetAllCategory() {
        System.out.println("getAllCategory");
        DBTablet instance = new DBTablet();
        List<Tablet> expResult = null;
        List<Tablet> result = instance.getAllTablets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTablet method, of class DBTablet.
     */
    @Test
    public void testGetTablet() {
        System.out.println("getTablet");
        String id = "T001";
        DBTablet instance = new DBTablet();
        Tablet expResult = new Tablet("T001", "tablet001", 0,0);
        Tablet result = instance.getTablet(id);
        assertEquals(expResult.getPassword(), result.getPassword());
    }

    /**
     * Test of updateTablet method, of class DBTablet.
     */
    @Test
    public void testUpdateTablet() {
        System.out.println("updateTablet");
        Tablet tb = new Tablet("T001", "tablet0012", 1,0);
        DBTablet instance = new DBTablet();
        boolean expResult = true;
        boolean result = instance.updateTablet(tb);
        assertEquals(expResult, result);
    }

    /**
     * Test of lastID method, of class DBTablet.
     */
    @Test
    public void testLastID() {
        System.out.println("lastID");
        DBTablet instance = new DBTablet();
        String expResult = "T002";
        String result = instance.lastID();
        assertEquals(expResult, result);
    }
    
}
