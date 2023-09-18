package main.java.com.mycompany.paplicaciones;

import DataTypes.*;
import java.util.Date;
import javax.swing.JOptionPane;
import main.java.logica.Fabrica;
import main.java.logica.IController;


public class AltaUsuario extends javax.swing.JPanel {

    public AltaUsuario() {
        initComponents();
        jLabelnickname.setVisible(false);
        jLabelAltaUsuario.setVisible(true);
        jLabelApellido.setVisible(false);
        jLabelCorreoElectronico.setVisible(false);
        jLabelDescripcionGeneral.setVisible(false);
        jLabelFechNac.setVisible(false);
        jLabelNombre.setVisible(false);
        jLabellink.setVisible(false);
        jLabelnacionalidad.setVisible(false);
        jLabelnickname.setVisible(false);
        jTextFieldnickname.setVisible(false);
        jTextFieldnombre.setVisible(false);
        jTextFieldapellido.setVisible(false);
        jTextFieldcorreoElectrónico.setVisible(false);
        
        
        jLabelDescripcionGeneral.setVisible(false);
        jTextArealDescripcionGeneral.setVisible(false);
        jLabellink.setVisible(false);
        jTextFieldlink.setVisible(false);
        jTextFieldnacionalidad.setVisible(false);
        jLabelnacionalidad.setVisible(false);
        jButtonEnviar.setVisible(false);
        jDateChooser1.setVisible(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbTuristaProveedor = new javax.swing.JComboBox<>();
        jTextFieldnickname = new javax.swing.JTextField();
        jLabelnickname = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldnombre = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldapellido = new javax.swing.JTextField();
        jLabelCorreoElectronico = new javax.swing.JLabel();
        jTextFieldcorreoElectrónico = new javax.swing.JTextField();
        jLabelFechNac = new javax.swing.JLabel();
        jLabelnacionalidad = new javax.swing.JLabel();
        jTextFieldnacionalidad = new javax.swing.JTextField();
        jLabelDescripcionGeneral = new javax.swing.JLabel();
        jLabellink = new javax.swing.JLabel();
        jTextFieldlink = new javax.swing.JTextField();
        jButtonEnviar = new javax.swing.JButton();
        jPanelDescripcionGeneral = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArealDescripcionGeneral = new javax.swing.JTextArea();
        jLabelAltaUsuario = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbTuristaProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Turista", "Proveedor" }));
        cmbTuristaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTuristaProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTuristaProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 29, 121, -1));

        jTextFieldnickname.setText(" ");
        jTextFieldnickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnicknameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldnickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 132, -1));

        jLabelnickname.setText("Nickname");
        jPanel1.add(jLabelnickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 94, -1));

        jLabelNombre.setText("Nombre");
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 94, -1));

        jTextFieldnombre.setText(" ");
        jPanel1.add(jTextFieldnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 119, 132, -1));

        jLabelApellido.setText("Apellido");
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 91, -1, -1));

        jTextFieldapellido.setText(" ");
        jPanel1.add(jTextFieldapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 85, 132, -1));

        jLabelCorreoElectronico.setText("Correo Electrónico");
        jPanel1.add(jLabelCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 164, 117, -1));

        jTextFieldcorreoElectrónico.setText(" ");
        jPanel1.add(jTextFieldcorreoElectrónico, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 164, 193, -1));

        jLabelFechNac.setText("Fecha de Nacimiento");
        jPanel1.add(jLabelFechNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 215, -1, -1));

        jLabelnacionalidad.setText("Nacionalidad");
        jPanel1.add(jLabelnacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 255, 104, -1));

        jTextFieldnacionalidad.setText(" ");
        jPanel1.add(jTextFieldnacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 249, 165, -1));

        jLabelDescripcionGeneral.setText("Descripción General");
        jPanel1.add(jLabelDescripcionGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 304, 117, -1));

        jLabellink.setText("Link a su sitio web");
        jPanel1.add(jLabellink, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 110, -1));

        jTextFieldlink.setText(" ");
        jPanel1.add(jTextFieldlink, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 457, 332, -1));

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 527, -1, -1));

        javax.swing.GroupLayout jPanelDescripcionGeneralLayout = new javax.swing.GroupLayout(jPanelDescripcionGeneral);
        jPanelDescripcionGeneral.setLayout(jPanelDescripcionGeneralLayout);
        jPanelDescripcionGeneralLayout.setHorizontalGroup(
            jPanelDescripcionGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanelDescripcionGeneralLayout.setVerticalGroup(
            jPanelDescripcionGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelDescripcionGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 6, -1, -1));

        jTextArealDescripcionGeneral.setColumns(20);
        jTextArealDescripcionGeneral.setRows(5);
        jTextArealDescripcionGeneral.setBorder(null);
        jScrollPane1.setViewportView(jTextArealDescripcionGeneral);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 289, 332, 142));

        jLabelAltaUsuario.setText("Alta de Usuario");
        jPanel1.add(jLabelAltaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 6, 248, 73));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        String opcion=(String)cmbTuristaProveedor.getSelectedItem();
        String nic;
        String nom;
        String ape;
        String mail;
        Date fnac;
        int D,M,A;
        nic = jTextFieldnickname.getText();
        nom = jTextFieldnombre.getText();
        ape = jTextFieldapellido.getText();
        mail = jTextFieldcorreoElectrónico.getText();
        fnac = jDateChooser1.getDate();
        Fabrica f=Fabrica.getInstance();
        IController I=f.getIController();
        if (I.nickExiste(nic)){
            JOptionPane.showMessageDialog(null, "El nickname ya existe");
        }
        else if (I.mailExiste(mail)){
            JOptionPane.showMessageDialog(null, "El mail ya existe");
        }
        else if(opcion.equals("Turista")){
            String nacionalidad=jTextFieldnacionalidad.getText();
            DTUsuario dt=new DTUsuario(nic,nom,ape,mail,fnac,nacionalidad);
            I.altaTurista(dt);

            jTextFieldnickname.setText(null);
            jTextFieldapellido.setText(null);
            jTextFieldnombre.setText(null);
            jTextFieldcorreoElectrónico.setText(null);
            jTextFieldnacionalidad.setText(null);
        }
        else if(opcion.equals("Proveedor")){
            String texto=jTextArealDescripcionGeneral.getText();
            String link=jTextFieldlink.getText();
            DTUsuario dt = new DTUsuario(nic,nom,ape,mail,fnac,link,texto);
            I.altaProveedor(dt);

            jTextFieldnickname.setText(null);
            jTextFieldapellido.setText(null);
            jTextFieldnombre.setText(null);
            jTextFieldcorreoElectrónico.setText(null);
            jTextArealDescripcionGeneral.setText(null);
            jTextFieldlink.setText(null);
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jTextFieldnicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnicknameActionPerformed

    private void cmbTuristaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTuristaProveedorActionPerformed
        String opcion=(String)cmbTuristaProveedor.getSelectedItem();
        if(opcion.equals("Turista")){
            jDateChooser1.setVisible(true);
            jLabelnickname.setVisible(true);
            jLabelAltaUsuario.setVisible(true);
            jLabelApellido.setVisible(true);
            jLabelCorreoElectronico.setVisible(true);
            jLabelDescripcionGeneral.setVisible(false);
            jLabelFechNac.setVisible(true);
            jLabelNombre.setVisible(true);
            jLabellink.setVisible(false);
            jLabelnacionalidad.setVisible(true);
            jLabelnickname.setVisible(true);
            jTextFieldnickname.setVisible(true);
            jTextFieldnombre.setVisible(true);
            jTextFieldapellido.setVisible(true);
            jTextFieldcorreoElectrónico.setVisible(true);

            jLabelDescripcionGeneral.setVisible(false);
            jTextArealDescripcionGeneral.setVisible(false);
            jPanelDescripcionGeneral.setVisible(true);
            jLabellink.setVisible(false);
            jTextFieldlink.setVisible(false);
            jTextFieldnacionalidad.setVisible(true);
            jLabelnacionalidad.setVisible(true);
            jButtonEnviar.setVisible(true);
        }
        if(opcion.equals("Proveedor")){
            jDateChooser1.setVisible(true);
            jLabelnickname.setVisible(true);
            jLabelAltaUsuario.setVisible(true);
            jLabelApellido.setVisible(true);
            jLabelCorreoElectronico.setVisible(true);
            jLabelDescripcionGeneral.setVisible(true);
            jLabelFechNac.setVisible(true);
            jLabelNombre.setVisible(true);
            jLabellink.setVisible(true);
            jLabelnacionalidad.setVisible(false);
            jLabelnickname.setVisible(true);
            jTextFieldnickname.setVisible(true);
            jTextFieldnombre.setVisible(true);
            jTextFieldapellido.setVisible(true);
            jTextFieldcorreoElectrónico.setVisible(true);

            jLabelDescripcionGeneral.setVisible(true);
            jTextArealDescripcionGeneral.setVisible(true);
            jPanelDescripcionGeneral.setVisible(false);
            jTextArealDescripcionGeneral.setAutoscrolls(true);
            jLabellink.setVisible(true);
            jTextFieldlink.setVisible(true);
            jTextFieldnacionalidad.setVisible(false);
            jLabelnacionalidad.setVisible(false);
            jButtonEnviar.setVisible(true);
        }
        if(opcion.equals("Usuario")){
            jLabelnickname.setVisible(false);
            jLabelAltaUsuario.setVisible(true);
            jLabelApellido.setVisible(false);
            jLabelCorreoElectronico.setVisible(false);
            jLabelDescripcionGeneral.setVisible(false);
            jLabelFechNac.setVisible(false);
            jLabelNombre.setVisible(false);
            jLabellink.setVisible(false);
            jLabelnacionalidad.setVisible(false);
            jLabelnickname.setVisible(false);
            jTextFieldnickname.setVisible(false);
            jTextFieldnombre.setVisible(false);
            jTextFieldapellido.setVisible(false);
            jTextFieldcorreoElectrónico.setVisible(false);
            jLabelDescripcionGeneral.setVisible(false);
            jTextArealDescripcionGeneral.setVisible(false);
            jPanelDescripcionGeneral.setVisible(true);
            jLabellink.setVisible(false);
            jTextFieldlink.setVisible(false);
            jTextFieldnacionalidad.setVisible(false);
            jLabelnacionalidad.setVisible(false);
            jButtonEnviar.setVisible(false);
        }
    }//GEN-LAST:event_cmbTuristaProveedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTuristaProveedor;
    private javax.swing.JButton jButtonEnviar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabelAltaUsuario;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCorreoElectronico;
    private javax.swing.JLabel jLabelDescripcionGeneral;
    private javax.swing.JLabel jLabelFechNac;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabellink;
    private javax.swing.JLabel jLabelnacionalidad;
    private javax.swing.JLabel jLabelnickname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDescripcionGeneral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArealDescripcionGeneral;
    private javax.swing.JTextField jTextFieldapellido;
    private javax.swing.JTextField jTextFieldcorreoElectrónico;
    private javax.swing.JTextField jTextFieldlink;
    private javax.swing.JTextField jTextFieldnacionalidad;
    private javax.swing.JTextField jTextFieldnickname;
    private javax.swing.JTextField jTextFieldnombre;
    // End of variables declaration//GEN-END:variables
}
