/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.ResultSet;
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
        String sql="Select * From User where uid='"+us.getUid()+"' and password='"+us.getPassword()+"' and status = 0";
        rs=util.DBData(sql);
            
            if(rs.next())
            {
                user=new User();
                user.setUid(rs.getString("uid"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setUserType(rs.getInt("usertype"));

                

            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
            
           return user;
    }
    
    
}
