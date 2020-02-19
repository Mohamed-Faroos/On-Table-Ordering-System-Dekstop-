/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Blob;

/**
 *
 * @author Faroos
 */
public class Food 
{
    private String pid;
    private String pname;
    private String cid;
    private int price;
    private int quantity;
    private int availability;
    private String image;
    private Blob img;

    public Food(String pid, String pname, String cid, int price, int quantity, int availability, String image,Blob img) {
        this.pid = pid;
        this.pname = pname;
        this.cid = cid;
        this.price = price;
        this.quantity = quantity;
        this.availability = availability;
        this.image = image;
        this.img = img;

    }

    public Food() {
        this.pid = "";
        this.pname = "";
        this.cid = "";
        this.price = 0;
        this.quantity = 0;
        this.availability = 0;
        this.image = "";
        this.img = null;
    }

    

    /**
     * @return the pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid the pid to set
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return the pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * @param pname the pname to set
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the availability
     */
    public int getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the img
     */
    public Blob getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(Blob img) {
        this.img = img;
    }

    
    

    
    
    
}
