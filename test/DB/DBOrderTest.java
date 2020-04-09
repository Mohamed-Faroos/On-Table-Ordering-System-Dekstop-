/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

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
public class DBOrderTest {
    
    public DBOrderTest() {
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
     * Test of getNewOrders method, of class DBOrder.
     */
    @Test
    public void testGetNewOrders() {
        
         System.out.println("Get New Orders");
         DBOrder dbo=new DBOrder();
         List<Order> res=dbo.getNewOrders();
         assertFalse(res.isEmpty());
    }
    
    /**
     * Test of getOrderedItems method, of class DBOrderProduct.
     */
    @Test
    public void testGetOrderedItems() {
     System.out.println("Test Get Ordered Items");
     DBOrderProduct dbop=new DBOrderProduct();
     Order order=new Order();
     order.setOrderId("17");
     List<OrderProduct> res=dbop.getOrderedItems(order);
     assertFalse(res.isEmpty());
    }

    
    /**
     * Test of prepareOrder method, of class DBOrder.
     */
    @Test
    public void testPrepareOrder() {
        
         System.out.println("add prepared Order");
         DBOrder dbo=new DBOrder();
         int orderID=17;
         boolean res=dbo.prepareOrder(orderID);
         assertEquals(res, true);
    }
    /**
     * Test of getPreparedOrders method, of class DBOrder.
     */
    @Test
    public void testGetPreparedOrders() {
        
         System.out.println("Test Get Prepared Orders");
         DBOrder dbo=new DBOrder();
         List<Order> res=dbo.getPreparedOrders();
         assertFalse(res.isEmpty());
    }
    
    

    /**
     * Test of BillOrder method, of class DBOrder.
     */
    @Test
    public void testBillOrder() {
        
         System.out.println("Test Add Billed Order");
         DBOrder dbo=new DBOrder();
         int orderID=17;
         boolean res=dbo.BillOrder(orderID);
         assertEquals(res, true);
    }

    /**
     * Test of getBilledOrders method, of class DBOrder.
     */
    @Test
    public void testGetBilledOrders() {
        System.out.println("Test Get Billed Orders");
        DBOrder instance = new DBOrder();
        List<Order> result = instance.getBilledOrders();
        assertFalse(result.isEmpty());
        
    }

    
}
