/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pray
 */
public class SaveHotelManagement implements Serializable{
    private DataShapeHotel data;
    private LoadHotelManagement load = new LoadHotelManagement();

    public SaveHotelManagement(DataShapeHotel data) {
        this.data = data;
    }
    
    public SaveHotelManagement(List<DataShapeRoom> rooms){
        data=load.load();
        data.setRooms(rooms);
    }
    
    public void save(){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Pray\\OneDrive\\JavaTeam\\JavaProject\\src\\javaproject\\hotel.dat");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(data);
            oos.close();
        }catch(Exception efs){
            efs.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String feedback1 = "호텔이 너무 쓰레기 같아요";
        String feedback2 = "방이 너무 추워요.";
        
        List<DataShapeRoom> rooms = new ArrayList<>();
        for(int j=200; j<700; j+=100){
            String str;
            if(j<=300)  str="Nomal";
            else if(j<=500) str="Luxary";
            else    str="VIP";
            for(int i=1; i<21; i++){
                DataShapeRoom temp = new DataShapeRoom(str, j*1000, j+i, true);
                rooms.add(temp);
                temp=null;
            }
        }
        List<DataShapeFood> foods = new ArrayList<>();
        DataShapeFood food1 = new DataShapeFood("Steak", 10, true);
        DataShapeFood food2 = new DataShapeFood("Pasta", 20, true);
        DataShapeFood food3 = new DataShapeFood("Pizza", 2, false);
        DataShapeFood food4 = new DataShapeFood("Fish and Chips", 9, true);
        DataShapeFood food5 = new DataShapeFood("Black noodle", 18, true);
        DataShapeFood food6 = new DataShapeFood("Red noodle", 34, true);
        DataShapeFood food7 = new DataShapeFood("Fried pork", 7, true);
        DataShapeFood food8 = new DataShapeFood("Fried rice", 21, true);
        DataShapeFood food9 = new DataShapeFood("Bulgogi", 28, true);
        DataShapeFood food10 = new DataShapeFood("Korean bean soup", 5, false);
        DataShapeFood food11 = new DataShapeFood("Braised chicken", 44, true);
        DataShapeFood food12 = new DataShapeFood("Abalone soup", 3, false);
        foods.add(food1);
        foods.add(food2);
        foods.add(food3);
        foods.add(food4);
        foods.add(food5);
        foods.add(food6);
        foods.add(food7);
        foods.add(food8);
        foods.add(food9);
        foods.add(food10);
        foods.add(food11);
        foods.add(food12);
        List<DataShapeSales> sales = new ArrayList<>();
        for(int i=1; i<13; i++){
            DataShapeSales sale = new DataShapeSales(LocalDateTime.of(2019, 11, i, 0, 0), 10000*i, LocalDateTime.of(2019, 11, i, 0, 0), 34000*i);
            sales.add(sale);
            sale=null;
        }
        List<String> feedbacks = new ArrayList<>();
        feedbacks.add(feedback1);
        feedbacks.add(feedback2);
        DataShapeHotel hotel = new DataShapeHotel(feedbacks, rooms, foods, sales);
        System.out.println(hotel);
        SaveHotelManagement save = new SaveHotelManagement(hotel);
        save.save();
    }
    
}
