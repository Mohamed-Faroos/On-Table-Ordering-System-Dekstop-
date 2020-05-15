/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.File;
import java.util.List;
import main.Category;
import main.Food;
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
public class DBFoodTest {
    
    public DBFoodTest() {
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
     * Test of addFood method, of class DBFood.
     */
    @Test
    public void testAddFood() {
        System.out.print("Test Add Food");
         File file=new File("/Users/Faroos/Desktop/foods/grilled/04.grill-chicken.jpg");
         String path=file.getAbsolutePath();
                       Food fd=new Food();
                       fd.setPid("P017");
                       fd.setPname("Grilled Chicken");
                       fd.setCid("C008");
                       fd.setPrice(300);
                       fd.setQuantity(20);
                       fd.setAvailability(0);
                       fd.setImage(path);
                       
         DBFood dbf=new DBFood();
         boolean result=dbf.addFood(fd);
         
         assertEquals(true, result);
    }

    /**
     * Test of getCategory method, of class DBFood.
     */
    @Test
    public void testGetCategory() {
        System.out.println("Test Get Available Category");
        DBFood instance = new DBFood();
        List<Category> result = instance.getCategory();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of lastID method, of class DBFood.
     */
    @Test
    public void testLastID() {
        System.out.println("Test Get New Food ID");
        DBFood instance = new DBFood();
        String expResult = "P018";
        String result = instance.lastID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllProducts method, of class DBFood.
     */
    @Test
    public void testGetAllProducts() {
        System.out.println("getAllProducts");
        DBFood instance = new DBFood();
        List<Food> result = instance.getAllProducts();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getSearchedProducts method, of class DBFood.
     */
    @Test
    public void testGetSearchedProducts() {
        System.out.println("getSearchedProducts");
        String word = "chicken";
        DBFood instance = new DBFood();
        List<Food> result = instance.getSearchedProducts(word);
        assertFalse(result.isEmpty());
    }

    /**
     * Test of getFood method, of class DBFood.
     */
    @Test
    public void testGetFood() {
        System.out.println("getFood");
        String id = "P017";
        DBFood instance = new DBFood();
        Food result = instance.getFood(id);
        assertEquals("Grilled Chicken", result.getPname());
    }

    /**
     * Test of updateFoodWithImage method, of class DBFood.
     */
    @Test
    public void testUpdateFoodWithImage() {
        System.out.println("updateFoodWithImage");
        
        File file=new File("/Users/Faroos/Desktop/foods/grilled/04.grill-chicken.jpg");
         String path=file.getAbsolutePath();
                       Food fd=new Food();
                       fd.setPid("P017");
                       fd.setPname("Grilled Chicken");
                       fd.setCid("C008");
                       fd.setPrice(400);
                       fd.setQuantity(20);
                       fd.setAvailability(0);
                       fd.setImage(path);
        DBFood instance = new DBFood();
        boolean expResult = true;
        boolean result = instance.updateFoodWithImage(fd);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateFoodWithoutImage method, of class DBFood.
     */
    @Test
    public void testUpdateFoodWithoutImage() {
        System.out.println("updateFoodWithoutImage");
        
                       Food fd=new Food();
                       fd.setPid("P017");
                       fd.setPname("Grilled Chicken");
                       fd.setCid("C008");
                       fd.setPrice(400);
                       fd.setQuantity(20);
                       fd.setAvailability(0);
                       
        DBFood instance = new DBFood();
        boolean expResult = true;
        boolean result = instance.updateFoodWithoutImage(fd);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateQuantity method, of class DBFood.
     */
    @Test
    public void testUpdateQuantity() {
        
        System.out.print("Update Food Quantity");
        Food food=new Food();
        food.setPid("P017");
        food.setQuantity(30);
        DBFood dbf=new DBFood();
        boolean res=dbf.updateQuantity(food);
        assertEquals(res, true);
    }

    /**
     * Test of updateAllQuantity method, of class DBFood.
     */
    @Test
    public void testUpdateAllQuantity() {
        System.out.println("updateAllQuantity");
        DBFood instance = new DBFood();
        boolean expResult = true;
        boolean result = instance.updateAllQuantity();
        assertEquals(expResult, result);
    }

    
}
