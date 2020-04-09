/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.ArrayList;
import java.util.List;
import main.OrderProduct;
import main.PredictedList;
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
public class DBPredictionTest {
    
    public DBPredictionTest() {
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
     * Test of soldProducts method, of class DBPrediction.
     */
    @Test
    public void testSoldProducts() {
        System.out.println("soldProducts");
        DBPrediction instance = new DBPrediction();
        List<OrderProduct> result = instance.soldProducts();
        assertFalse(result.isEmpty());
    }

    /**
     * Test of prediction method, of class DBPrediction.
     */
    @Test
    public void testPrediction() {
        System.out.println("prediction");
        DBPrediction instance = new DBPrediction();
        instance.prediction();
        
         ArrayList<main.Prediction> pred=(ArrayList<main.Prediction>) PredictedList.getData();
        for(int i=0;i<pred.size();i++)
                {
                   System.out.println("PID :"+pred.get(i).getPid()+"  Prediction:"+pred.get(i).getPrediction());
                }
        assertFalse(pred.isEmpty());
    }
    
}
