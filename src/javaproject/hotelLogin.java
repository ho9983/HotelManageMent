/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.io.IOException;
import static javax.swing.JOptionPane.showMessageDialog;

public class hotelLogin extends javax.swing.JFrame {
    private hotelUI hu = new hotelUI();
    private boolean loginOK;
    private String id;
    private String pw;
    private startlogin goLogin;
    
    public hotelLogin() {
        initComponents();
        setTitle("ManageMent Program Login");
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonOk = new javax.swing.JButton();
        ButtonExit = new javax.swing.JButton();
        inputID = new javax.swing.JTextField();
        inputPW = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonOk.setText("확인");
        ButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOkActionPerformed(evt);
            }
        });

        ButtonExit.setText("종료");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        inputID.setText("ID");
        inputID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputIDMouseClicked(evt);
            }
        });

        inputPW.setText("PassWord");
        inputPW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputPWMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputID)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonOk, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(ButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputPW))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(inputPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonOk)
                    .addComponent(ButtonExit))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputIDMouseClicked
        inputID.setText("");
    }//GEN-LAST:event_inputIDMouseClicked

    private void inputPWMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPWMouseClicked
        inputPW.setText("");
    }//GEN-LAST:event_inputPWMouseClicked

    private void ButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOkActionPerformed
        
        id = inputID.getText();
        pw = inputPW.getText();
        goLogin = new startlogin(id, pw);
        try{
            if(goLogin.startlogin()) { // 데이터에 대한 변수로 변경할 것.
                loginOK = true;
                hu.setVisible(loginOK);          
            }
            else {
                loginOK = false;
                showMessageDialog(null, "ID나 Password 가 잘못되었습니다.");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_ButtonOkActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        showMessageDialog(null, "프로그램이 종료됩니다.");
        dispose();
    }//GEN-LAST:event_ButtonExitActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonOk;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputPW;
    // End of variables declaration//GEN-END:variables
}
