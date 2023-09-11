
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
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
        initComponents();
        DefaultComboBoxModel modelProveedores = new DefaultComboBoxModel();
        DefaultComboBoxModel modelDepartamentos = new DefaultComboBoxModel();
        int x=0;
        for(int i=0;i<listaProveedores.size();i++){
            
            if(listaProveedores.get(i).getEsTurista()== 0){
                
                modelProveedores.addElement(listaProveedores.get(i).getNom());
            }
        }
    jComboBoxProveedor.setModel(modelProveedores);
    
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
        jButton2 = new javax.swing.JButton();
        jComboBoxProveedor = new javax.swing.JComboBox<>();
        jComboBoxDepartamento = new javax.swing.JComboBox<>();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldAño = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel3.setText("Proovedor");

        jLabel4.setText("Departamento");

        jLabel5.setText("Nombre Actividad");

        jLabel6.setText("Descripción");

        jLabel8.setText("Duración");

        jLabel9.setText("Costo");

        jLabel10.setText("Ciudad");

        jLabel11.setText("Fecha de Alta");

        jTextFieldNombreActividad.setText("jTextField3");

        jTextFieldDescripcion.setText("jTextField4");

        jTextFieldDuracion.setText("jTextField5");

        jTextFieldCosto.setText("jTextField6");

        jTextFieldCiudad.setText("jTextField7");
        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ALTA ACTIVIDAD TURÍSTICA");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));

        jButtonRegistrarActividad.setText("Registrar Actividad");
        jButtonRegistrarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActividadActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        jComboBoxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProveedorActionPerformed(evt);
            }
        });

        jComboBoxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDepartamentoActionPerformed(evt);
            }
        });

        jLabel1.setText("D");

        jLabel2.setText("M");

        jLabel21.setText("A");

        jLabel7.setText("$");

        jLabel13.setText("hrs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel11)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAño)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42)
                        .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel9)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(jLabel10)
                        .addGap(72, 72, 72)
                        .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jButtonRegistrarActividad)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5))
                    .addComponent(jTextFieldNombreActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10))
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegistrarActividad)
                    .addComponent(jButton2)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActividadActionPerformed
        String nomProveedor,nomDepartamento,nomActividad,nomCiudad,descripcion;
        Date fAlta;
        Integer duracion,costo;
        int D,M,A;
        nomProveedor=(String)jComboBoxProveedor.getSelectedItem();
        nomDepartamento="departamentoide";//(String)jComboBoxDepartamento.getSelectedItem();
        nomActividad=jTextFieldNombreActividad.getText();
        nomCiudad=jTextFieldCiudad.getText();
        descripcion=jTextFieldDescripcion.getText();
        duracion=Integer.parseInt(jTextFieldDuracion.getText());
        costo=Integer.parseInt(jTextFieldCosto.getText());
        D=Integer.parseInt(jTextFieldDia.getText());
        M=Integer.parseInt(jTextFieldMes.getText());
        A=Integer.parseInt(jTextFieldAño.getText());
        fAlta= new Date(A,M,D);
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        if(I.actividadExiste(nomActividad)==true){
            JOptionPane.showMessageDialog(null, "Existe una actividad con ese nombre, modifíquelo para poder finalizar su ingreso");
        }
        else{
            JOptionPane.showMessageDialog(null, "llegamos al ELSE");
            DTActividad dt = new DTActividad(nomActividad,descripcion,nomDepartamento,duracion,costo,nomCiudad,fAlta);
            I.altaActividadTuristica(dt);
            jTextFieldNombreActividad.setText(null);
            jTextFieldCiudad.setText(null);
            jTextFieldDescripcion.setText(null);
            jTextFieldDuracion.setText(null);
            jTextFieldCosto.setText(null);
            jTextFieldDia.setText(null);
            jTextFieldMes.setText(null);
            jTextFieldAño.setText(null);
            
        }
        JOptionPane.showMessageDialog(null, "nos fuimos");
        
        
        
    }//GEN-LAST:event_jButtonRegistrarActividadActionPerformed

    private void jComboBoxProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProveedorActionPerformed
      
    }//GEN-LAST:event_jComboBoxProveedorActionPerformed

    private void jComboBoxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDepartamentoActionPerformed

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonRegistrarActividad;
    private javax.swing.JComboBox<String> jComboBoxDepartamento;
    private javax.swing.JComboBox<String> jComboBoxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldAño;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldDescripcion;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldDuracion;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldNombreActividad;
    // End of variables declaration//GEN-END:variables
}
