/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBOrderProduct;
import java.util.List;
import main.Order;
import main.OrderProduct;
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
public class getOrderedItemTest {
    
    public getOrderedItemTest() {
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
     public void testGetOrderedItems() {
     System.out.print("Test Get Ordered Items");
     
     DBOrderProduct dbop=new DBOrderProduct();
     Order order=new Order();
     order.setOrderId("16");
     List<OrderProduct> res=dbop.getOrderedItems(order);
     assertFalse(res.isEmpty());
     
     }
}
