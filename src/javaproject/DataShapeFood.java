/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.Serializable;

/**
 *
 * @author chung
 */
public class DataShapeFood implements Serializable{
    private String type;
    private int num;
    private boolean isOrder;
    private static final long serialVersionUID = 1L;
    
    public DataShapeFood(String type, int num, boolean isOrder){
        this.type=type;
        this.num=num;
        this.isOrder=isOrder;
    }

    public String getType() {
        return type;
    }

    public int getNum() {
        return num;
    }

    public boolean isIsOrder() {
        return isOrder;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setIsOrder(boolean isOrder) {
        this.isOrder = isOrder;
    }

    @Override
    public String toString() {
        return "DataShapeFood{" + "type=" + type + ", num=" + num + ", isOrder=" + isOrder + '}';
    }
    
}
