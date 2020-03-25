/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Faroos
 */
public class PredictedList extends Prediction{
    
     private static List<Prediction> data = new ArrayList<>();


    public static void addItem(Prediction item) {
        data.add(item);
    }

    public static List<Prediction> getData() {
        return data;
    }
    
    public static void clear()
    {
        data.clear();
    }

}
