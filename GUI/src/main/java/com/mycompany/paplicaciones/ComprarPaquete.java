/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import main.java.logica.ACTAceptada;
import main.java.logica.Fabrica;
import main.java.logica.IController;

/**
 *
 * @author capo_
 */
public class ComprarPaquete extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public ComprarPaquete() {
        initComponents();
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonEnviar = new javax.swing.JButton();
        jComboBoxActividad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxPaquete = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEnviar.setText("Comprar ");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        jComboBoxActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActividadActionPerformed(evt);
            }
        });
        add(jComboBoxActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 410, -1));

        jLabel2.setText("Costo");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 110, 40));

        jComboBoxPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPaqueteActionPerformed(evt);
            }
        });
        add(jComboBoxPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 410, -1));

        jLabel3.setText("Cantidad de Turistas");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 140, 40));

        jLabel4.setText("Vencimiento");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 110, 40));

        jLabel5.setText("Fecha de Compra");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 110, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("COMPRAR PAQUETE");
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel6.setPreferredSize(new java.awt.Dimension(258, 28));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 95));

        jLabel1.setText("Paquete");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 40));

        jLabel7.setText("Actividad");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
       
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jComboBoxActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActividadActionPerformed
        
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTActividad> listaActividades = I.getActividades();
        
        String defaultActividadString="Seleccione una actividad";
        DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
        modelActividades.addElement(defaultActividadString);
        for(int i=0;i<listaActividades.size();i++){
           
            if(ACTAceptada.ACEPTADA.equals(listaActividades.get(i).getEstado())){
                modelActividades.addElement(listaActividades.get(i).getNombre());
            }
            
        }
    jComboBoxActividad.setModel(modelActividades);
    }//GEN-LAST:event_jComboBoxActividadActionPerformed

    private void jComboBoxPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPaqueteActionPerformed
        
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        
    }//GEN-LAST:event_jComboBoxPaqueteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JComboBox<String> jComboBoxActividad;
    private javax.swing.JComboBox<String> jComboBoxPaquete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
