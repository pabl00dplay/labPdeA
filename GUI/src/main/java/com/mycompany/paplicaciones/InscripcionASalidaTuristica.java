
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTSalida;
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
        cantvar = new javax.swing.JTextField();
        costovar = new javax.swing.JTextField();
        aceptaboton = new javax.swing.JButton();
        deptosbox = new javax.swing.JComboBox<>();
        actbox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        salidasbox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        turisbox = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jLabel5.setText("jLabel5");

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSCRIPCIÓN A SALIDA TURÍSTICA");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setPreferredSize(new java.awt.Dimension(258, 28));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 320, 95));

        deptotexto.setText("Departamento");
        add(deptotexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 119, -1, -1));

        actividadtexto.setText("Actividad");
        add(actividadtexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 119, -1, -1));

        jLabel2.setText("Fecha");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 273, -1, -1));

        jLabel3.setText("Cant Tur");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 217, -1, -1));

        jLabel4.setText("Costo");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 217, -1, -1));

        cantvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantvarActionPerformed(evt);
            }
        });
        add(cantvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 211, 94, -1));

        costovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costovarActionPerformed(evt);
            }
        });
        add(costovar, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 211, 94, -1));

        aceptaboton.setText("Aceptar");
        aceptaboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptabotonActionPerformed(evt);
            }
        });
        add(aceptaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 416, -1, -1));

        deptosbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptosboxActionPerformed(evt);
            }
        });
        add(deptosbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 122, -1));

        actbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actboxActionPerformed(evt);
            }
        });
        add(actbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 155, 122, -1));

        jLabel9.setText("Salida");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 119, -1, -1));

        add(salidasbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 155, 122, -1));

        jLabel10.setText("Turista");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 119, -1, -1));

        add(turisbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 155, 122, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 210, -1));
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
        String sal=(String) salidasbox.getSelectedItem();
        cant = Integer.parseInt(cantvar.getText().trim());
        costo = Integer.parseInt(costovar.getText().trim());
        Date fecha = jDateChooser1.getDate();   
        Fabrica f=Fabrica.getInstance();
        IController cont=f.getIController();
        cont.altaInscripcion(sal,fecha, cant, costo, nick);
        
        cantvar.setText(null);
        costovar.setText(null);

        
    }//GEN-LAST:event_aceptabotonActionPerformed

    private void actboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actboxActionPerformed
        // TODO add your handling code here:
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTSalida> listaSalidas= I.getSalidasActividad((String) actbox.getSelectedItem());
        DefaultComboBoxModel modelSalidas = new DefaultComboBoxModel();
        for(int i=0;i<listaSalidas.size();i++){
            modelSalidas.addElement(listaSalidas.get(i).getNombre());
        }
        salidasbox.setModel(modelSalidas);
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
    private javax.swing.JTextField cantvar;
    private javax.swing.JTextField costovar;
    private javax.swing.JComboBox<String> deptosbox;
    private javax.swing.JLabel deptotexto;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> salidasbox;
    private javax.swing.JComboBox<String> turisbox;
    // End of variables declaration//GEN-END:variables
}
