/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author kim sun hee
 */
public class startlogin {
    public String userid;
    public String userpassword;
    int SelectNumber;
    public String str = " ";
    
    public startlogin(String userid, String userpassword){
        this.userid=userid;
        this.userpassword=userpassword;
    }
    public boolean startlogin() throws IOException{
        BufferedReader check = new BufferedReader(new FileReader("C:\\Users\\Pray\\OneDrive\\JavaTeam\\JavaProject\\src\\javaproject\\login.txt"));
        String useridpassword = userid+"/"+userpassword;
        while((str=check.readLine())!= null){
            if(str.equals(useridpassword)){
                 System.out.println("로그인에 성공했습니다.");
                 return true;
             }
         }
        return false;
    }
    
}