/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author chung
 */
public class SaveCustomer implements Serializable {
    private List<DataShapeCustom> datas;
    private DataShapeCustom data;
    private LoadCustomer loadData = new LoadCustomer();
    
    public SaveCustomer(DataShapeCustom data){
        this.data = data;
        datas = (ArrayList<DataShapeCustom>)loadData.load();
        int num=0;
        for(DataShapeCustom temp : datas){
            if(temp.getCustomNum()>num)
                num=temp.getCustomNum();
        }
        this.data.setCustomNum(++num);
        datas.add(data);
    }
    public SaveCustomer(List<DataShapeCustom> datas){
        this.datas=datas;
    }
    public void save(){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Pray\\OneDrive\\JavaTeam\\JavaProject\\src\\javaproject\\custom.dat", false);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(datas);
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
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();
        arr.add("안녕");
        arr.add("하세요");
        arr2.add("자바");
        arr2.add("입니다");
        arr3.add("배열");
        arr3.add("테스트");
        arr3.add("중입니다.");
        DataShapePay pay = new DataShapePay(true, "credit card", "2,130,000", "객실,레스토랑");
        DataShapeCheck check = new DataShapeCheck(LocalDateTime.of(2019, 11, 15, 18, 0), LocalDateTime.of(2019, 11, 16, 15, 0),
                                                  LocalDateTime.of(2019, 11, 29, 11, 0), LocalDateTime.of(2019, 11, 30, 11, 0));
        DataShapeServe serve = new DataShapeServe(true, arr, arr2, arr3);
        DataShapeCustom data = new DataShapeCustom("이호근", "남", "010-5576-7202", 13, 204, "So Good", pay, check, serve);
        
        ArrayList<String> arr11 = new ArrayList<>();
        ArrayList<String> arr12 = new ArrayList<>();
        ArrayList<String> arr13 = new ArrayList<>();
        arr11.add("안녕");
        arr11.add("하세요");
        arr12.add("자바");
        arr12.add("입니다");
        arr13.add("배열");
        arr13.add("테스트");
        arr13.add("중입니다.");
        DataShapePay pay1 = new DataShapePay(false, "cash", "100,000,000", "객실");
        DataShapeCheck check1 = new DataShapeCheck(LocalDateTime.of(2019, 11, 15, 18, 0), LocalDateTime.of(2019, 11, 16, 15, 0),
                                                  LocalDateTime.of(2019, 11, 29, 11, 0), LocalDateTime.of(2019, 11, 30, 11, 0));
        DataShapeServe serve1 = new DataShapeServe(true, arr11, arr12, arr13);
        DataShapeCustom data1 = new DataShapeCustom("백다지", "여", "010-1234-1234", 2, 502, "so hot", pay1, check1, serve1);
        
        ArrayList<String> arr21 = new ArrayList<>();
        ArrayList<String> arr22 = new ArrayList<>();
        ArrayList<String> arr23 = new ArrayList<>();
        arr21.add("야호");
        arr21.add("이런");
        arr22.add("멋진");
        arr22.add("자바를");
        arr23.add("테스트");
        arr23.add("하고");
        arr23.add("있는 중입니다.");
        DataShapePay pay2 = new DataShapePay(false, "credit card", "100,000", "객실");
        DataShapeCheck check2 = new DataShapeCheck(LocalDateTime.of(2019, 12, 2, 11, 0), LocalDateTime.of(2019, 12, 2, 15, 0),
                                                  LocalDateTime.of(2019, 12, 10, 11, 0), null);
        DataShapeServe serve2 = new DataShapeServe(true, arr21, arr22, arr23);
        DataShapeCustom data2 = new DataShapeCustom("김창호", "남", "010-4321-5124", 2, 620, "추워요", pay2, check2, serve2);
        
        SaveCustomer save = new SaveCustomer(data2);
        save.save();
    }
    
}
