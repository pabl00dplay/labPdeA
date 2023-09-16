
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
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTDepartamento> listaDepartamentos = I.getDepartamentos();
        DefaultComboBoxModel modelDepartamentos = new DefaultComboBoxModel();
        for(int i=0;i<listaDepartamentos.size();i++){
        
            modelDepartamentos.addElement(listaDepartamentos.get(i).getNom());
        }
      cmbDepto.setModel(modelDepartamentos);
      
      
        ArrayList<DTActividad> listaActividades = I.getActividades();
        DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
        for(int i=0;i<listaActividades.size();i++){
            
                modelActividades.addElement(listaActividades.get(i).getNombre());
            
        }
      cmbAct.setModel(modelActividades);
      
      
        ArrayList<DTPaquete> listaPaquetes = I.listarPaquetes();
        DefaultComboBoxModel modelPaquetes = new DefaultComboBoxModel();
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Paquete");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 42, -1, -1));

        jLabel2.setText("Departamento");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 99, -1, -1));

        jLabel3.setText("Actividad");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 168, -1, -1));

        cmbPaq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaqActionPerformed(evt);
            }
        });
        add(cmbPaq, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 170, -1));

        cmbDepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 170, -1));

        cmbAct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 180, -1));

        btnOk.setText("jButton1");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaqActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        if((String)cmbPaq.getSelectedItem()==null ||(String)cmbAct.getSelectedItem()==null){
            
            JOptionPane.showMessageDialog(null, "ALGUNO ES NULL");
        }
        else{
            
        I.agregarActPaq((String)cmbPaq.getSelectedItem(),(String)cmbAct.getSelectedItem());
        
            JOptionPane.showMessageDialog(null, "LLEGA");
        }
    }//GEN-LAST:event_btnOkActionPerformed

    
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox<String> cmbAct;
    private javax.swing.JComboBox<String> cmbDepto;
    private javax.swing.JComboBox<String> cmbPaq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
