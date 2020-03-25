/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    Connection con;
    ResultSet rs;

    public DBLogin() {
        util=DBUtil.getIntence();
        con=util.getConnection();
    }
    
    public User login(User us)
    {
        try{
        String sql="Select * From User where uid=? and password=? and userType=? and status = 0";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, us.getUid());
        ps.setString(2, us.getPassword());
        ps.setInt(3, us.getUserType());
        rs=util.DBEData(ps);
            
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

                

            }else{
                user=null;
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
            
           return user;
    }
    
    
}
