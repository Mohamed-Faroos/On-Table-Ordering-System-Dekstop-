/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitTest;

import DB.DBPrediction;
import java.util.ArrayList;
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
public class PredictionTest {
    
    public PredictionTest() {
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
     public void testPrediction() {
         
        System.out.print("Test Prediction");
        DBPrediction dbp=new DBPrediction();
        dbp.prediction();
        
        ArrayList<main.Prediction> pred=(ArrayList<main.Prediction>) PredictedList.getData();
        for(int i=0;i<pred.size();i++)
                {
                   System.out.println("PID :"+pred.get(i).getPid()+"  Prediction:"+pred.get(i).getPrediction());
                }
        assertFalse(pred.isEmpty());
     }
}
