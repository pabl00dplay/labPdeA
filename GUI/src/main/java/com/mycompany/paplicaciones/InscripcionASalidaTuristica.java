
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import main.java.logica.*;

public class InscripcionASalidaTuristica extends javax.swing.JPanel {

    public InscripcionASalidaTuristica() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        IController I=fabrica.getIController();
        
        ArrayList<DTDepartamento> listaDepartamentos = I.getDepartamentos();
        DefaultComboBoxModel modelDepartamentos = new DefaultComboBoxModel();
        for(int i=0;i<listaDepartamentos.size();i++){
            modelDepartamentos.addElement(listaDepartamentos.get(i).getNom());
        }
        deptosbox.setModel(modelDepartamentos);
        
        //box turista
        ArrayList<Usuario> usuarios = I.getTuristas();
        DefaultComboBoxModel modelUsuarios = new DefaultComboBoxModel();
        for(int i=0;i<usuarios.size();i++){
            modelUsuarios.addElement(usuarios.get(i).getNick());
        }
        turisbox.setModel(modelUsuarios);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deptotexto = new javax.swing.JLabel();
        actividadtexto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        diavar = new javax.swing.JTextField();
        cantvar = new javax.swing.JTextField();
        costovar = new javax.swing.JTextField();
        aceptaboton = new javax.swing.JButton();
        mesvar = new javax.swing.JTextField();
        aniovar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        deptosbox = new javax.swing.JComboBox<>();
        actbox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        salidasbox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        turisbox = new javax.swing.JComboBox<>();

        jLabel5.setText("jLabel5");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSCRIPCIÓN A SALIDA TURÍSTICA");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setPreferredSize(new java.awt.Dimension(258, 28));

        deptotexto.setText("Departamento");

        actividadtexto.setText("Actividad");

        jLabel2.setText("Fecha");

        jLabel3.setText("Cant Tur");

        jLabel4.setText("Costo");

        cantvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantvarActionPerformed(evt);
            }
        });

        costovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costovarActionPerformed(evt);
            }
        });

        aceptaboton.setText("Aceptar");
        aceptaboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptabotonActionPerformed(evt);
            }
        });

        aniovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniovarActionPerformed(evt);
            }
        });

        jLabel6.setText("Dia");

        jLabel7.setText("Mes");

        jLabel8.setText("Año");

        deptosbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptosboxActionPerformed(evt);
            }
        });

        actbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actboxActionPerformed(evt);
            }
        });

        jLabel9.setText("Salida");

        jLabel10.setText("Turista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(aceptaboton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cantvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(costovar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diavar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aniovar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptotexto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deptosbox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(actbox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(salidasbox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(actividadtexto)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel9)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(turisbox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deptotexto)
                            .addComponent(actividadtexto)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deptosbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salidasbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turisbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cantvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(costovar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(diavar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(mesvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(aniovar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(aceptaboton)
                .addGap(129, 129, 129))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cantvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantvarActionPerformed

    private void costovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costovarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costovarActionPerformed

    private void aceptabotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptabotonActionPerformed
        // TODO add your handling code here:
        int D,M,A,cant,costo;
        //String nombreSal = (String) salidasbox.getSelectedItem();
        String nick = (String) turisbox.getSelectedItem();
        D = Integer.parseInt(diavar.getText().trim());
        M = Integer.parseInt(mesvar.getText().trim());
        A = Integer.parseInt(aniovar.getText().trim());
        cant = Integer.parseInt(cantvar.getText().trim());
        costo = Integer.parseInt(costovar.getText().trim());
        Date fecha = new Date(A, M, D);    
        Fabrica f=Fabrica.getInstance();
        IController cont=f.getIController();
        cont.altaInscripcion(fecha, cant, costo, nick);//pasar nombre sal
        
        diavar.setText(null);
        mesvar.setText(null);
        aniovar.setText(null);
        cantvar.setText(null);
        costovar.setText(null);

        
    }//GEN-LAST:event_aceptabotonActionPerformed

    private void aniovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniovarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniovarActionPerformed

    private void actboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actboxActionPerformed

    private void deptosboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptosboxActionPerformed
        //actbox.setEnabled(true);
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTActividad> listaActividades = I.listarActividadesDepartamento((String)deptosbox.getSelectedItem());
        DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
        for(int i=0;i<listaActividades.size();i++){
                modelActividades.addElement(listaActividades.get(i).getNombre());
        }
        actbox.setModel(modelActividades);
    }//GEN-LAST:event_deptosboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptaboton;
    private javax.swing.JComboBox<String> actbox;
    private javax.swing.JLabel actividadtexto;
    private javax.swing.JTextField aniovar;
    private javax.swing.JTextField cantvar;
    private javax.swing.JTextField costovar;
    private javax.swing.JComboBox<String> deptosbox;
    private javax.swing.JLabel deptotexto;
    private javax.swing.JTextField diavar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mesvar;
    private javax.swing.JComboBox<String> salidasbox;
    private javax.swing.JComboBox<String> turisbox;
    // End of variables declaration//GEN-END:variables
}
