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
        jPanel2.setVisible(true);
        jLabellink.setVisible(false);
        jTextFieldlink.setVisible(false);
        jTextFieldnacionalidad.setVisible(false);
        jLabelnacionalidad.setVisible(false);
        jButtonEnviar.setVisible(false);
        
        jLabelDia.setVisible(false);
        jLabelMes.setVisible(false);
        jLabelAnio.setVisible(false);
        jTextFieldDia.setVisible(false);
        jTextFieldMes.setVisible(false);
        jTextFieldAnio.setVisible(false);
        
        
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArealDescripcionGeneral = new javax.swing.JTextArea();
        jLabelAltaUsuario = new javax.swing.JLabel();
        jLabelDia = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jLabelMes = new javax.swing.JLabel();
        jTextFieldMes = new javax.swing.JTextField();
        jLabelAnio = new javax.swing.JLabel();
        jTextFieldAnio = new javax.swing.JTextField();

        cmbTuristaProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Turista", "Proveedor" }));
        cmbTuristaProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTuristaProveedorActionPerformed(evt);
            }
        });

        jTextFieldnickname.setText(" ");
        jTextFieldnickname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnicknameActionPerformed(evt);
            }
        });

        jLabelnickname.setText("Nickname");

        jLabelNombre.setText("Nombre");

        jTextFieldnombre.setText(" ");

        jLabelApellido.setText("Apellido");

        jTextFieldapellido.setText(" ");

        jLabelCorreoElectronico.setText("Correo Electrónico");

        jTextFieldcorreoElectrónico.setText(" ");

        jLabelFechNac.setText("Fecha de Nacimiento");

        jLabelnacionalidad.setText("Nacionalidad");

        jTextFieldnacionalidad.setText(" ");

        jLabelDescripcionGeneral.setText("Descripción General");

        jLabellink.setText("Link a su sitio web");

        jTextFieldlink.setText(" ");

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        jTextArealDescripcionGeneral.setColumns(20);
        jTextArealDescripcionGeneral.setRows(5);
        jTextArealDescripcionGeneral.setBorder(null);
        jScrollPane1.setViewportView(jTextArealDescripcionGeneral);

        jLabelAltaUsuario.setText("Alta de Usuario");

        jLabelDia.setText("D");

        jTextFieldDia.setText(" ");

        jLabelMes.setText(" M");

        jTextFieldMes.setText(" ");

        jLabelAnio.setText("A");

        jTextFieldAnio.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAltaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelnickname, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jButtonEnviar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelFechNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelDescripcionGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabellink, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldcorreoElectrónico, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldnickname, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelApellido)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(cmbTuristaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldlink, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelMes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelAnio)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanelDescripcionGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAltaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTuristaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldnickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelnickname)
                            .addComponent(jLabelApellido)
                            .addComponent(jTextFieldapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldcorreoElectrónico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCorreoElectronico))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFechNac)
                            .addComponent(jLabelDia)
                            .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMes)
                            .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAnio)
                            .addComponent(jTextFieldAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelnacionalidad)
                            .addComponent(jTextFieldnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabelDescripcionGeneral))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanelDescripcionGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabellink))
                .addGap(42, 42, 42)
                .addComponent(jButtonEnviar)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldnicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnicknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnicknameActionPerformed

    private void cmbTuristaProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTuristaProveedorActionPerformed
        String opcion=(String)cmbTuristaProveedor.getSelectedItem();
        if(opcion.equals("Turista")){
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
            
            jLabelDia.setVisible(true);
            jLabelMes.setVisible(true);
            jLabelAnio.setVisible(true);
            jTextFieldDia.setVisible(true);
            jTextFieldMes.setVisible(true);
            jTextFieldAnio.setVisible(true);
        }
        if(opcion.equals("Proveedor")){
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
            
            jLabelDia.setVisible(true);
            jLabelMes.setVisible(true);
            jLabelAnio.setVisible(true);
            jTextFieldDia.setVisible(true);
            jTextFieldMes.setVisible(true);
            jTextFieldAnio.setVisible(true);
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
            
            jLabelDia.setVisible(false);
            jLabelMes.setVisible(false);
            jLabelAnio.setVisible(false);
            jTextFieldDia.setVisible(false);
            jTextFieldMes.setVisible(false);
            jTextFieldAnio.setVisible(false);
        } 
    }//GEN-LAST:event_cmbTuristaProveedorActionPerformed

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
        D = Integer.parseInt(jTextFieldDia.getText().trim());
        M = Integer.parseInt(jTextFieldMes.getText().trim());
        A = Integer.parseInt(jTextFieldAnio.getText().trim());
        fnac = new Date(A, M, D);    
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
            jTextFieldDia.setText(null);
            jTextFieldMes.setText(null);
            jTextFieldAnio.setText(null);
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
            jTextFieldDia.setText(null);
            jTextFieldMes.setText(null);
            jTextFieldAnio.setText(null);
            jTextArealDescripcionGeneral.setText(null);
            jTextFieldlink.setText(null);  
        }
        
    }//GEN-LAST:event_jButtonEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTuristaProveedor;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JLabel jLabelAltaUsuario;
    private javax.swing.JLabel jLabelAnio;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelCorreoElectronico;
    private javax.swing.JLabel jLabelDescripcionGeneral;
    private javax.swing.JLabel jLabelDia;
    private javax.swing.JLabel jLabelFechNac;
    private javax.swing.JLabel jLabelMes;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabellink;
    private javax.swing.JLabel jLabelnacionalidad;
    private javax.swing.JLabel jLabelnickname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDescripcionGeneral;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArealDescripcionGeneral;
    private javax.swing.JTextField jTextFieldAnio;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldapellido;
    private javax.swing.JTextField jTextFieldcorreoElectrónico;
    private javax.swing.JTextField jTextFieldlink;
    private javax.swing.JTextField jTextFieldnacionalidad;
    private javax.swing.JTextField jTextFieldnickname;
    private javax.swing.JTextField jTextFieldnombre;
    // End of variables declaration//GEN-END:variables
}
