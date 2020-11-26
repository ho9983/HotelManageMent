/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Pray
 */
public class DataShapeCheck implements Serializable {
    private LocalDateTime checkInEx;        //예상체크인시간
    private LocalDateTime checkInReal;      //실제체크인시간
    private LocalDateTime checkOutEx;       //예상체크아웃시간
    private LocalDateTime checkOutReal;     //실제체크아웃시간
    private static final long serialVersionUID = 1L;

    public DataShapeCheck(LocalDateTime checkInEx, LocalDateTime checkInReal, LocalDateTime checkOutEx, LocalDateTime checkOutReal) {
        this.checkInEx = checkInEx;
        this.checkInReal = checkInReal;
        this.checkOutEx = checkOutEx;
        this.checkOutReal = checkOutReal;
    }
    
    public void setCheckInEx(int year, int month, int day, int hour, int min){
        checkInEx = LocalDateTime.of(year, month, day, hour, min);
    }
    public void setCheckInReal(int year, int month, int day, int hour, int min){
        checkInReal = LocalDateTime.of(year, month, day, hour, min);
    }
    public void setCheckOutEx(int year, int month, int day, int hour, int min){
        checkOutEx = LocalDateTime.of(year, month, day, hour, min);
    }
    public void setCheckOutReal(int year, int month, int day, int hour, int min){
        checkOutReal = LocalDateTime.of(year, month, day, hour, min);
    }
    public LocalDateTime getCheckInEx(){
        return checkInEx;
    }
    public LocalDateTime getCheckInReal(){
        return checkInReal;
    }
    public LocalDateTime getCheckOutEx(){
        return checkOutEx;
    }
    public LocalDateTime getCheckOutReal(){
        return checkOutReal;
    }

    @Override
    public String toString() {
        return "DataShapeCheck{" + "checkInEx=" + checkInEx + ", checkInReal=" + checkInReal + ", checkOutEx=" + checkOutEx + ", checkOutReal=" + checkOutReal + '}';
    }
    
}
