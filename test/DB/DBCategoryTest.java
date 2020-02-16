/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.List;
import main.Category;
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
public class DBCategoryTest {
    
    public DBCategoryTest() {
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
     * Test of addCategory method, of class DBCategory.
     */
    @Test
    public void testAddCategory() {
        System.out.println("addCategory");
        Category ct = new Category("C001", "Burger", "Tasty", 0);
        DBCategory instance = new DBCategory();
        boolean expResult = true;
        boolean result = instance.addCategory(ct);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCategory method, of class DBCategory.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        String id = "C001";
        DBCategory instance = new DBCategory();
        String expResult = "Burger";
        Category result = instance.getCategory(id);
        assertEquals(expResult, result.getcName());
    }

    /**
     * Test of getAllCategory method, of class DBCategory.
     */
//    @Test
//    public void testGetAllCategory() {
//        System.out.println("getAllCategory");
//        DBCategory instance = new DBCategory();
//        List<Category> expResult = null;
//        List<Category> result = instance.getAllCategory();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of updateCategory method, of class DBCategory.
     */
    @Test
    public void testUpdateCategory() {
        System.out.println("updateCategory");
        Category ct = new Category("C001", "Burger", "Good Tast", 0);
        DBCategory instance = new DBCategory();
        boolean expResult = true;
        boolean result = instance.updateCategory(ct);
        assertEquals(expResult, result);
    }

    /**
     * Test of lastID method, of class DBCategory.
     */
    @Test
    public void testLastID() {
        System.out.println("lastID");
        DBCategory instance = new DBCategory();
        String expResult = "C002";
        String result = instance.lastID();
        assertEquals(expResult, result);
    }
    
}
