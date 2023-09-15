/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTPaquete;
import java.util.*;
import javax.swing.*;
import main.java.logica.*;

public class CrearPaquete extends javax.swing.JPanel {

    public CrearPaquete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDescu = new javax.swing.JFormattedTextField();
        txtVali = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldAño = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButtonCrear = new javax.swing.JToggleButton();

        setPreferredSize(new java.awt.Dimension(620, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 220, -1));

        jLabel2.setText("Descripcion");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        add(txtDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 220, 60));

        jLabel3.setText("Descuento");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel4.setText("%");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel5.setText("Validez");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel6.setText("dias");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        txtDescu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuActionPerformed(evt);
            }
        });
        add(txtDescu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 30, -1));
        add(txtVali, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 30, -1));

        jLabel11.setText("Fecha de Alta");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        add(jTextFieldDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 30, -1));
        add(jTextFieldAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 48, -1));
        add(jTextFieldMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 30, -1));

        jLabel8.setText("D");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel9.setText("M");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel21.setText("A");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CREAR PAQUETE");
        jLabel13.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 95));

        jButtonCrear.setText("Crear");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        String nom = txtNom.getText();
        
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        if (!I.existePaq(nom)) {
            String desc = txtDesc.getText();
            Integer descu = Integer.parseInt(txtDescu.getText());
            Integer val = Integer.parseInt(txtVali.getText());
            int D=Integer.parseInt(jTextFieldDia.getText());
            int M=Integer.parseInt(jTextFieldMes.getText());
            int A=Integer.parseInt(jTextFieldAño.getText());
            Date fAlta= new Date(A,M,D);
            DTPaquete dt = new DTPaquete(nom, desc, descu, val, fAlta);
            I.AltaPaquete(dt);
            
            txtDesc.setText(null);
            txtDescu.setText(null);
            txtVali.setText(null);
            jTextFieldDia.setText(null);
            jTextFieldMes.setText(null);
            jTextFieldAño.setText(null);
        } else {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Un paquete con ese Nombre ya existe, por favor ingrese otro.", "Error", JOptionPane.ERROR_MESSAGE);
            } 
    }//GEN-LAST:event_jButtonCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButtonCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldAño;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JFormattedTextField txtDescu;
    private javax.swing.JTextField txtNom;
    private javax.swing.JFormattedTextField txtVali;
    // End of variables declaration//GEN-END:variables
}
