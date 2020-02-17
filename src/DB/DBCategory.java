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
import main.User;

/**
 *
 * @author Faroos
 */
public class DBCategory {
    DBUtil util;
    ResultSet rs;
    Category cate;
    ArrayList<Category> cateL;

    public DBCategory()
    {
        util=DBUtil.getIntence();
    }
    
    public boolean addCategory(Category ct)
    {
        String sql="INSERT INTO `category`(`cid`, `category`, `description`, `status`) VALUES"
                + " ('"+ct.getcId()+"','"+ct.getcName()+"','"+ct.getDiscription()+"',"+ct.getStatus()+")";
        return util.DBUpdate(sql);
    }
    
     public Category getCategory(String id)
    {
    
        try {
            
            String sql="Select * From category Where cid='"+id+"'";
            
            rs=util.DBData(sql);
            
            if(rs.next())
            {
                String ID=rs.getString("cid");
                String category=rs.getString("category");
                String description=rs.getString("description");
                int status=rs.getInt("status");
                
                cate = new Category(ID, category, description, status);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return cate;
    }
    
    /**
     *
     * @return
     */
    public List<Category> getAllCategory()
    {
        cateL= new ArrayList<>();
        try {
            
            String sql="Select * From category";
            
            rs=util.DBData(sql);
            
            while(rs.next())
            {
                String ID=rs.getString("cid");
                String category=rs.getString("category");
                String description=rs.getString("description");
                int status=rs.getInt("status");
                
                cate = new Category(ID, category, description, status);
                cateL.add(cate);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return cateL;

    }
    
    public boolean updateCategory(Category ct)
    {
        String sql="UPDATE `category` SET `description`='"+ct.getDiscription()+"',`status`="+ct.getStatus()+" WHERE `cid`='"+ct.getcId()+"'";
        return util.DBUpdate(sql);
    }
    
    
       
            
    public String lastID()
    {
        String UID = null;
        String IDS=null ;

            try
        {
            String sql="Select * from Category";
            rs = util.DBData(sql);
           
            
            
            while(rs.next())
            {
                UID = rs.getString("cid");
            }
            UID = UID.trim();
            String x = UID.substring(1);
            int ID = Integer.parseInt(x);
            
            
            if(ID>0 && ID<9)
            {
                ID=ID+1;
                IDS="C00"+ID;
            }
            
            else if(ID>=9 && ID<99)
            {
                ID=ID+1;
                IDS="C0"+ID;
            }
            
            else if(ID >=99)
            {
                ID=ID+1;
                IDS="C"+ID;
            }
            
     
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    return IDS;
    }
}
