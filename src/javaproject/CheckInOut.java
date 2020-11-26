/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.util.ArrayList;
import java.util.List;

/**
 * 자동 체크
 * @author Pray
 */
public class CheckInOut {
    private List<DataShapeCustom> deleteTable;
    private SearchCustomer search = new SearchCustomer();
    private DeleteCustomer deletedata = new DeleteCustomer();
    
    public CheckInOut(){
        deleteTable = search.SearchAutoCheck();
    }
    public void check(){
        for(DataShapeCustom data : deleteTable){
            deletedata.DeleteCustomNum(data.getCustomNum());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckInOut auto = new CheckInOut();
        auto.check();
    }
    
}
