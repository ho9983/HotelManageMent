/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

public class TestUI {   
    
    public static void main(String[] args) {
        // 호텔 창 만 실행
        //hotelUI hu = new hotelUI();
        //hu.setVisible(true);
        //로그인 창 까지 UI 전체 실행
        hotelLogin login = new hotelLogin();
        login.setVisible(true);
    }    
}
