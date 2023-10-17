/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.mycompany.paplicaciones;

import javax.swing.JOptionPane;
import main.java.logica.Fabrica;
import main.java.logica.IController;

/**
 *
 * @author usuario
 */
public class AltaCategoria extends javax.swing.JPanel {

    /**
     * Creates new form AlataCategoria
     */
    public AltaCategoria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldCategoria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre de la Categoria");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jTextFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriaActionPerformed(evt);
            }
        });
        add(jTextFieldCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 212, -1));

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALTA CATEGORIA");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel2.setPreferredSize(new java.awt.Dimension(258, 28));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 95));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Fabrica f=Fabrica.getInstance();
        IController i=f.getIController();
        String categoria=jTextFieldCategoria.getText().trim();
        if(i.existeCategoria(categoria)){
          JOptionPane.showMessageDialog(null, "Este nombre de categoria ya existe");  
        }else{
            i.altaCategoria(categoria);
        }
        jTextFieldCategoria.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldCategoria;
    // End of variables declaration//GEN-END:variables
}
