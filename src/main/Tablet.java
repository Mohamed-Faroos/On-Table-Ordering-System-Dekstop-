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
public class Tablet {
    private String tid;
    private String password;
    private int status;
    private int customerUsage;

    public Tablet(String tid, String password, int status,int customerUsage) {
        this.tid = tid;
        this.password = password;
        this.status = status;
        this.customerUsage=customerUsage;
    }

    public Tablet() {
        this.tid = "";
        this.password = "";
        this.status = 0;
        this.customerUsage=0;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the customerUsage
     */
    public int getCustomerUsage() {
        return customerUsage;
    }

    /**
     * @param customerUsage the customerUsage to set
     */
    public void setCustomerUsage(int customerUsage) {
        this.customerUsage = customerUsage;
    }
    
    
    
    
}
