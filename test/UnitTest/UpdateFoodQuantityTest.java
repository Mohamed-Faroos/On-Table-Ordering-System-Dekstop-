/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBFood;
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
public class UpdateFoodQuantityTest {
    
    public UpdateFoodQuantityTest() {
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
    public void updateFoodQuantity()
    {
        System.out.print("Update Food Quantity");
        
        Food food=new Food();
        food.setPid("P017");
        food.setQuantity(30);
        
        DBFood dbf=new DBFood();
        boolean res=dbf.updateQuantity(food);
        
        assertEquals(res, true);
    }
}
