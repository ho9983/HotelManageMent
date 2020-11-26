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
 * @author chung
 */
public class DataShapeSales implements Serializable{
    private LocalDateTime creditDate;
    private long creditSales;
    private LocalDateTime cashDate;
    private long cashSales;
    private static final long serialVersionUID = 1L;

    public DataShapeSales(LocalDateTime creditDate, long creditSales, LocalDateTime cashDate, long cashSales) {
        this.creditDate = creditDate;
        this.creditSales = creditSales;
        this.cashDate = cashDate;
        this.cashSales = cashSales;
    }

    public LocalDateTime getCreditDate() {
        return creditDate;
    }

    public long getCreditSales() {
        return creditSales;
    }

    public LocalDateTime getCashDate() {
        return cashDate;
    }

    public long getCashSales() {
        return cashSales;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
}
