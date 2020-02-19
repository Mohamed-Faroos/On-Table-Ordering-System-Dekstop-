/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

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
    ArrayList<Tablet> tbl;
    ResultSet rs;
    Tablet tablet;
    
    public DBTablet() {
        util=DBUtil.getIntence();
    }
    
    public boolean addTablet(Tablet tb)
    {
        String sql="INSERT INTO `Tablet`(`tid`, `Password`, `status`) VALUES ('"+tb.getTid()+"','"+tb.getPassword()+"',"+tb.getStatus()+")";
        return util.DBUpdate(sql);
    }
    
    public List<Tablet> getAllCategory()
    {
        tbl= new ArrayList<>();
        try {
            
            String sql="Select * From Tablet";
            
            rs=util.DBData(sql);
            
            while(rs.next())
            {
                String ID=rs.getString("tid");
                String password=rs.getString("password");
                int status=rs.getInt("status");
                
                tablet = new Tablet(ID, password, status);
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
            
            String sql="Select * From tablet Where tid='"+id+"'";
            
            rs=util.DBData(sql);
            
            if(rs.next())
            {
                String ID=rs.getString("tid");
                String password=rs.getString("password");
                int status=rs.getInt("status");
                
                tablet = new Tablet(ID, password, status);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return tablet;
    }
     
     
     public boolean updateTablet(Tablet tb)
    {
        String sql="UPDATE `Tablet` SET `Password`='"+tb.getPassword()+"',`status`="+tb.getStatus()+" WHERE `tid`='"+tb.getTid()+"'";
        return util.DBUpdate(sql);
    }
     
     public String lastID()
    {
        String UID = null;
        String IDS=null ;

            try
        {
            String sql="Select * from tablet";
            rs = util.DBData(sql);
           
            
            
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
