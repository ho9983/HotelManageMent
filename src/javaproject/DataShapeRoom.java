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
public class DataShapeRoom implements Serializable{
    private String type;
    private int roomPrice;
    private int roomNum;
    private boolean isEmpty;
    private static final long serialVersionUID = 1L;

    public DataShapeRoom(String type, int roomPrice, int roomNum, boolean isEmpty) {
        this.type = type;
        this.roomPrice = roomPrice;
        this.roomNum = roomNum;
        this.isEmpty = isEmpty;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public boolean isIsEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        return "DataShapeRoom{" + "type=" + type + ", roomPrice=" + roomPrice + ", roomNum=" + roomNum + ", isEmpty=" + isEmpty + '}';
    }

    
}
