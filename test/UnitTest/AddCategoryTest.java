/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBCategory;
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
public class AddCategoryTest {
    
    public AddCategoryTest() {
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
    public void testAddCategory() {
        System.out.println("addCategory");
        Category ct = new Category("C008", "Grill Items", "Tasty", 0);
        DBCategory instance = new DBCategory();
        boolean expResult = true;
        boolean result = instance.addCategory(ct);
        assertEquals(expResult, result);
    }
}
