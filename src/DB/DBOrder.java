/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import main.Order;

/**
 *
 * @author Faroos
 */
public class DBOrder {

    DBUtil util;
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    ArrayList <Order> order;
    
    public DBOrder() {
        
        util=DBUtil.getIntence();
        con=util.getConnection();
    }
    
    
    public List<Order> getNewOrders()
    {
        try{
        String sql="SELECT * FROM `orders` WHERE `status`=0";
        ps=con.prepareStatement(sql);
        rs=util.DBEData(ps);
        
        while(rs.next())
        {
            Order or=new Order(rs.getString("oid"), rs.getString("ptid"), 0);
            order.add(or);
            
        }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return order;
    }
    
     public List<Order> getPreparedOrders()
    {
        try{
        String sql="SELECT * FROM `orders` WHERE `status`=1";
        ps=con.prepareStatement(sql);
        rs=util.DBEData(ps);
        
        while(rs.next())
        {
            Order or=new Order(rs.getString("oid"), rs.getString("ptid"), 1);
            order.add(or);
            
        }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return order;
    }
    
    
}
