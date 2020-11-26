/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.List;

/**
 *
 * @author chung
 */
public class UpdateHotelManagement {
    private SearchCustomer searchCustomer;
    private SaveHotelManagement saveHotel;
    private DataShapeHotel updateData;
    private LoadHotelManagement load;
    private SearchHotel searchHotel;
    
    public UpdateHotelManagement(){
        searchCustomer = new SearchCustomer();
        searchHotel = new SearchHotel();
        load = new LoadHotelManagement();
    }
    public UpdateHotelManagement(DataShapeHotel data){
        updateData = data;
        searchCustomer = new SearchCustomer();
        searchHotel = new SearchHotel();
    }
    public void update(){   //고객정보의 방 사용유무를 검색해서 사용중인 방만 골라 호텔정보의 해당되는 방의 인덱스를 뽑고, 그 인덱스로 정보를 바꿈.
        load = new LoadHotelManagement();
        updateData = load.load();
        DataShapeRoom room;
        int index;
        int[] roomList;
        for(int mode=0; mode<2; mode++)
        for(int i=2; i<=6; i++){
            roomList = searchCustomer.SearchWhoUsedRoom(mode, i);
            for(int j=0; j<20; j++){
                if(roomList[j]!=0){
                    index=searchHotel.roomIndexSearch(roomList[j]);
                    room = searchHotel.roomNumSearch(roomList[j]);
                    room.setIsEmpty(false);
                    updateData.getRooms().add(index++, room);
                    updateData.getRooms().remove(index);
                }
            }
        }
        saveHotel = new SaveHotelManagement(updateData.getRooms());
        saveHotel.save();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UpdateHotelManagement update = new UpdateHotelManagement();
        update.update();
    }
    
}
