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
        modelPaquetes.addElement("Seleccione un Paquete");
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
        txtVal = new javax.swing.JFormattedTextField();
        txtDescu = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbAct = new javax.swing.JComboBox<>();
        cmbPaq = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, 30));

        jLabel2.setText("Descripcion");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 20));

        jLabel3.setText("Validez");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, 30));

        jLabel4.setText("Descuento");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 20));

        jLabel5.setText("Fecha de Alta");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 30));

        btnDAct.setText("Datos de la Actividad");
        btnDAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActActionPerformed(evt);
            }
        });
        add(btnDAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        txtVal.setEditable(false);
        txtVal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 30, -1));

        txtDescu.setEditable(false);
        txtDescu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescu.setText("0");
        add(txtDescu, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 30, -1));

        jLabel6.setText("Actividades Incluidas");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, 30));

        cmbAct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        add(cmbAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 300, -1));

        cmbPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaqActionPerformed(evt);
            }
        });
        add(cmbPaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 190, -1));

        jLabel7.setText("dias");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jLabel8.setText("%");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));
        add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 170, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CONSULTA PAQUETE");
        jLabel9.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel9.setPreferredSize(new java.awt.Dimension(258, 28));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 95));

        txtDesc.setColumns(20);
        txtDesc.setLineWrap(true);
        txtDesc.setRows(5);
        txtDesc.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDesc);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 430, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActActionPerformed
       
        String nom =(String)cmbAct.getSelectedItem();
        if(nom!="Seleccione una Actividad"){
            new DatosAct(nom).setVisible(true);
        }
    }//GEN-LAST:event_btnDActActionPerformed

    private void cmbPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaqActionPerformed
        if(cmbPaq.getSelectedItem()!="Seleccione un Paquete"){
            Fabrica fab = Fabrica.getInstance();
            IController I = fab.getIController();
            ArrayList<DTActividad> listaActs= I.listarActividadesPaquete((String)cmbPaq.getSelectedItem());
            DefaultComboBoxModel modelActs = new DefaultComboBoxModel();
            modelActs.addElement("Seleccione una Actividad");
            DTPaquete dtp = I.listarDatosPaquete((String)cmbPaq.getSelectedItem());
            for(int i=0;i<listaActs.size();i++){

                    modelActs.addElement(listaActs.get(i).getNombre());

            }
            cmbAct.setModel(modelActs);
            txtDesc.setText(dtp.getDesc());
            txtVal.setValue(dtp.getVal());
            txtDescu.setValue(dtp.getDescu());
            txtFecha.setDate(dtp.getFalta());
        }
    
        
    }//GEN-LAST:event_cmbPaqActionPerformed
                                    



    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JFormattedTextField txtDescu;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JFormattedTextField txtVal;
    // End of variables declaration//GEN-END:variables
}