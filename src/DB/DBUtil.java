/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Faroos
 */
public class DBUtil {
        private static DBUtil db=new DBUtil();
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/OTOS";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";

    
    Connection conn;
    Statement stmt;
    ResultSet rs;

    private DBUtil() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static DBUtil getIntence()
    {
        return db;
    }
    
    public Connection getConnection()
    {
        return conn;
    }
       
     public boolean DBUpdate(String query)
    {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(query);
            stmt.close();
            return true;
        } catch (SQLException se) {
            se.printStackTrace(); 
            return false;
        } 
        
    }
     
      public boolean DBEUpdate(PreparedStatement ps)
    {
        try {
            int res=ps.executeUpdate();
            ps.close();
            
            if(res>0){
                
                return true;
            }else{
                
                return true;
            }
        } catch (SQLException se) {
            se.printStackTrace(); 
            return false;
        } 
        
    }
     
    public ResultSet DBData(String query)
    {
        try {   
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
        return rs; 
    }
    
    public ResultSet DBEData(PreparedStatement ps)
    {
        try {   
            
            rs = ps.executeQuery();
            
        } catch (SQLException e) {
            
            e.printStackTrace(); 
        }
        return rs; 
    }

}
