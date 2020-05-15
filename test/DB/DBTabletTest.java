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
        System.out.println("Test Add Tablet");
        Tablet tb = new Tablet("T005", "tablet005", 0,0);
        DBTablet instance = new DBTablet();
        boolean expResult = true;
        boolean result = instance.addTablet(tb);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllCategory method, of class DBTablet.
     */
    @Test
    public void testGetAllTablets() {
        System.out.println("Test Get All Tablets");
        DBTablet instance = new DBTablet();
        List<Tablet> result = instance.getAllTablets();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getTablet method, of class DBTablet.
     */
    @Test
    public void testGetTablet() {
        System.out.println("Test Get Tablet");
        String id = "T005";
        DBTablet instance = new DBTablet();
        Tablet result = instance.getTablet(id);
        assertEquals("tablet005", result.getPassword());
    }

    /**
     * Test of updateTablet method, of class DBTablet.
     */
    @Test
    public void testUpdateTablet() {
        System.out.println("Test Update Tablet");
        Tablet tb = new Tablet("T005", "tablet0051", 1,0);
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
        System.out.println("Test Get New Tablet ID");
        DBTablet instance = new DBTablet();
        String expResult = "T006";
        String result = instance.lastID();
        assertEquals(expResult, result);
    }
    
}
