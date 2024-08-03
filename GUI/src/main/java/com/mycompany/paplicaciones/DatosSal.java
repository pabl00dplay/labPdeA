/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTSalida;
import java.util.ArrayList;
import main.java.logica.*;

/**
 *
 * @author francisco
 */
public class DatosSal extends javax.swing.JFrame {

    /**
     * Creates new form DatosSal
     */
    public DatosSal(String nom) {
        initComponents();
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        DTSalida dts=new DTSalida();
        ArrayList<DTSalida> dtsl=I.getSalidas();
        for(DTSalida s:dtsl){
            if(s.getNombre()==nom){
                dts=s;
            }
        }
        txtNom.setText(nom);
        txtLugar.setText(dts.getLugar());
        jDateChooser1.setDate(dts.getFecha());
        txtHora.setValue(dts.getHora());
        txtCap.setValue(dts.getCapacidad());
        txtFAlta.setValue(dts.getfAlta());
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
        btnCerrar = new javax.swing.JButton();
        txtNom = new javax.swing.JTextField();
        txtLugar = new javax.swing.JTextField();
        txtHora = new javax.swing.JFormattedTextField();
        txtCap = new javax.swing.JFormattedTextField();
        txtFAlta = new javax.swing.JFormattedTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(620, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, -1, -1));

        jLabel4.setText("Fecha:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 72, -1, -1));

        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 106, -1, -1));

        jLabel8.setText("Lugar de Salida:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 152, -1, -1));

        jLabel9.setText("Capacidad:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 198, -1, -1));

        jLabel10.setText("Fecha de Alta:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 244, -1, -1));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        txtNom.setEditable(false);
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 15, 130, -1));

        txtLugar.setEditable(false);
        getContentPane().add(txtLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 146, 130, -1));

        txtHora.setEditable(false);
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 100, 130, -1));

        txtCap.setEditable(false);
        getContentPane().add(txtCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 192, 130, -1));

        txtFAlta.setEditable(false);
        getContentPane().add(txtFAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 238, 130, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new DatosSal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtCap;
    private javax.swing.JFormattedTextField txtFAlta;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtLugar;
    private javax.swing.JTextField txtNom;
    // End of variables declaration//GEN-END:variables
}
