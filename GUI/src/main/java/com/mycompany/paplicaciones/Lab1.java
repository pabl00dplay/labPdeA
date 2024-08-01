/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.com.mycompany.paplicaciones;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import main.java.com.mycompany.paplicaciones.persistencia.ControladoraPersistencia;
import main.java.logica.Fabrica;
import main.java.logica.IController;

/**
 *
 * @author usuario
 */
public class Lab1 extends javax.swing.JFrame {

    public static Lab1 getInstance() {
        if (instance == null) {
            instance = new Lab1();
        }
        return instance;
    }
    public Lab1() {
        Fabrica fabrica = Fabrica.getInstance();
        IController cont=fabrica.getIController();
        initComponents();
        AltaUsuario au=new AltaUsuario(); 
        PonerContenedorDentroContenedor(au,jPanelAltaUsuario);
        ConsultaUsuario cu=new ConsultaUsuario(); 
        PonerContenedorDentroContenedor(cu,jPanelConsultaUsuario);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelAltaUsuario = new javax.swing.JPanel();
        jPanelConsultaUsuario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1059, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(620, 600));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAltaUsuarioLayout = new javax.swing.GroupLayout(jPanelAltaUsuario);
        jPanelAltaUsuario.setLayout(jPanelAltaUsuarioLayout);
        jPanelAltaUsuarioLayout.setHorizontalGroup(
            jPanelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        jPanelAltaUsuarioLayout.setVerticalGroup(
            jPanelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanelAltaUsuario);

        javax.swing.GroupLayout jPanelConsultaUsuarioLayout = new javax.swing.GroupLayout(jPanelConsultaUsuario);
        jPanelConsultaUsuario.setLayout(jPanelConsultaUsuarioLayout);
        jPanelConsultaUsuarioLayout.setHorizontalGroup(
            jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        jPanelConsultaUsuarioLayout.setVerticalGroup(
            jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanelConsultaUsuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        actualizar();
    }//GEN-LAST:event_jTabbedPane1MouseClicked
    private void PonerContenedorDentroContenedor(JPanel contenido,JPanel contenedor) {
        contenido.setSize(620,600);
        contenido.setLocation(0,0);
        contenedor.removeAll();
        contenedor.add(contenido,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    } 
    public void actualizar(){
         AltaUsuario au=new AltaUsuario(); 
        PonerContenedorDentroContenedor(au,jPanelAltaUsuario);
        ConsultaUsuario cu=new ConsultaUsuario(); 
        PonerContenedorDentroContenedor(cu,jPanelConsultaUsuario);
        
     
     };

     
     public static void main(String args[]) {
         ControladoraPersistencia contpersis=new ControladoraPersistencia(); 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Lab1 lab=Lab1.getInstance();
                lab.setVisible(true);}
        });
    }
    private static Lab1 instance;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelAltaUsuario;
    private javax.swing.JPanel jPanelConsultaUsuario;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
