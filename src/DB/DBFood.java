/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import main.Category;
import main.Food;
import main.PredictedList;
import main.Prediction;

/**
 *
 * @author Faroos
 */
public class DBFood {

    DBUtil util;
    PreparedStatement ps;
    Connection con;
    String sql;
    boolean rs;
    ArrayList<Category> cate;
    ArrayList<Food> foodl;
    ResultSet res;
    Food fd;
    
    public DBFood() {
        
        util=DBUtil.getIntence();
        con=util.getConnection();
    }
    
    public boolean addFood(Food fd)
    {
        
        try {

            File imgfile = new File(fd.getImage());
            FileInputStream fin = new FileInputStream(imgfile);
            
      
           sql="INSERT INTO `Product`(`pid`, `pname`, `cid`, `price`, `quantity`, `availability`, `image`) VALUES (?,?,?,?,?,?,?)"; 
            
           ps=con.prepareStatement(sql);
           ps.setString(1, fd.getPid());
           ps.setString(2, fd.getPname());
           ps.setString(3, fd.getCid());
           ps.setInt(4, fd.getPrice());
           ps.setInt(5, fd.getQuantity());
           ps.setInt(6, fd.getAvailability());
           ps.setBinaryStream(7, fin,imgfile.length());
           
           
         
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return util.DBEUpdate(ps);
    }
    
    //get Available Category
    Category ct;
    
    public List<Category> getCategory(){
        
        cate=new ArrayList<>();
        try {
            
         sql="Select * From Category Where status = 0";
         ps=con.prepareStatement(sql);
         res= util.DBEData(ps);
         
         while(res.next()){
            String ID=res.getString("cid");
            String category=res.getString("category");
            

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
            ps=con.prepareStatement(sql);
            res = util.DBEData(ps);
           
            
            
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
            ps=con.prepareStatement(sql);
            res = util.DBEData(ps);
            
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

                    String sql="SELECT * FROM product WHERE MATCH (pname) AGAINST (?)";
                    ps=con.prepareStatement(sql);
                    ps.setString(1, word);
                    res = util.DBEData(ps);

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
            
            String sql="Select * From product Where pid=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            res = util.DBEData(ps);
            
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
            
      
           sql="UPDATE `Product` SET `pname`=?,`cid`=?,`price`=?,`quantity`=?,`availability`=?,`image`=? WHERE `pid`=?"; 
            
           ps=con.prepareStatement(sql);
           ps.setString(1, fd.getPname());
           ps.setString(2, fd.getCid());
           ps.setInt(3, fd.getPrice());
           ps.setInt(4, fd.getQuantity());
           ps.setInt(5, fd.getAvailability());
           ps.setBinaryStream(6, fin,imgfile.length());
           ps.setString(7, fd.getPid());
           
           
         
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return util.DBEUpdate(ps);
    }
    
    public boolean updateFoodWithoutImage(Food fd)
    {
         try {

            

           sql="UPDATE `Product` SET `pname`=?,`cid`=?,`price`=?,`quantity`=?,`availability`=? WHERE `pid`=?"; 
            
           ps=con.prepareStatement(sql);
           ps.setString(1, fd.getPname());
           ps.setString(2, fd.getCid());
           ps.setInt(3, fd.getPrice());
           ps.setInt(4, fd.getQuantity());
           ps.setInt(5, fd.getAvailability());
           ps.setString(6, fd.getPid());

           
         
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return util.DBEUpdate(ps);
    }
    
    
    public boolean updateQuantity(Food fd)
    {
         try {

           sql="UPDATE `Product` SET `quantity`=? WHERE `pid`=?"; 
            
           ps=con.prepareStatement(sql);
           
           ps.setInt(1, fd.getQuantity());
           ps.setString(2, fd.getPid());


        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return util.DBEUpdate(ps);
    }
    
     public boolean updateAllQuantity()
    {
         try {

           sql="UPDATE `Product` SET `quantity`=20"; 
           ps=con.prepareStatement(sql);

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return util.DBEUpdate(ps);
    }
     
         public boolean updateQuantityByPrediction()
    {
        boolean res = false;
         try {
          
             ArrayList<Prediction> pred=(ArrayList<Prediction>) PredictedList.getData();
              
             for(int i=0;i<pred.size();i++)
             {
                    sql="UPDATE `Product` SET `quantity`=? WHERE `pid`=?"; 
            
                    ps=con.prepareStatement(sql);

                    ps.setInt(1, pred.get(i).getPrediction());
                    ps.setString(2, pred.get(i).getPid());
                    res=util.DBEUpdate(ps);
             }
           
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return res;
    }
    
}
