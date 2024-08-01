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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDescu = new javax.swing.JFormattedTextField();
        txtVali = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButtonCrear = new javax.swing.JToggleButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(620, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtNom.setText(" ");
        add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 220, -1));

        jLabel2.setText("Descripcion");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel3.setText("Descuento");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel4.setText("%");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jLabel5.setText("Validez");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel6.setText("dias");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        txtDescu.setText("0");
        txtDescu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescuActionPerformed(evt);
            }
        });
        txtDescu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescuKeyPressed(evt);
            }
        });
        add(txtDescu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 30, -1));

        txtVali.setText("0");
        txtVali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValiKeyPressed(evt);
            }
        });
        add(txtVali, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 30, -1));

        jLabel11.setText("Fecha de Alta");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

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
        add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        jDateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooser1MouseClicked(evt);
            }
        });
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 170, -1));

        txtDesc.setColumns(20);
        txtDesc.setLineWrap(true);
        txtDesc.setRows(5);
        txtDesc.setText(" ");
        txtDesc.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDesc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));
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
            Date fAlta = jDateChooser1.getDate();
            DTPaquete dt = new DTPaquete(nom, desc, descu, val, fAlta);
            I.AltaPaquete(dt);
            
            txtNom.setText(null);
            txtDesc.setText(null);
            txtDescu.setText(null);
            txtVali.setText(null);
            jDateChooser1.setDate(null);
            
            Laboratorio1 lab = Laboratorio1.getInstance();
            lab.actualizar();
        } else {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Un paquete con ese Nombre ya existe, por favor ingrese otro.", "Error", JOptionPane.ERROR_MESSAGE);
            } 
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jDateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooser1MouseClicked
        
    }//GEN-LAST:event_jDateChooser1MouseClicked

    private void txtDescuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuKeyPressed
    char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            txtDescu.setEditable(false);
        }else{
            txtDescu.setEditable(true);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_txtDescuKeyPressed

    private void txtValiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValiKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            txtVali.setEditable(false);
        }else{
            txtVali.setEditable(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtValiKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jButtonCrear;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JFormattedTextField txtDescu;
    private javax.swing.JTextField txtNom;
    private javax.swing.JFormattedTextField txtVali;
    // End of variables declaration//GEN-END:variables
}
