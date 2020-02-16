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
public class User {
    private String uid;
    private String username;
    private String password;
    private int userType;
    private int status;

    public User() {
        this.uid = "";
        this.username = "";
        this.password = "";
        this.userType = 0;
        this.status=0;
    }

    public User(String uid, String username, String password, int userType,int status) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.status=status;
    }

    
    /**
     * @return the uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
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
     * @return the userType
     */
    public int getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(int userType) {
        this.userType = userType;
    }
    
    
    public int getStaus() {
        return status;
    }

    /**
     * @param userType the userType to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
