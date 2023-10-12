
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTPaquete;
import DataTypes.DTSalida;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import main.java.logica.Fabrica;
import main.java.logica.IController;

public class ConsultaActividadTuristica extends javax.swing.JPanel {

    public ConsultaActividadTuristica() {
        initComponents();
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTDepartamento> listaDepartamentos = I.getDepartamentos();
        String defaultDepartamentoString="Seleccione un departamento";
        DefaultComboBoxModel modelDepartamentos = new DefaultComboBoxModel();
        modelDepartamentos.addElement(defaultDepartamentoString);
        for(int i=0;i<listaDepartamentos.size();i++){
        
            modelDepartamentos.addElement(listaDepartamentos.get(i).getNom());
        }
        jComboBoxDepartamento.setModel(modelDepartamentos);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jComboBoxActividad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldDuracion = new javax.swing.JTextField();
        jTextFieldCosto = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxSalidas = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBoxPaquetes = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(620, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CONSULTA ACTIVIDAD TURISTICA");
        jLabel13.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 95));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Departamento");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 290, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Actividad");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 300, -1));

        jComboBoxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepartamentoActionPerformed(evt);
            }
        });
        add(jComboBoxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 300, -1));

        jComboBoxActividad.setEnabled(false);
        jComboBoxActividad.setRequestFocusEnabled(false);
        jComboBoxActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActividadActionPerformed(evt);
            }
        });
        add(jComboBoxActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, -1));

        jLabel5.setText("Nombre Actividad");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel6.setText("Descripción");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel8.setText("Duración");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        jLabel9.setText("Costo");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel10.setText("Ciudad");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        jLabel11.setText("Fecha de Alta");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, -1));

        jTextFieldNombre.setEnabled(false);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 174, -1));

        jTextFieldDescripcion.setEnabled(false);
        jTextFieldDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescripcionActionPerformed(evt);
            }
        });
        add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 174, 115));

        jTextFieldDuracion.setEnabled(false);
        add(jTextFieldDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 171, -1));

        jTextFieldCosto.setEnabled(false);
        add(jTextFieldCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 171, -1));

        jTextFieldCiudad.setEnabled(false);
        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });
        add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 170, -1));

        jLabel7.setText("$");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, -1, -1));

        jLabel16.setText("hrs");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jComboBoxSalidas.setEnabled(false);
        jComboBoxSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSalidasActionPerformed(evt);
            }
        });
        add(jComboBoxSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 270, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Salidas Asociadas");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 260, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Paquetes Asociados");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 260, -1));

        jComboBoxPaquetes.setEnabled(false);
        jComboBoxPaquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPaquetesActionPerformed(evt);
            }
        });
        add(jComboBoxPaquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 270, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 580, 170, -1));

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed

    private void jTextFieldDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescripcionActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jComboBoxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoActionPerformed
        jComboBoxActividad.setEnabled(true);
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTActividad> listaActividades = I.listarActividadesDepartamento((String) jComboBoxDepartamento.getSelectedItem());
        String defaultActividadString="Seleccione una actividad";
        DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
        modelActividades.addElement(defaultActividadString);
        for(int i=0;i<listaActividades.size();i++){
            
            JOptionPane.showMessageDialog(null, listaActividades.get(i).getNombre());
            
                modelActividades.addElement(listaActividades.get(i).getNombre());
            
        }
    jComboBoxActividad.setModel(modelActividades);
    
    }//GEN-LAST:event_jComboBoxDepartamentoActionPerformed

    private void jComboBoxActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActividadActionPerformed
        jTextFieldNombre        .setEnabled(true);
        jTextFieldDescripcion   .setEnabled(true);
        jTextFieldDuracion      .setEnabled(true);
        jTextFieldCosto         .setEnabled(true);
        jTextFieldCiudad        .setEnabled(true);
        jDateChooser1           .setEnabled(true);
        jComboBoxSalidas        .setEnabled(true);
        jComboBoxPaquetes       .setEnabled(true);
        
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        DTActividad actividad = I.getActividad((String) jComboBoxActividad.getSelectedItem());
        jTextFieldNombre.setText(actividad.getNombre());
        jTextFieldDescripcion.setText(actividad.getDescripcion());
        jTextFieldDuracion.setText(Integer.toString(actividad.getDuracion()));
        jTextFieldCosto.setText(Integer.toString(actividad.getCostoXturista()));
        jTextFieldCiudad.setText(actividad.getCiudad());
        jDateChooser1.setDate(actividad.getfAlta());
        
        
        
        ArrayList<DTSalida> listaSalidas = I.getSalidasActividad(actividad.getNombre());
        DefaultComboBoxModel modelSalidas = new DefaultComboBoxModel();
        for(DTSalida dt:listaSalidas){
            modelSalidas.addElement(dt.getNombre());
        }
    
        jComboBoxSalidas.setModel(modelSalidas);
        ArrayList<DTPaquete> listaPaquetes = I.listarPaquetesActividad(actividad.getNombre());
        DefaultComboBoxModel modelPaquetes = new DefaultComboBoxModel();
        for(DTPaquete dt:listaPaquetes){
            modelPaquetes.addElement(dt.getNom());
        }
    
        jComboBoxPaquetes.setModel(modelPaquetes);
        
    }//GEN-LAST:event_jComboBoxActividadActionPerformed

    private void jComboBoxSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSalidasActionPerformed
        // TODO add your handling code here:
        new DatosSal((String) jComboBoxSalidas.getSelectedItem()).setVisible(true);
    }//GEN-LAST:event_jComboBoxSalidasActionPerformed

    private void jComboBoxPaquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPaquetesActionPerformed
       new DatosPaq((String) jComboBoxPaquetes.getSelectedItem()).setVisible(true);
    }//GEN-LAST:event_jComboBoxPaquetesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxActividad;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JComboBox<String> jComboBoxPaquetes;
    private javax.swing.JComboBox<String> jComboBoxSalidas;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldDuracion;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
