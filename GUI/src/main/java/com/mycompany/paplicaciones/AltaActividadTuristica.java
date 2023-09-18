
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTUsuario;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import main.java.logica.Departamento;
import main.java.logica.Fabrica;
import main.java.logica.IController;
import main.java.logica.Usuario;

public class AltaActividadTuristica extends javax.swing.JPanel {

    public AltaActividadTuristica() {
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<Usuario> listaProveedores = I.getUsuarios();
        ArrayList<DTDepartamento> listaDepartamentos = I.getDepartamentos();
        initComponents();
        DefaultComboBoxModel modelProveedores = new DefaultComboBoxModel();
        DefaultComboBoxModel modelDepartamentos = new DefaultComboBoxModel();
        
        for(int i=0;i<listaProveedores.size();i++){
            
            if(listaProveedores.get(i).getEsTurista()== 0){
                
                modelProveedores.addElement(listaProveedores.get(i).getNick());
            }
        }
    jComboBoxProveedor.setModel(modelProveedores);
    for(int i=0;i<listaDepartamentos.size();i++){
        
            modelDepartamentos.addElement(listaDepartamentos.get(i).getNom());
        }
    jComboBoxDepartamento.setModel(modelDepartamentos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldNombreActividad = new javax.swing.JTextField();
        jTextFieldDescripcion = new javax.swing.JTextField();
        jTextFieldDuracion = new javax.swing.JTextField();
        jTextFieldCosto = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButtonRegistrarActividad = new javax.swing.JButton();
        jComboBoxProveedor = new javax.swing.JComboBox<>();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Proovedor");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 29, -1, -1));

        jLabel4.setText("Departamento");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 73, -1, -1));

        jLabel5.setText("Nombre Actividad");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 118, -1, -1));

        jLabel6.setText("Descripción");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 158, -1, -1));

        jLabel8.setText("Duración");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 285, -1, -1));

        jLabel9.setText("Costo");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 337, -1, -1));

        jLabel10.setText("Ciudad");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 383, -1, -1));

        jLabel11.setText("Fecha de Alta");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 429, -1, -1));
        add(jTextFieldNombreActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 112, 174, -1));
        add(jTextFieldDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 158, 174, 115));

        jTextFieldDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDuracionActionPerformed(evt);
            }
        });
        jTextFieldDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDuracionKeyPressed(evt);
            }
        });
        add(jTextFieldDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 285, 171, -1));

        jTextFieldCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCostoActionPerformed(evt);
            }
        });
        jTextFieldCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCostoKeyPressed(evt);
            }
        });
        add(jTextFieldCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 331, 171, -1));

        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });
        add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 170, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ALTA ACTIVIDAD TURÍSTICA");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 320, 95));

        jButtonRegistrarActividad.setText("Registrar Actividad");
        jButtonRegistrarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActividadActionPerformed(evt);
            }
        });
        add(jButtonRegistrarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 509, -1, -1));

        jComboBoxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProveedorActionPerformed(evt);
            }
        });
        add(jComboBoxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 24, 170, -1));

        jComboBoxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepartamentoActionPerformed(evt);
            }
        });
        add(jComboBoxDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 68, 170, -1));

        jLabel7.setText("$");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 337, -1, -1));

        jLabel13.setText("hrs");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 291, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActividadActionPerformed
        String nomProveedor,nomDepartamento,nomActividad,nomCiudad,descripcion;
        Date fAlta;
        Integer duracion,costo;
        nomProveedor=(String)jComboBoxProveedor.getSelectedItem();
        nomDepartamento=(String)jComboBoxDepartamento.getSelectedItem();
        nomActividad=jTextFieldNombreActividad.getText();
        nomCiudad=jTextFieldCiudad.getText();
        descripcion=jTextFieldDescripcion.getText();
        duracion=Integer.parseInt(jTextFieldDuracion.getText());
        costo=Integer.parseInt(jTextFieldCosto.getText());
        fAlta= jDateChooser1.getDate();
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        if(I.actividadExiste(nomActividad)==true){
            JOptionPane.showMessageDialog(null, "Existe una actividad con ese nombre, modifíquelo para poder finalizar su ingreso");
        }
        else{
            
            DTActividad dt = new DTActividad(nomActividad,descripcion,nomDepartamento,duracion,costo,nomCiudad,fAlta);
            
            I.altaActividadTuristica(dt,nomProveedor);
            jDateChooser1.setDate(null);
            jTextFieldNombreActividad.setText(null);
            jTextFieldCiudad.setText(null);
            jTextFieldDescripcion.setText(null);
            jTextFieldDuracion.setText(null);
            jTextFieldCosto.setText(null);
            
        }
        
        
        
    }//GEN-LAST:event_jButtonRegistrarActividadActionPerformed

    private void jComboBoxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProveedorActionPerformed
      
    }//GEN-LAST:event_jComboBoxProveedorActionPerformed

    private void jComboBoxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDepartamentoActionPerformed

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed

    private void jTextFieldDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDuracionActionPerformed

    private void jTextFieldCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCostoActionPerformed

    private void jTextFieldDuracionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDuracionKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jTextFieldDuracion.setEditable(false);
        }else{
            jTextFieldDuracion.setEditable(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDuracionKeyPressed

    private void jTextFieldCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCostoKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            jTextFieldCosto.setEditable(false);
        }else{
            jTextFieldCosto.setEditable(true);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCostoKeyPressed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarActividad;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JComboBox<String> jComboBoxProveedor;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldDuracion;
    private javax.swing.JTextField jTextFieldNombreActividad;
    // End of variables declaration//GEN-END:variables
}
