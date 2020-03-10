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
import main.Category;
import main.Tablet;

/**
 *
 * @author Faroos
 */
public class DBTablet {
    DBUtil util;
    PreparedStatement ps;
    Connection con;
    ArrayList<Tablet> tbl;
    ResultSet rs;
    Tablet tablet;
    
    public DBTablet() {
        util=DBUtil.getIntence();
        con=util.getConnection();
    }
    
    public boolean addTablet(Tablet tb)
    {
        try{
            
        String sql="INSERT INTO `Tablet`(`tid`, `Password`, `status`,`customerUsage`) VALUES (?,?,?,0)";
       
        ps=con.prepareStatement(sql);
        ps.setString(1, tb.getTid());
        ps.setString(2, tb.getPassword());
        ps.setInt(3, tb.getStatus());
        
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return util.DBEUpdate(ps);
    }
    
    public List<Tablet> getAllTablets()
    {
        tbl= new ArrayList<>();
        try {
            
            String sql="Select * From Tablet";
            ps=con.prepareStatement(sql);
            rs=util.DBEData(ps);
            
            while(rs.next())
            {
                String ID=rs.getString("tid");
                String password=rs.getString("password");
                int status=rs.getInt("status");
                
                tablet = new Tablet(ID, password, status,0);
                tbl.add(tablet);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return tbl;

    }
    
     public Tablet getTablet(String id)
    {
    
        try {
            
            String sql="Select * From tablet Where tid=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=util.DBEData(ps);
            
            if(rs.next())
            {
                String ID=rs.getString("tid");
                String password=rs.getString("password");
                int status=rs.getInt("status");
                
                tablet = new Tablet(ID, password, status,0);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return tablet;
    }
     
     
     public boolean updateTablet(Tablet tb)
    {
        try{
            
        String sql="UPDATE `Tablet` SET `Password`=?,`status`=? WHERE `tid`=?";
       
        ps=con.prepareStatement(sql);
        ps.setString(1, tb.getPassword());
        ps.setInt(2, tb.getStatus());
        ps.setString(3, tb.getTid());

        
        }catch(Exception e)
        {
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
            String sql="Select * from tablet";
            ps=con.prepareStatement(sql);
            rs = util.DBEData(ps);
           
            
            
            while(rs.next())
            {
                UID = rs.getString("tid");
            }
            UID = UID.trim();
            String x = UID.substring(1);
            int ID = Integer.parseInt(x);
            
            
            if(ID>0 && ID<9)
            {
                ID=ID+1;
                IDS="T00"+ID;
            }
            
            else if(ID>=9 && ID<99)
            {
                ID=ID+1;
                IDS="T0"+ID;
            }
            
            else if(ID >=99)
            {
                ID=ID+1;
                IDS="T"+ID;
            }
            
     
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    return IDS;
    }
    
}
