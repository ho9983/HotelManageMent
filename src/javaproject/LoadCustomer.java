/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pray
 */
public class LoadCustomer implements Serializable{
    private List<DataShapeCustom> datas;
    
    public List<DataShapeCustom> load(){
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\Pray\\OneDrive\\JavaTeam\\JavaProject\\src\\javaproject\\custom.dat");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            
            datas = (List<DataShapeCustom>)ois.readObject();
            if(datas.isEmpty()){
                System.out.println("파일에 저장된 정보가 없습니다.");
            }
            ois.close();
        }catch(Exception e){
            System.out.println("파일을 로드하지 못했습니다.");
            e.printStackTrace();
        }
        return datas;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoadCustomer load = new LoadCustomer();
        List<DataShapeCustom> datas;
        datas = load.load();
        for(DataShapeCustom data:datas){
            System.out.println(data);
        }
    }
}
