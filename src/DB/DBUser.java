/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.User;

/**
 *
 * @author Faroos
 */
public class DBUser {
    
    DBUtil util;
    PreparedStatement ps;
    Connection con;
    ResultSet rs;
    User user;
    ArrayList<User> userl;
    
    public DBUser()
    {
        util=DBUtil.getIntence();
        con=util.getConnection();
    }
    //Add User
    public boolean addUser(User ow)
    {
        try{
            
        String sql="INSERT INTO `User`(`uid`, `username`, `password`, `userType`,`status`)"
                    + " VALUES (?,?,?,?,?)";
        
         ps=con.prepareStatement(sql);
         ps.setString(1, ow.getUid());
         ps.setString(2, ow.getUsername());
         ps.setString(3, ow.getPassword());
         ps.setInt(4, ow.getUserType());
         ps.setInt(5, ow.getStaus());
        
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return util.DBEUpdate(ps);
    }
    
    public User getUser(String id)
    {   
        try {
            
            String sql="Select * From User Where uid=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, id);           
            rs=util.DBEData(ps);       
            if(rs.next())
            {
                String ID=rs.getString("uid");
                String username=rs.getString("username");
                String password=rs.getString("password");
                int userType=rs.getInt("userType");
                int status=rs.getInt("status");
                
                user = new User(ID, username, password, userType, status);
            }           
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return user;
    }
    
    /**
     *
     * @return
     */
    public List<User> getAllUser()
    {
        userl= new ArrayList<>();
        try {
            
            String sql="Select * From User";
            ps=con.prepareStatement(sql);
            rs=util.DBEData(ps);
            
            while(rs.next())
            {
                String ID=rs.getString("uid");
                String username=rs.getString("username");
                String password=rs.getString("password");
                int userType=rs.getInt("userType");
                int status=rs.getInt("status");
                
                user = new User(ID, username, password, userType, status);
                userl.add(user);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return userl;

    }
    
    public boolean updateUser(User ow)
    {
        try{
            
        String sql="UPDATE User set username=?,password=?,status=? where uid=?";
         ps=con.prepareStatement(sql);
         
         ps.setString(1, ow.getUsername());
         ps.setString(2, ow.getPassword());
         ps.setInt(3, ow.getStaus());
         ps.setString(4, ow.getUid());
        
        }catch (Exception e){
            
        } 
        
        return util.DBEUpdate(ps);
        
    }
    
    
       
            
    public String lastID()
    {
        String UID = null;
        String IDS=null ;

            try
        {
            String sql="Select * from User";
            ps=con.prepareStatement(sql);
            rs = util.DBEData(ps);
           
            
            
            while(rs.next())
            {
                UID = rs.getString("uid");
            }
            UID = UID.trim();
            String x = UID.substring(1);
            int ID = Integer.parseInt(x);
            
            
            if(ID>0 && ID<9)
            {
                ID=ID+1;
                IDS="U00"+ID;
            }
            
            else if(ID>=9 && ID<99)
            {
                ID=ID+1;
                IDS="U0"+ID;
            }
            
            else if(ID >=99)
            {
                ID=ID+1;
                IDS="U"+ID;
            }
            
     
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    return IDS;
    }
}
