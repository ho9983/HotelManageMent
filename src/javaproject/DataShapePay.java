/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.Serializable;

/**
 *
 * @author Pray
 */
public class DataShapePay implements Serializable {
    private boolean isPay;                  //결제유무
    private String payType;                 //결제종류
    private String paySum;                  //결제금액
    private String payReport;               //결제내역
    private static final long serialVersionUID = 1L;

    public DataShapePay(boolean isPay, String payType, String paySum, String payReport) {
        this.isPay = isPay;
        this.payType = payType;
        this.paySum = paySum;
        this.payReport = payReport;
    }

    public boolean isIsPay() {
        return isPay;
    }

    public String getPayType() {
        return payType;
    }

    public String getPaySum() {
        return paySum;
    }

    public String getPayReport() {
        return payReport;
    }

    public void setIsPay(boolean isPay) {
        this.isPay = isPay;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public void setPaySum(String paySum) {
        this.paySum = paySum;
    }

    public void setPayReport(String payReport) {
        this.payReport = payReport;
    }

    @Override
    public String toString() {
        return "DataShapePay{" + "isPay=" + isPay + ", payType=" + payType + ", paySum=" + paySum + ", payReport=" + payReport + '}';
    }
    
}
