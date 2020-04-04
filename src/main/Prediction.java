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
public class Prediction {
    
    private String Pid;
    private String Pname;
    private int prediction;

    public Prediction() {
        this.Pid = "";
        this.Pname = "";
        this.prediction = 0;
    }

    public Prediction(String Pid, String Pname, int prediction) {
        this.Pid = Pid;
        this.Pname = Pname;
        this.prediction = prediction;
    }

    
    /**
     * @return the Pid
     */
    public String getPid() {
        return Pid;
    }

    /**
     * @param Pid the Pid to set
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * @return the Pname
     */
    public String getPname() {
        return Pname;
    }

    /**
     * @param Pname the Pname to set
     */
    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    /**
     * @return the prediction
     */
    public int getPrediction() {
        return prediction;
    }

    /**
     * @param prediction the prediction to set
     */
    public void setPrediction(int prediction) {
        this.prediction = prediction;
    }
    
    
}
