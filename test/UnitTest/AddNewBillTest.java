/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBBill;
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
public class AddNewBillTest {
    
    public AddNewBillTest() {
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
    
     @Test
     public void testAddNewBill() {
         
     System.out.print("Add New Bill");
     
         Bill bill=new Bill();
         bill.setBid("17");
         bill.setPaidAmount(2000);
         bill.setNetTotal(1960);
         bill.setServiceCharge(170);
         bill.setOrderId("17");
         bill.setUid("U005");
         
         DBBill dbb=new DBBill();
         boolean res=dbb.addBill(bill);
         
         assertEquals(res, true);
     
     }
}
