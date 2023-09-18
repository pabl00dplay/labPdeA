/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import DataTypes.DTPaquete;
import java.util.*;
import javax.swing.*;
import main.java.logica.*;

/**
 *
 * @author francisco
 */
public class ConsultaPaquete extends javax.swing.JPanel {
    private static IController control;
    
    /**
     * Creates new form ConsultaPaquete
     */
    
    public ConsultaPaquete() {
        initComponents();
        
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTPaquete> listaPaquetes= I.listarPaquetes();
        DefaultComboBoxModel modelPaquetes = new DefaultComboBoxModel();
        
        for(int i=0;i<listaPaquetes.size();i++){
            
                modelPaquetes.addElement(listaPaquetes.get(i).getNom());
            
        }
        cmbPaq.setModel(modelPaquetes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDAct = new javax.swing.JButton();
        txtDesc = new javax.swing.JTextField();
        txtVal = new javax.swing.JFormattedTextField();
        txtDescu = new javax.swing.JFormattedTextField();
        txtFecha = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbAct = new javax.swing.JComboBox<>();
        cmbPaq = new javax.swing.JComboBox<String>();
        btnActu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("Nombre");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Validez");

        jLabel4.setText("Descuento");

        jLabel5.setText("Fecha de Alta");

        btnDAct.setText("Datos Actividad");
        btnDAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActActionPerformed(evt);
            }
        });

        txtDesc.setEditable(false);

        txtVal.setEditable(false);

        txtDescu.setEditable(false);
        txtDescu.setText("0");

        txtFecha.setEditable(false);

        jLabel6.setText("Actividades Incluidas");

        cmbAct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cmbPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaqActionPerformed(evt);
            }
        });

        btnActu.setText("Actualizar");
        btnActu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuActionPerformed(evt);
            }
        });

        jLabel7.setText("dias");

        jLabel8.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDescu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(btnDAct)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(cmbAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnDAct)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnActu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActActionPerformed
       
        String nom =(String)cmbAct.getSelectedItem();
        if(nom!=" "){
            new DatosAct(nom).setVisible(true);
        }
    }//GEN-LAST:event_btnDActActionPerformed

    private void cmbPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaqActionPerformed
        
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTActividad> listaActs= I.listarActividadesPaquete((String)cmbPaq.getSelectedItem());
        DefaultComboBoxModel modelActs = new DefaultComboBoxModel();
        DTPaquete dtp = I.listarDatosPaquete((String)cmbPaq.getSelectedItem());
        for(int i=0;i<listaActs.size();i++){
            
                modelActs.addElement(listaActs.get(i).getNombre());
            
        }
        cmbAct.setModel(modelActs);
        txtDesc.setText(dtp.getDesc());
        txtVal.setValue(dtp.getVal());
        txtDescu.setValue(dtp.getDescu());
        txtFecha.setValue(dtp.getFalta());
    
        
    }//GEN-LAST:event_cmbPaqActionPerformed

    private void btnActuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuActionPerformed
        
        
    }//GEN-LAST:event_btnActuActionPerformed
                                    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActu;
    private javax.swing.JButton btnDAct;
    private javax.swing.JComboBox<String> cmbAct;
    private javax.swing.JComboBox<String> cmbPaq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JFormattedTextField txtDescu;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JFormattedTextField txtVal;
    // End of variables declaration//GEN-END:variables
}
