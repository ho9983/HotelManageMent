/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author Pray
 */
public class LoadHotelManagement implements Serializable{
    private DataShapeHotel data;
    
    public DataShapeHotel load(){
        DataShapeHotel temp = null;
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Pray\\OneDrive\\JavaTeam\\JavaProject\\src\\javaproject\\hotel.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            temp = (DataShapeHotel)ois.readObject();
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return temp;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoadHotelManagement load = new LoadHotelManagement();
        DataShapeHotel hotel = load.load();
        System.out.println(hotel);
    }
}
