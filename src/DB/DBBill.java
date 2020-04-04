/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import main.Bill;

/**
 *
 * @author Faroos
 */
public class DBBill {
    DBUtil util;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public DBBill() {
        util=DBUtil.getIntence();
        con=util.getConnection();
    }
    
    
    public boolean addBill(Bill bil)
    {
        try {
            String sql="INSERT INTO `bill`(`bid`, `PaidAmount`, `netTotal`, `serviceCharge`, `oid`, `uid`) VALUES (?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, bil.getBid());
            ps.setDouble(2, bil.getPaidAmount());
            ps.setDouble(3, bil.getNetTotal());
            ps.setDouble(4, bil.getServiceCharge());
            ps.setInt(5,Integer.parseInt(bil.getOrderId()));
            ps.setString(6, bil.getUid());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return util.DBEUpdate(ps);
    }
    
    
    public String lastID()
    {
        String UID = null;
        String IDS=null ;

            try
        {
            String sql="Select * from bill";
            ps=con.prepareStatement(sql);
            rs = util.DBEData(ps);
           
            
            
            while(rs.next())
            {
                UID = rs.getString("bid");
            }
            UID = UID.trim();
            String x = UID.substring(2);
            int ID = Integer.parseInt(x);
            
            
            if(ID>0 && ID<9)
            {
                ID=ID+1;
                IDS="IN0000"+ID;
            }
            
            else if(ID>=9 && ID<99)
            {
                ID=ID+1;
                IDS="IN000"+ID;
                
            }else if(ID>=99 && ID<999)
            {
                ID=ID+1;
                IDS="IN00"+ID;
                
            }else if(ID>=999 && ID<9999)
            {
                ID=ID+1;
                IDS="IN0"+ID;
                
            }if(ID>=9999)
            {
                ID=ID+1;
                IDS="IN"+ID;
            }
            
            
            
     
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    return IDS;
    }
    
    
    public Bill getBill(String in)
    {
        Bill bil = null;
        try {
            String sql="SELECT * FROM bill "
                    + " Inner Join orders  on bill.oid=orders.oid "
                    + " Inner Join User  on bill.uid=User.uid "
                    + " WHERE bill.bid=? ";
            ps=con.prepareStatement(sql);
            ps.setString(1, in);
            
            rs=util.DBEData(ps);
            
            if(rs.next())
            {
                bil=new Bill();
                bil.setBid(in);
                bil.setPaidAmount(rs.getDouble("PaidAmount"));
                bil.setNetTotal(rs.getDouble("netTotal"));
                bil.setServiceCharge(rs.getDouble("serviceCharge"));
                bil.setOrderId(rs.getString("oid"));
                bil.setUid(rs.getString("uid"));
                bil.setBillDate(rs.getString("date"));
                bil.setUsername(rs.getString("username"));
                bil.setTid(rs.getString("tid"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return bil;
        
    }
    
}
