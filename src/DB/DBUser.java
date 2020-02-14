/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

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
    ResultSet rs;
    User user;
    ArrayList<User> userl;
    
    public DBUser()
    {
        util=DBUtil.getIntence();
    }
    
    public boolean addUser(User ow)
    {
        String sql="INSERT INTO `User`(`uid`, `username`, `password`, `userType`,`status`) VALUES"
                + " ('"+ow.getUid()+"','"+ow.getUsername()+"','"+ow.getPassword()+"',"+ow.getUserType()+","+ow.getStaus()+")";
        
        return util.DBUpdate(sql);
    }
    
    public User getUser(String id)
    {
    
        try {
            
            String sql="Select * From User Where uid='"+id+"'";
            
            rs=util.DBData(sql);
            
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
            
            rs=util.DBData(sql);
            
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
    
    public boolean updateUser(User us)
    {
        String sql="UPDATE User set username='"+us.getUsername()+"',password='"+us.getPassword()+"',status="+us.getStaus()+" where uid='"+us.getUid()+"'";
        return util.DBUpdate(sql);
    }
    
    
       
            
    public String lastID()
    {
        String UID = null;
        String IDS=null ;

            try
        {
            String sql="Select * from User";
            rs = util.DBData(sql);
           
            
            
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
