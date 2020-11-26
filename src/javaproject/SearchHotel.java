/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pray
 */
public class SearchHotel {
    private LoadHotelManagement load;
    private DataShapeHotel data;
    
    public SearchHotel(){
        load = new LoadHotelManagement();
        data = load.load();
    }
    public DataShapeRoom search(int roomNum){
        for(DataShapeRoom temp : data.getRooms()){
            if(temp.getRoomNum()==roomNum)  return temp;
        }
        return null;
    }
    public List<DataShapeRoom> getRoomList(){
        return data.getRooms();
    }
    public long cardSearch(int year, int month, int day){
        long sum=0;
        for(DataShapeSales data : this.data.getSales()){
            if(data.getCreditDate().getYear()==year
                    && data.getCreditDate().getMonthValue()==month
                    && data.getCreditDate().getDayOfMonth()==day){
                sum+=data.getCreditSales();
            }
        }
        return sum;
    }
     public long cashSearch(int year, int month, int day){
        long sum=0;
        for(DataShapeSales data : this.data.getSales()){
            if(data.getCashDate().getYear()==year
                    && data.getCashDate().getMonthValue()==month
                    && data.getCashDate().getDayOfMonth()==day){
                sum+=data.getCashSales();
            }
        }
        return sum;
    }
     public DataShapeRoom roomNumSearch(int roomNum){
         for(DataShapeRoom data : this.data.getRooms()){
             if(roomNum==data.getRoomNum()) return data;
         }
         return null;
     }
     public int roomIndexSearch(int roomNum){
         for(DataShapeRoom data : this.data.getRooms()){
             if(roomNum==data.getRoomNum()) return this.data.getRooms().indexOf(data);
         }
         return -1;
     }
     public double hotelRealShare(int year, int month, int day){
         SearchCustomer searchCustomer = new SearchCustomer();
         int num=0, Num=0;
         double sum=0;
         num=searchCustomer.SearchNowUsedNum(year, month, day);
         for(DataShapeRoom data : this.data.getRooms()){
             Num++;
         }
         sum = num/Num*100;
         return sum;
     }
     public double hotelExShare(int year, int month, int day){
         int num=0, Num=0;
         double sum=0;
         for(DataShapeRoom data : this.data.getRooms()){
             Num++;
             if(!data.isIsEmpty())  num++;
         }
         sum=num/Num*100;
         return sum;
     }
     public long getLoopMoney(){
         return data.getLoopMoney();
     }
     public List<String> HfeedbackList(){
         return data.getFeedbacks();
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SearchHotel search = new SearchHotel();
        System.out.println(search.search(318));
    }
    
}
