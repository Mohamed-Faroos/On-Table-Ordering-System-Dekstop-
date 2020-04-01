/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import main.OrderProduct;
import main.PredictedList;
import main.Prediction;
import weka.classifiers.evaluation.NumericPrediction;
import weka.classifiers.timeseries.WekaForecaster;
import weka.core.Instances;
import weka.core.SerializationHelper;
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
            
            String sql="SELECT * FROM OrderedProduct WHERE order_date >= NOW()-INTERVAL 16 DAY AND order_date <= NOW()+INTERVAL 1 DAY group by pid";
            ps=con.prepareStatement(sql);
            
            rs=util.DBEData(ps);
            
            while(rs.next())
            {
                
                String sql1="SELECT sum(quantity) as Qty,order_date as Date FROM OrderedProduct WHERE order_date >= NOW()-INTERVAL 16 DAY "
                                    + "AND order_date <= NOW()+INTERVAL 1 DAY and pid='"+rs.getString("pid")+"' group by date(order_date)";
                ps1=con.prepareStatement(sql1);
                rs1=util.DBEData(ps1);
                
                int k = 0;
                
                while(rs1.next())
                {
                    k++;
                }
                
                if(k>1)
                {
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
                    query.setQuery("SELECT sum(quantity) as Qty,order_date as Date FROM OrderedProduct WHERE order_date >= NOW()-INTERVAL 10 DAY "
                                    + "AND order_date <= NOW()+INTERVAL 1 DAY and pid='"+pid+"' group by date(order_date)"); //Read table
                    Instances dataset = query.retrieveInstances(); //into data

                    // new forecaster
                    WekaForecaster forecaster=(WekaForecaster) SerializationHelper.read("/Users/Faroos/Desktop/FoodPrediction.model");


                     forecaster.buildForecaster(dataset, System.out);
 
                    // prime the forecaster with enough recent historical data
                    // to cover up to the maximum lag. In our case, we could just supply
                    // the 12 most recent historical instances, as this covers our maximum
                    // lag period
                    forecaster.primeForecaster(dataset);

                    // forecast for 12 units (months) beyond the end of the
                    // training data
                    List<List<NumericPrediction>> forecast = forecaster.forecast(1, System.out);

                    // output the predictions. Outer list is over the steps; inner list is over
                    // the targets
                      List<NumericPrediction> predsAtStep = forecast.get(0);

                      NumericPrediction predForTarget = predsAtStep.get(0);

                    //  System.out.println(" "+pname+" Quantity :" + predForTarget.predicted() + " ");
                      
                      double prediction= predForTarget.predicted();

                        int predic=(int) Math.round(prediction);
                        pred=new PredictedList();
                        pred.setPid(pid);
                        pred.setPname(pname);
                        pred.setPrediction(predic);
                        PredictedList.addItem(pred);


                }
        }catch(Exception e)
        {
            
        }
    }
}
