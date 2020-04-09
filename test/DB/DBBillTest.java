/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import main.Bill;
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
public class DBBillTest {
    
    public DBBillTest() {
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
     * Test of addBill method, of class DBBill.
     */
    @Test
    public void testAddBill() {
        System.out.print("Add New Bill");
     
         Bill bill=new Bill();
         bill.setBid("IN00016");
         bill.setPaidAmount(2000);
         bill.setNetTotal(1960);
         bill.setServiceCharge(170);
         bill.setOrderId("17");
         bill.setUid("U005");
         
         DBBill dbb=new DBBill();
         boolean res=dbb.addBill(bill);
         
         assertEquals(res, true);
    }

    /**
     * Test of lastID method, of class DBBill.
     */
    @Test
    public void testLastID() {
          System.out.println("get New Bill ID");
        DBBill instance = new DBBill();
        String expResult = "IN00017";
        String result = instance.lastID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBill method, of class DBBill.
     */
    @Test
    public void testGetBill() {
        System.out.print("Get Bill Details by Id");
         String Bill ="IN00016";
         DBBill bill=new DBBill();
         Bill res=bill.getBill(Bill);
         assertEquals("U005", res.getUid());
    }
    
}
