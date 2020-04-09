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
public class GetBilldetailsTest {
    
    public GetBilldetailsTest() {
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

    
     @Test
     public void getBillDetails() {
     
         System.out.print("Get Bill Details by Id");
         String Bill ="IN00016";
         
         DBBill bill=new DBBill();
         Bill res=bill.getBill(Bill);
         assertEquals("U005", res.getUid());
     
     }
}
