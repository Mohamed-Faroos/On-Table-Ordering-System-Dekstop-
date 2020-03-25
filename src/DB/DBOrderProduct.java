/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import main.OrderProduct;
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
public class DBOrderProduct {

    DBUtil util;
    PreparedStatement ps;
    Connection con;
    ArrayList<OrderProduct> op;
    ResultSet rs;
    
    public DBOrderProduct() {
        util=DBUtil.getIntence();
        con=util.getConnection();
    }
    
    public List<OrderProduct> getOrderedItems(Order or)
    {
        op=new ArrayList<>();
        try {
            
            int id=Integer.parseInt(or.getOrderId());
            String sql="SELECT * FROM `OrderedProduct` WHERE `oid`=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,id);
            
            rs=util.DBEData(ps);
            
            while(rs.next())
            {
                OrderProduct orp=new OrderProduct();
                orp.setPid(rs.getString("pid"));
                orp.setName(rs.getString("pname"));
                orp.setQuantity(rs.getInt("quantity"));
                orp.setType(rs.getInt("type"));
                orp.setPrice(rs.getInt("price"));

                op.add(orp);
                

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return op;
    }
    
    
    
    
    
}
