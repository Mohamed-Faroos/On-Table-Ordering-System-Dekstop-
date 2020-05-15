/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBFood;
import java.io.File;
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
public class UpdateFoodTest {
    
    public UpdateFoodTest() {
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
     public void testUpdateFood() {
         System.out.print("Test Update Food");
                       Food fd=new Food();
                       fd.setPid("P017");
                       fd.setPname("Grilled Chicken");
                       fd.setCid("C008");
                       fd.setPrice(450);
                       fd.setQuantity(20);
                       fd.setAvailability(0);
                       
         DBFood dbf=new DBFood();
         boolean result=dbf.updateFoodWithoutImage(fd);
         
         assertEquals(result, true);
     }
}
