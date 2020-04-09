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
import org.junit.Ignore;

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
        System.out.println("Test Add Category");
        Category ct = new Category("C008", "Grill Items", "Tasty", 0);
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
        System.out.println("Test Get Category");
        String id = "C008";
        DBCategory instance = new DBCategory();
        String expResult = "Grill Items";
        Category result = instance.getCategory(id);
        assertEquals(expResult, result.getcName());
    }

    /**
     * Test of getAllCategory method, of class DBCategory.
     */
    @Test
    public void testGetAllCategory() {
        System.out.println("Test Get All Category");
        DBCategory instance = new DBCategory();
        List<Category> result = instance.getAllCategory();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of updateCategory method, of class DBCategory.
     */
    @Test
    public void testUpdateCategory() {
        System.out.println("Test Update Category");
        Category ct = new Category("C008", "Grill Items", "Good Tast", 0);
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
        System.out.println("Test Get New Category ID");
        DBCategory instance = new DBCategory();
        String expResult = "C009";
        String result = instance.lastID();
        assertEquals(expResult, result);
    }
    
}
