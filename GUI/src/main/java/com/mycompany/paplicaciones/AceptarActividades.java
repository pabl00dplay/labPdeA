/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import main.java.logica.Fabrica;
import main.java.logica.IController;

/**
 *
 * @author francisco
 */
public class AceptarActividades extends javax.swing.JPanel {

    /**
     * Creates new form AceptarActividades
     */
    public AceptarActividades() {
        initComponents();
        String defaultActividadString="Seleccione un actividad";
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTActividad> listaActividades = I.listarActividadesSoloAgregadas();
        
        DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
        modelActividades.addElement(defaultActividadString);
        
        for(int i=0;i<listaActividades.size();i++){
                modelActividades.addElement(listaActividades.get(i).getNombre());
        }
        cmbAct.setModel(modelActividades);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbAct = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnRechazar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(611, 594));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ACEPTAR O RECHAZAR ACTIVIDADES");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("Actividad");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnRechazar.setText("Rechazar");
        btnRechazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(45, 45, 45)
                .addComponent(btnRechazar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbAct, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 288, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRechazar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        String defaultActividadString="Seleccione un actividad";
        
        if((String) cmbAct.getSelectedItem()!=defaultActividadString){
            I.aceptarAct((String) cmbAct.getSelectedItem());

            ArrayList<DTActividad> listaActividades = I.listarActividadesSoloAgregadas();

            DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
            modelActividades.addElement(defaultActividadString);

            for(int i=0;i<listaActividades.size();i++){
                    modelActividades.addElement(listaActividades.get(i).getNombre());
            }
            cmbAct.setModel(modelActividades);

            Laboratorio1 lab = Laboratorio1.getInstance();
            lab.actualizar();
        }
            
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarActionPerformed
                                          
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        String defaultActividadString="Seleccione un actividad";
        
        if((String) cmbAct.getSelectedItem()!=defaultActividadString){
            I.rechazarAct((String) cmbAct.getSelectedItem());

            ArrayList<DTActividad> listaActividades = I.listarActividadesSoloAgregadas();

            DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
            modelActividades.addElement(defaultActividadString);

            for(int i=0;i<listaActividades.size();i++){
                    modelActividades.addElement(listaActividades.get(i).getNombre());
            }
            cmbAct.setModel(modelActividades);

            Laboratorio1 lab = Laboratorio1.getInstance();
            lab.actualizar();
        }
            
    }//GEN-LAST:event_btnRechazarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRechazar;
    private javax.swing.JComboBox<String> cmbAct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables
}
