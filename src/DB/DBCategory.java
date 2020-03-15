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
    PreparedStatement ps;
    Connection con;

    public DBCategory()
    {
        util=DBUtil.getIntence();
        con=util.getConnection();
    }
    
    public boolean addCategory(Category ct)
    {
        try{
        String sql="INSERT INTO `category`(`cid`, `category`, `description`, `status`) VALUES (?,?,?,?)";
        
        ps=con.prepareStatement(sql);
        ps.setString(1, ct.getcId());
        ps.setString(2, ct.getcName());
        ps.setString(3, ct.getDiscription());
        ps.setInt(4, ct.getStatus());
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return util.DBEUpdate(ps);
    }
    
     public Category getCategory(String id)
    {
    
        try {
            
            String sql="Select * From category Where cid=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=util.DBEData(ps);
            
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
            ps=con.prepareStatement(sql);
            rs=util.DBEData(ps);
            
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
        try{
        String sql="UPDATE `category` SET `description`=?,`status`=? WHERE `cid`=?";
        
        ps=con.prepareStatement(sql);
        ps.setString(1, ct.getDiscription());
        ps.setInt(2, ct.getStatus());
        ps.setString(3, ct.getcId());

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
            String sql="Select * from Category";
            ps=con.prepareStatement(sql);
            rs = util.DBEData(ps);
           
            
            
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
