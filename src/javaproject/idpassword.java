/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kim sun hee
 */
public class idpassword {
    private String newid;// 새로운 아이디 입력 받는 변수.
    private String newpassword;//새로운 비밀번호 입력 받는 변수.

    public idpassword(String newid, String newpassword) {
        this.newid = newid;
        this.newpassword = newpassword;
    }
    public void setNewid(String newid) {
        this.newid = newid;
    }
    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }
    public String getNewid() {
        return newid;
    }
    public String getNewpassword() {
        return newpassword;
    }
    public void newLogin()throws IOException{//입력받은 아이디와 비밀번호를 이어주는 메서드.
        String fileName="C:\\Users\\Pray\\OneDrive\\JavaTeam\\JavaProject\\src\\javaproject\\login.txt";//아이디와 비밀번호를 저장하는 txt 경로.
        File file = new File("fileName");//file을 생성한다.
        /*System.out.println("아이디를 입력하세요.: ");//커맨드 창에서 실행하기 위해 추가하였으나, gui에서 대신함.
        Scanner sc = new Scanner(System.in);
        newid = sc.nextLine();
        System.out.println("비밀번호를 입력하세요.: ");
        newpassword = sc.nextLine();*/
        BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, true));//txt 파일에 새로운 아이디와 비밀번호를 저장한다.
        fw.write(newid+"/"+newpassword+"\n");
        fw.flush();
        fw.close();//파일을 닫아준다.
    }
    public static void main(String[] args){
        idpassword id = new idpassword("ch", "123");
        
    }
}