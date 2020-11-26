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
public class DeleteCustomer {
    private LoadCustomer load = new LoadCustomer();
    private SearchCustomer searchData = new SearchCustomer();
    private List<DataShapeCustom> dataTable;
    
    public DeleteCustomer(){
        dataTable = load.load();
    }
    public void DeleteCustomNum(int customNum){
        int index = searchData.SearchNgetIndex(customNum);
        dataTable.remove(index);
        SaveCustomer save = new SaveCustomer(dataTable);
        save.save();
    }
    public void DeleteIndex(int index){
        dataTable.remove(index);
        SaveCustomer save = new SaveCustomer(dataTable);
        save.save();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DeleteCustomer delete = new DeleteCustomer();
        delete.DeleteCustomNum(25);
    }
}
