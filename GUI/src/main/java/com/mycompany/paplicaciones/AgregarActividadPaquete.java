
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTPaquete;
import main.java.logica.*;
import java.util.*;
import javax.swing.*;


public class AgregarActividadPaquete extends javax.swing.JPanel {
     
    public AgregarActividadPaquete() {
        initComponents();
        
        String defaultPaqueteString="Seleccione un paquete";
        String defaultDepartamentoString="Seleccione un departamento";
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTDepartamento> listaDepartamentos = I.getDepartamentos();
        DefaultComboBoxModel modelDepartamentos = new DefaultComboBoxModel();
        modelDepartamentos.addElement(defaultDepartamentoString);
        for(int i=0;i<listaDepartamentos.size();i++){
        
            modelDepartamentos.addElement(listaDepartamentos.get(i).getNom());
        }
        cmbDepto.setModel(modelDepartamentos);
      
      
        ArrayList<DTPaquete> listaPaquetes = I.listarPaquetes();
        DefaultComboBoxModel modelPaquetes = new DefaultComboBoxModel();
        modelPaquetes.addElement(defaultPaqueteString);
        for(int i=0;i<listaPaquetes.size();i++){
            modelPaquetes.addElement(listaPaquetes.get(i).getNom());
        }
        cmbPaq.setModel(modelPaquetes);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbPaq = new javax.swing.JComboBox<>();
        cmbDepto = new javax.swing.JComboBox<>();
        cmbAct = new javax.swing.JComboBox<>();
        btnOk = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Paquete");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 156, -1, 30));

        jLabel2.setText("Departamento");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 206, -1, 30));

        jLabel3.setText("Actividad");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 266, -1, 30));

        cmbPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaqActionPerformed(evt);
            }
        });
        add(cmbPaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 370, -1));

        cmbDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDeptoActionPerformed(evt);
            }
        });
        add(cmbDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 370, -1));

        cmbAct.setEnabled(false);
        cmbAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActActionPerformed(evt);
            }
        });
        add(cmbAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 370, -1));

        btnOk.setText("Agregar");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("AGREGAR ACTIVIDAD A PAQUETE");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 95));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaqActionPerformed
        
        
    }//GEN-LAST:event_cmbPaqActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        
        String defaultPaqueteString="Seleccione un paquete";
        String defaultActividadString="Seleccione un actividad";
        if(cmbPaq.getSelectedItem().equals(defaultPaqueteString) ||cmbAct.getSelectedItem().equals(defaultActividadString)){
            
            JOptionPane.showMessageDialog(null, "Por favor, seleccione las opciones correctamente.");
        }
        else{
         I.agregarActPaq((String)cmbPaq.getSelectedItem(),(String)cmbAct.getSelectedItem());
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void cmbActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbActActionPerformed

    private void cmbDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeptoActionPerformed
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        
        String defaultActividadString="Seleccione un actividad";
        cmbAct.setEnabled(true);
        
        ArrayList<DTActividad> listaActividades = I.listarActividadesFueraPaq((String)cmbPaq.getSelectedItem(), (String)cmbDepto.getSelectedItem());
        DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
        
        modelActividades.addElement(defaultActividadString);
        
        for(int i=0;i<listaActividades.size();i++){
                modelActividades.addElement(listaActividades.get(i).getNombre());
        }
      cmbAct.setModel(modelActividades);
    }//GEN-LAST:event_cmbDeptoActionPerformed

    
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cmbAct;
    private javax.swing.JComboBox<String> cmbDepto;
    private javax.swing.JComboBox<String> cmbPaq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
