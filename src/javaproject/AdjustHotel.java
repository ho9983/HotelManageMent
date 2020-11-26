/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.List;

/**
 *
 * @author Pray
 */
public class AdjustHotel {
    private SaveHotelManagement save;
    private LoadHotelManagement load;
    private SearchHotel search;
    private DataShapeHotel data;
    
    public AdjustHotel(){
        search = new SearchHotel();
    }
    public void adjustRoomList(List<DataShapeRoom> list){
        save = new SaveHotelManagement(list);
        save.save();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
