/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Pray
 */
public class DataShapeServe  implements Serializable {
    private boolean Eating;               //식사유무
    private ArrayList<String> servicePay;   //이용서비스가격
    private ArrayList<String> serviceType;  //이용서비스종류
    private ArrayList<String> serviceSeque; //이용서비스
    private static final long serialVersionUID = 1L;

    public DataShapeServe(ArrayList<String> serviceSeque) {
        this.serviceSeque = serviceSeque;
    }

    public DataShapeServe(boolean Eating, ArrayList<String> servicePay, ArrayList<String> serviceType, ArrayList<String> serviceSeque) {
        this.Eating = Eating;
        this.servicePay = servicePay;
        this.serviceType = serviceType;
        this.serviceSeque = serviceSeque;
    }

    public boolean isEating() {
        return Eating;
    }

    public ArrayList<String> getServicePay() {
        return servicePay;
    }

    public ArrayList<String> getServiceType() {
        return serviceType;
    }

    public ArrayList<String> getServiceSeque() {
        return serviceSeque;
    }

    @Override
    public String toString() {
        return "DataShapeServe{" + "isEating=" + Eating + ", servicePay=" + servicePay + ", serviceType=" + serviceType + ", serviceSeque=" + serviceSeque + '}';
    }
}
