/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import com.mysql.jdbc.Connection;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import main.Category;
import main.Food;

/**
 *
 * @author Faroos
 */
public class DBFood {

    DBUtil util;
    String sql;
    boolean rs;
    ArrayList<Category> cate;
    ArrayList<Food> foodl;
    ResultSet res;
    Food fd;
    public DBFood() {
        util=DBUtil.getIntence();
    }
    
    public boolean addFood(Food fd)
    {
        
        try {

            File imgfile = new File(fd.getImage());
            FileInputStream fin = new FileInputStream(imgfile);
            Connection con= (Connection) util.getConnection();
            
      
           sql="INSERT INTO `Product`(`pid`, `pname`, `cid`, `price`, `quantity`, `availability`, `image`) VALUES (?,?,?,?,?,?,?)"; 
            
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1, fd.getPid());
           ps.setString(2, fd.getPname());
           ps.setString(3, fd.getCid());
           ps.setInt(4, fd.getPrice());
           ps.setInt(5, fd.getQuantity());
           ps.setInt(6, fd.getAvailability());
           ps.setBinaryStream(7, fin,imgfile.length());
           int row=ps.executeUpdate();
           
           if(row>0)
           {
               rs=true;
           }else{
               rs=false;            
           }
           
         
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return rs;
    }
    
    //get Available Category
    Category ct;
    
    public List<Category> getCategory(){
        
        cate=new ArrayList<>();
        try {
            
         sql="Select * From Category Where status = 0";
         ResultSet rs= util.DBData(sql);
         
         while(rs.next()){
            String ID=rs.getString("cid");
            String category=rs.getString("category");
            

            ct=new Category();
            ct.setcId(ID);
            ct.setcName(category);
            
            cate.add(ct);
         }

         
         
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return cate;
    }
    
     public String lastID()
    {
        String UID = null;
        String IDS=null ;

            try
        {
            String sql="Select * from Product";
            res = util.DBData(sql);
           
            
            
            while(res.next())
            {
                UID = res.getString("pid");
            }
            UID = UID.trim();
            String x = UID.substring(1);
            int ID = Integer.parseInt(x);
            
            
            if(ID>0 && ID<9)
            {
                ID=ID+1;
                IDS="P00"+ID;
            }
            
            else if(ID>=9 && ID<99)
            {
                ID=ID+1;
                IDS="P0"+ID;
            }
            
            else if(ID >=99)
            {
                ID=ID+1;
                IDS="P"+ID;
            }
            
     
    }catch(Exception e)
    {
        e.printStackTrace();
    }
    return IDS;
    }
     
     
     public List<Food> getAllProducts()
    {
        foodl= new ArrayList<>();
        try {
            
            String sql="Select * From Product";
            
            res=util.DBData(sql);
            
            while(res.next())
            {
                String ID=res.getString("pid");
                String name=res.getString("pname");
                int price=res.getInt("price");
                int quantity=res.getInt("quantity");
                int avai=res.getInt("availability");
                String availability;
                if(avai==0)
                {
                    availability="Available";
                }else{
                    availability="Not-Available";
                }
               fd = new Food();
               fd.setPid(ID);
               fd.setPname(name);
               fd.setPrice(price);
               fd.setQuantity(quantity);
               fd.setAvailability(avai);
               
               foodl.add(fd);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return foodl;

    }
     
     
          public List<Food> getSearchedProducts(String word)
          {
              foodl= new ArrayList<>();
                try {

                    String sql="SELECT * FROM product WHERE MATCH (pname) AGAINST ('"+word+"')";

                    res=util.DBData(sql);

                    while(res.next())
                    {
                        String ID=res.getString("pid");
                        String name=res.getString("pname");
                        int price=res.getInt("price");
                        int quantity=res.getInt("quantity");
                        int avai=res.getInt("availability");
                        
                       fd = new Food();
                       fd.setPid(ID);
                       fd.setPname(name);
                       fd.setPrice(price);
                       fd.setQuantity(quantity);
                       fd.setAvailability(avai);

                       foodl.add(fd);
                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }

                return foodl;
          }
          
          
    public Food getFood(String id)
    {
    
        try {
            
            String sql="Select * From product Where pid='"+id+"'";
            
            res=util.DBData(sql);
            
            if(res.next())
            {
                        String ID=res.getString("pid");
                        String name=res.getString("pname");
                        int price=res.getInt("price");
                        int quantity=res.getInt("quantity");
                        int avai=res.getInt("availability");
                        
                       Blob image=res.getBlob("image");
                
                       fd = new Food();
                       fd.setPid(ID);
                       fd.setPname(name);
                       fd.setCid(res.getString("cid"));
                       fd.setPrice(price);
                       fd.setQuantity(quantity);
                       fd.setAvailability(avai);
                       fd.setImg(image);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return fd;
    }
    
    
    public boolean updateFoodWithImage(Food fd)
    {
         try {

            File imgfile = new File(fd.getImage());
            FileInputStream fin = new FileInputStream(imgfile);
            Connection con= (Connection) util.getConnection();
            
      
           sql="UPDATE `Product` SET `pname`=?,`cid`=?,`price`=?,`quantity`=?,`availability`=?,`image`=? WHERE `pid`=?"; 
            
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1, fd.getPname());
           ps.setString(2, fd.getCid());
           ps.setInt(3, fd.getPrice());
           ps.setInt(4, fd.getQuantity());
           ps.setInt(5, fd.getAvailability());
           ps.setBinaryStream(6, fin,imgfile.length());
           ps.setString(7, fd.getPid());
           int row=ps.executeUpdate();
           
           if(row>0)
           {
               rs=true;
           }else{
               rs=false;            
           }
           
         
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return rs;
    }
    
    public boolean updateFoodWithoutImage(Food fd)
    {
         try {

            
           Connection con= (Connection) util.getConnection();

           sql="UPDATE `Product` SET `pname`=?,`cid`=?,`price`=?,`quantity`=?,`availability`=? WHERE `pid`=?"; 
            
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setString(1, fd.getPname());
           ps.setString(2, fd.getCid());
           ps.setInt(3, fd.getPrice());
           ps.setInt(4, fd.getQuantity());
           ps.setInt(5, fd.getAvailability());
           ps.setString(6, fd.getPid());

           int row=ps.executeUpdate();
           
           if(row>0)
           {
               rs=true;
           }else{
               rs=false;            
           }
           
         
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return rs;
    }
    
}
