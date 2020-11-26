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
 * 고객데이터 틀
 */
public class DataShapeCustom implements Serializable {
    private int customNum;           //고객고유번호
    private String name;                    //고객이름
    private String sex;                     //고객성별
    private String callNum;                 //고객연락처
    private int personNum;                  //고객인원수
    private int roomNum;                    //객실번호
    private String feedBack;                //피드백
    private DataShapePay pay;
    private DataShapeCheck checkInOut;
    private DataShapeServe service;
    private static final long serialVersionUID = 1L;

    public DataShapeCustom(String name, String sex, String callNum, int personNum, int roomNum, String feedBack, DataShapePay pay, DataShapeCheck checkInOut, DataShapeServe service) {
        this.name = name;
        this.sex = sex;
        this.callNum = callNum;
        this.personNum = personNum;
        this.roomNum = roomNum;
        this.feedBack = feedBack;
        this.pay = pay;
        this.checkInOut = checkInOut;
        this.service = service;
        this.customNum++;
    }

    public DataShapeCustom(int customNum, String name, String sex, String callNum, int personNum, int roomNum, String feedBack, DataShapePay pay, DataShapeCheck checkInOut, DataShapeServe service) {
        this.customNum = customNum;
        this.name = name;
        this.sex = sex;
        this.callNum = callNum;
        this.personNum = personNum;
        this.roomNum = roomNum;
        this.feedBack = feedBack;
        this.pay = pay;
        this.checkInOut = checkInOut;
        this.service = service;
    }
    
    public void setCustomNum(int customNum){
        this.customNum = customNum;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCallNum(String callNum) {
        this.callNum = callNum;
    }

    public void setPersonNum(int personNum) {
        this.personNum = personNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public void setPay(DataShapePay pay) {
        this.pay = pay;
    }

    public void setCheckInOut(DataShapeCheck checkInOut) {
        this.checkInOut = checkInOut;
    }

    public void setService(DataShapeServe service) {
        this.service = service;
    }

    public int getCustomNum() {
        return customNum;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getCallNum() {
        return callNum;
    }

    public int getPersonNum() {
        return personNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public DataShapePay getPay() {
        return pay;
    }

    public DataShapeCheck getCheckInOut() {
        return checkInOut;
    }

    public DataShapeServe getService() {
        return service;
    }

    @Override
    public String toString() {
        return customNum + " " + name + " " + callNum + " " + roomNum + " " + personNum + " " + checkInOut;
    }
}