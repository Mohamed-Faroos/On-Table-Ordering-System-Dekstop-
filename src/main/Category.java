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
public class Category {
    
    private String cId;
    private String cName;
    private String discription;
    private int Status;
    
    

    public Category(String cId, String cName, String discription, int Status) {
        this.cId = cId;
        this.cName = cName;
        this.discription = discription;
        this.Status = Status;
    }

    public Category() {
         this.cId = "";
        this.cName = "";
        this.discription = "";
        this.Status = 0;
    }

    
    /**
     * @return the cId
     */
    public String getcId() {
        return cId;
    }

    /**
     * @param cId the cId to set
     */
    public void setcId(String cId) {
        this.cId = cId;
    }

    /**
     * @return the cName
     */
    public String getcName() {
        return cName;
    }

    /**
     * @param cName the cName to set
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * @return the discription
     */
    public String getDiscription() {
        return discription;
    }

    /**
     * @param discription the discription to set
     */
    public void setDiscription(String discription) {
        this.discription = discription;
    }

    /**
     * @return the Status
     */
    public int getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(int Status) {
        this.Status = Status;
    }
    
    
}
