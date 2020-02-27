/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import main.User;

/**
 *
 * @author Faroos
 */
public class DBLogin {
    DBUtil util;
    User user;
    ResultSet rs;

    public DBLogin() {
        util=DBUtil.getIntence();
    }
    
    public User login(User us)
    {
        try{
        String sql="Select * From User where uid='"+us.getUid()+"' and password='"+us.getPassword()+"' and userType="+us.getUserType()+" and status = 0";
        rs=util.DBData(sql);
            
            if(rs.next())
            {
                
               String id=rs.getString("uid");  
               String username =rs.getString("username");
               String password=rs.getString("password");
               int userType=rs.getInt("usertype");
               
                user=new User();
                user.setUid(id);
                user.setUsername(username);
                user.setPassword(password);
                user.setUserType(userType);

                

            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
            
           return user;
    }
    
    
}
