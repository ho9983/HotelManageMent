/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Pray
 * DataShapeCustom이 저장된 리스트에서 특정 데이터를 찾는 클래스
 */

public class SearchCustomer {
    private LoadCustomer dataLoad;
    private List<DataShapeCustom> dataTable;
    private LocalDateTime now = LocalDateTime.now();
    
    public SearchCustomer(){
        dataLoad = new LoadCustomer();
        dataTable = (ArrayList<DataShapeCustom>)dataLoad.load();
    }
    
    public List<DataShapeCustom> SearchAutoCheck(){
        List<DataShapeCustom> temp = new ArrayList<>();
        for(DataShapeCustom data : dataTable){
            if(now.getYear()==data.getCheckInOut().getCheckInEx().getYear()
                    && now.getDayOfYear()>data.getCheckInOut().getCheckInEx().getDayOfYear()){
                temp.add(data);
            }
        }
        return temp;
    }
    public DataShapeCustom Search(int customNum){
        for(DataShapeCustom data : dataTable){
            if(data.getCustomNum()==customNum)  return data;
        }
        return null;
    }
    public List<DataShapeCustom> Search(String str){
        List<DataShapeCustom> temp = new ArrayList<>();
        for(DataShapeCustom data : dataTable){
            if(data.getName().equals(str)) temp.add(data);
            else if(data.getCallNum().equals(str)) temp.add(data);
        }
        return temp;
    }
    public List<DataShapeCustom> Search(int year, int month){
        List<DataShapeCustom> temp = new ArrayList<>();
        for(DataShapeCustom data : dataTable){
            if(data.getCheckInOut().getCheckInReal()!=null){
                if(data.getCheckInOut().getCheckInReal().getYear()==year && data.getCheckInOut().getCheckInReal().getMonthValue()==month){
                    temp.add(data);
                }
            }
            else if(data.getCheckInOut().getCheckInReal()==null){
                if(data.getCheckInOut().getCheckInEx().getYear()==year && data.getCheckInOut().getCheckInEx().getMonthValue()==month){
                    temp.add(data);
                }
            }
        }
        return temp;
    }
    public int SearchNgetIndex(int customNum){
        List<DataShapeCustom> temp = new ArrayList<>();
        for(DataShapeCustom data : dataTable){
            if(data.getCustomNum()==customNum)    return dataTable.indexOf(data);
        }
        return -1;
    }
    public int[] SearchWhoUsedRoom(int mode, int floor/*0이면 예약, 1이면 투숙*/){
        int[] roomNums = new int[20];
        int i=0;
        for(DataShapeCustom data : dataTable){
            if(floor*100<data.getRoomNum() && data.getRoomNum()<floor*100+21){
                if(mode==0 && data.getCheckInOut().getCheckInReal() == null){
                    roomNums[i++]=data.getRoomNum();
                }
                else if(mode==1 && data.getCheckInOut().getCheckInReal()!=null
                        && data.getCheckInOut().getCheckOutReal()==null){
                     roomNums[i++]=data.getRoomNum();
                }
            }
        }
        return roomNums;
    }
    public int SearchNowUsedNum(int year, int month, int day){
        int temp = 0;
        for(DataShapeCustom data : dataTable){
            if(data.getCheckInOut().getCheckInReal()!=null)
            if(data.getCheckInOut().getCheckInReal().isBefore(LocalDateTime.of(year, month, day, 0, 0))
                    && data.getCheckInOut().getCheckOutReal()==null
                    && data.getCheckInOut().getCheckOutEx().isAfter(LocalDateTime.of(year, month, day, 0, 0)))
                temp++;
        }
        return temp;
    }
    public int SearchNextCustomNum(){
        int num=0;
        for(DataShapeCustom temp : dataTable){
            if(temp.getCustomNum()>num)
                num=temp.getCustomNum();
        }
        return ++num;
    }
    public int RoomNumToCustomNum(int roomNum){
        for(DataShapeCustom temp : dataTable){
            if(temp.getRoomNum()==roomNum)  return temp.getCustomNum();
        }
        return -1;
    }
    public List<String> feedbackList(){
        List<String> temp = new ArrayList<>();
        for(DataShapeCustom data : dataTable){
            temp.add(data.getFeedBack());
        }
        return temp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SearchCustomer search = new SearchCustomer();
        //System.out.println(search.Search(100));
        //System.out.println(search.Search("010-1234-1234"));
        System.out.println(search.Search(2019, 11));
        //System.out.println(search.SearchNgetIndex(100));
        /*
        int[] temp=search.SearchWhoUsedRoom(1, 2);
        for(int i=0; i<temp.length; i++){
            System.out.println(temp[i]);
        }
        */
    }
}
