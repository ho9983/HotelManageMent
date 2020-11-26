/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Pray
 */
public class AdjustCustomer {
    private SaveCustomer save;
    private SearchCustomer search;
    private DeleteCustomer delete;
    private DataShapeCustom data;
    
    public AdjustCustomer(){
        search = new SearchCustomer();
        delete = new DeleteCustomer();
    }
    public void adjust(int customNum, String name, String phoneNum, int room, int person){
        data = search.Search(customNum);
        data.setName(name);
        data.setCallNum(phoneNum);
        data.setRoomNum(room);
        data.setPersonNum(person);
        delete.DeleteCustomNum(customNum);
        save = new SaveCustomer(data);
        save.save();
    }
    public void checkInAdjust(int customNum, LocalDateTime now){
        data = search.Search(customNum);
        if(data!=null){
            data.getCheckInOut().setCheckInReal(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), now.getHour(), now.getMinute());
            delete.DeleteCustomNum(customNum);
            save = new SaveCustomer(data);
            save.save();
        }
        else    System.out.println("에러에러");
    }
    public void checkOutAdjust(int roomNum, String money, String type, String list, LocalDateTime checkOut){
        DataShapePay pay = new DataShapePay(true, type, money, list);
        int customNum = search.RoomNumToCustomNum(roomNum);
        data = search.Search(customNum);
        data.getCheckInOut().setCheckOutReal(checkOut.getYear(), checkOut.getMonthValue(), checkOut.getDayOfMonth(), checkOut.getHour(), checkOut.getMinute());
        data.setPay(pay);
        delete.DeleteCustomNum(customNum);
        save = new SaveCustomer(data);
        save.save();
    }
    public void serviceAdjust(int customNum, boolean eating, ArrayList<String> serviceType, ArrayList<String> serviceSeque){
        DataShapeServe serve = new DataShapeServe(eating, null, serviceType, serviceSeque);
        data = search.Search(customNum);
        if(data!=null){
            data.setService(serve);
            delete.DeleteCustomNum(customNum);
            save = new SaveCustomer(data);
            save.save();
        }
    }
    public void serviceAdjust(int customNum, ArrayList<String> serviceSeque){
        DataShapeServe serve = new DataShapeServe(serviceSeque);
        data = search.Search(customNum);
        data.setService(serve);
        delete.DeleteCustomNum(customNum);
        save = new SaveCustomer(data);
        save.save();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdjustCustomer adjust = new AdjustCustomer();
        adjust.adjust(17, "나이", "010-4215-6161", 501, 12);
    }

}
