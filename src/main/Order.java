/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Faroos
 */
public class Order extends User{
    
    private String orderId;
    private String tid;
    private int ststus;

    public Order() {
        this.orderId = "";
        this.tid = "";
        this.ststus = 0;
    }

    public Order(String orderId, String tid, int ststus) {
        this.orderId = orderId;
        this.tid = tid;
        this.ststus = ststus;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the tid
     */
    public String getTid() {
        return tid;
    }

    /**
     * @param tid the tid to set
     */
    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * @return the ststus
     */
    public int getStstus() {
        return ststus;
    }

    /**
     * @param ststus the ststus to set
     */
    public void setStstus(int ststus) {
        this.ststus = ststus;
    }
    
    
    
    
}
