/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.Order;

/**
 *
 * @author Faroos
 */
public class OrderProduct extends Order{
 
    private String pid;
    private String name;
    private int quantity;
    private int price;
    private int type;

    public OrderProduct() {
        this.pid = "";
        this.name = "";
        this.quantity = 0;
        this.price = 0;
        this.type = 0;
    }

    public OrderProduct(String pid, String name, int quantity, int price, int type) {
        this.pid = pid;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    public OrderProduct(String pid, String name, int quantity, int price, int type, String orderId, String tid, int ststus) {
        super(orderId, tid, ststus);
        this.pid = pid;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }
    
    
    
    
}
