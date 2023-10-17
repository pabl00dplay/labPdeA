/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTSalida;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import main.java.logica.Fabrica;
import main.java.logica.IController;

/**
 *
 * @author capo_
 */
public class ConsultaSalidaTuristica extends javax.swing.JPanel {

    /**
     * Creates new form AltaActividadTuristica
     */
    public ConsultaSalidaTuristica() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jComboBoxActividad = new javax.swing.JComboBox<>();
        jLabelNombre = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelLugar = new javax.swing.JLabel();
        jLabelCapacidad = new javax.swing.JLabel();
        jLabelFAlta = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxSalida = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel4.setText("Fecha");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel5.setText("Hora");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel8.setText("Lugar de Salida");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel9.setText("Capacidad");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel10.setText("Fecha de Alta");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CONSULTA SALIDA TURÍSTICA");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 320, 95));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Departamento");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Actividad");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 30));

        jComboBoxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepartamentoActionPerformed(evt);
            }
        });
        add(jComboBoxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 198, -1));

        jComboBoxActividad.setRequestFocusEnabled(false);
        jComboBoxActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActividadActionPerformed(evt);
            }
        });
        add(jComboBoxActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 198, -1));

        jLabelNombre.setText(":");
        add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabelFecha.setText(":");
        add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabelHora.setText(":");
        add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabelLugar.setText(":");
        add(jLabelLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        jLabelCapacidad.setText(":");
        add(jLabelCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        jLabelFAlta.setText(":");
        add(jLabelFAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Salida");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jComboBoxSalida.setRequestFocusEnabled(false);
        jComboBoxSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSalidaActionPerformed(evt);
            }
        });
        add(jComboBoxSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 198, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoActionPerformed
        if(jComboBoxDepartamento.getSelectedItem()!="Seleccione un departamento"){
            jComboBoxActividad.setEnabled(true);
            Fabrica fab = Fabrica.getInstance();
            IController I = fab.getIController();
            ArrayList<DTActividad> listaActividades = I.listarActividadesDepartamento((String) jComboBoxDepartamento.getSelectedItem());
            String defaultActividadString="Seleccione una actividad";
            DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
            modelActividades.addElement(defaultActividadString);
            for(DTActividad dt: listaActividades){

                modelActividades.addElement(dt.getNombre());

            }
            jComboBoxActividad.setModel(modelActividades);
        }
    
    }//GEN-LAST:event_jComboBoxDepartamentoActionPerformed

    private void jComboBoxActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActividadActionPerformed
        if(jComboBoxActividad.getSelectedItem()!="Seleccione una actividad"){
            Fabrica fab = Fabrica.getInstance();
            IController I = fab.getIController();
            DTActividad actividad = I.getActividad((String) jComboBoxActividad.getSelectedItem());

            ArrayList<DTSalida> listaSalidas = I.getSalidasActividad(actividad.getNombre());
            String defaultSalidaString="Seleccione una salida";
            DefaultComboBoxModel modelSalidas = new DefaultComboBoxModel();
            modelSalidas.addElement(defaultSalidaString);
            for(DTSalida dt:listaSalidas){
                modelSalidas.addElement(dt.getNombre());
            }

            jComboBoxSalida.setModel(modelSalidas);
        }
        
    }//GEN-LAST:event_jComboBoxActividadActionPerformed

    private void jComboBoxSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSalidaActionPerformed
        if(jComboBoxSalida.getSelectedItem()!="Seleccione una salida"){
            Fabrica fab = Fabrica.getInstance();
            IController I = fab.getIController();
            DTActividad actividad = I.getActividad((String) jComboBoxActividad.getSelectedItem());

            ArrayList<DTSalida> listaSalidas = I.getSalidasActividad(actividad.getNombre());
            for (DTSalida dt: listaSalidas){
                if (dt.getNombre()==jComboBoxSalida.getSelectedItem()){
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

                    jLabelNombre.setText(dt.getNombre());
                    jLabelFecha.setText(dateFormat.format(dt.getFecha()));
                    jLabelHora.setText(dt.getHora());
                    jLabelLugar.setText(dt.getLugar());
                    jLabelCapacidad.setText(dt.getCapacidad() + "");
                    jLabelFAlta.setText(dateFormat.format(dt.getfAlta()));
                }
            }
        }
    }//GEN-LAST:event_jComboBoxSalidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxActividad;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JComboBox<String> jComboBoxSalida;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCapacidad;
    private javax.swing.JLabel jLabelFAlta;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLugar;
    private javax.swing.JLabel jLabelNombre;
    // End of variables declaration//GEN-END:variables
}