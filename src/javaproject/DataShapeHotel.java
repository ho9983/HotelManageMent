/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Pray
 */
public class DataShapeHotel implements Serializable{
    private long loopMoney;
    private List<String> feedbacks;
    private List<DataShapeRoom> rooms;
    private List<DataShapeFood> foods;
    private List<DataShapeSales> sales;
    private static final long serialVersionUID = 1L;

    public DataShapeHotel(List<String> feedbacks, List<DataShapeRoom> rooms, List<DataShapeFood> foods, List<DataShapeSales> sales) {
        this.feedbacks = feedbacks;
        this.rooms = rooms;
        this.foods = foods;
        this.sales = sales;
    }

    public void setLoopMoney(long loopMoney) {
        this.loopMoney = loopMoney;
    }

    public void setFeedbacks(List<String> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public long getLoopMoney() {
        return loopMoney;
    }

    public List<String> getFeedbacks() {
        return feedbacks;
    }

    public List<DataShapeRoom> getRooms() {
        return rooms;
    }

    public List<DataShapeFood> getFoods() {
        return foods;
    }

    public List<DataShapeSales> getSales() {
        return sales;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setFeedback(List<String> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public void setRooms(List<DataShapeRoom> rooms) {
        this.rooms = rooms;
    }

    public void setFoods(List<DataShapeFood> foods) {
        this.foods = foods;
    }

    public void setSales(List<DataShapeSales> sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "DataShapeHotel{" + "feedback=" + feedbacks + "\nrooms=" + rooms + "\nfoods=" + foods + "\nsales=" + sales + '}';
    }
    
}