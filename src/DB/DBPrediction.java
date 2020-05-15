/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import main.OrderProduct;
import main.PredictedList;
import main.Prediction;
import weka.classifiers.evaluation.NumericPrediction;
import weka.classifiers.timeseries.WekaForecaster;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.converters.ConverterUtils.DataSource;
import weka.experiment.InstanceQuery;

/**
 *
 * @author Faroos
 */
public class DBPrediction {

    DBUtil util;
    Connection con;
    ArrayList<OrderProduct> op;
    PreparedStatement ps,ps1;
    ResultSet rs,rs1;
    Prediction  pred;

    
    public DBPrediction() {
        
    util=DBUtil.getIntence();
    con=util.getConnection();
    
    }
    
    public List<OrderProduct> soldProducts()
    {
        op=new ArrayList<>();
        try {
            //get sold products on previous 7 day and group by ID
            String sql="SELECT * FROM OrderedProduct "
                        + "WHERE order_date >= NOW()-INTERVAL 7 DAY AND"
                        + " order_date <= NOW()+INTERVAL 1 DAY group by pid";
            
            ps=con.prepareStatement(sql);
            rs=util.DBEData(ps);
            
            while(rs.next())
            {
                //get specific product total quantity and date
                String sql1="SELECT sum(quantity) as Qty,order_date as Date FROM OrderedProduct WHERE"
                        + " order_date >= NOW()-INTERVAL 7 DAY "
                        + "AND order_date <= NOW()+INTERVAL 1 DAY and "
                        + "pid='"+rs.getString("pid")+"' group by date(order_date)";
                ps1=con.prepareStatement(sql1);
                rs1=util.DBEData(ps1);
                
                int k = 0;               
                while(rs1.next())
                {
                    k++;
                }
                
                if(k>1)
                {
                //Set Sold products details in to Array List    
                    OrderProduct orp=new OrderProduct();
                    orp.setPid(rs.getString("pid"));
                    orp.setName(rs.getString("pname"));
                    op.add(orp);
                
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return op;
    }
    
    
    public void prediction()
    {
        try{
                //Get All the Sold product between previous seven days.
                ArrayList<OrderProduct> orp=(ArrayList<OrderProduct>) soldProducts();
                PredictedList.clear();
                
                for(int i=0;i<orp.size();i++)
                {
                    
                    String pid=orp.get(i).getPid();
                    String pname=orp.get(i).getName();
                    
                    InstanceQuery query = new InstanceQuery();
                    query.setDatabaseURL("jdbc:mysql://localhost/OTOS");
                    query.setUsername("root");
                    query.setPassword("");
                    query.setQuery("SELECT sum(quantity) as Qty,order_date as Date FROM OrderedProduct "
                                    + "WHERE order_date >= NOW()-INTERVAL 7 DAY "
                                    + "AND order_date <= NOW()+INTERVAL 1 DAY and pid='"+pid+"' "
                                    + "group by date(order_date)"); //Read table
                    //Conver dataset
                    Instances dataset = query.retrieveInstances(); //into data
                    System.out.println(dataset);

                    //Load Model 
                    InputStream in =getClass().getResourceAsStream("/Assets/FoodPrediction.model");
                    WekaForecaster forecaster=(WekaForecaster) SerializationHelper.read(in);

                    //Load Dataset in to forecaser
                    forecaster.buildForecaster(dataset, System.out);
                    forecaster.primeForecaster(dataset);

                    // Predict Value
                    List<List<NumericPrediction>> forecast = forecaster.forecast(1, System.out);
                    List<NumericPrediction> predsAtStep = forecast.get(0);
                    NumericPrediction predForTarget = predsAtStep.get(0);
                    
                    //Get Predicted Value
                    double prediction= predForTarget.predicted();
                    int predic=(int) Math.round(prediction);
                    int predictionValue=Math.abs(predic);
                    
                    //Set Predicted Value and Product details
                        pred=new PredictedList();
                        pred.setPid(pid);
                        pred.setPname(pname);
                        pred.setPrediction(predictionValue);
                        PredictedList.addItem(pred);


                }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), e);

        }
    }
}
