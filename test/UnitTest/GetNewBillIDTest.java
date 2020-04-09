/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBBill;
import DB.DBCategory;
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
public class GetNewBillIDTest {
    
    public GetNewBillIDTest() {
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
    public void testLastID() {
        System.out.println("get New Bill ID");
        DBBill instance = new DBBill();
        String expResult = "IN00017";
        String result = instance.lastID();
        assertEquals(expResult, result);
    }
}
