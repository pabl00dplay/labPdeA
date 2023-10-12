
package main.java.com.mycompany.paplicaciones;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTSalida;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import main.java.logica.*;

public class InscripcionASalidaTuristica extends javax.swing.JPanel {

    public InscripcionASalidaTuristica() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        IController I=fabrica.getIController();
        
        cantsalidatexto.setVisible(false);
        cantidadmostrar.setVisible(false);//
        durmostrar.setVisible(false);//
        durtexto.setVisible(false);
        lugartexto.setVisible(false);//
        lugmostrar.setVisible(false);
        fechatexto.setVisible(false);
        fechamostrar.setVisible(false);
        horatexto.setVisible(false);
        horamostrar.setVisible(false);
        
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
        aceptaboton = new javax.swing.JButton();
        deptosbox = new javax.swing.JComboBox<>();
        actbox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        salidasbox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        turisbox = new javax.swing.JComboBox<>();
        costotexto = new javax.swing.JLabel();
        cantsalidatexto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cantidadmostrar = new javax.swing.JLabel();
        durtexto = new javax.swing.JLabel();
        durmostrar = new javax.swing.JLabel();
        lugartexto = new javax.swing.JLabel();
        lugmostrar = new javax.swing.JLabel();
        fechatexto = new javax.swing.JLabel();
        fechamostrar = new javax.swing.JLabel();
        horatexto = new javax.swing.JLabel();
        horamostrar = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setMaximumSize(new java.awt.Dimension(600, 620));
        setMinimumSize(new java.awt.Dimension(600, 620));
        setPreferredSize(new java.awt.Dimension(600, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSCRIPCIÓN A SALIDA TURÍSTICA");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setPreferredSize(new java.awt.Dimension(258, 28));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 320, 95));

        deptotexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deptotexto.setText("Departamento");
        add(deptotexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

        actividadtexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actividadtexto.setText("Actividad");
        add(actividadtexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 120, -1));

        jLabel2.setText("Fecha");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 30));

        jLabel3.setText("Cant Tur");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 30));

        jLabel4.setText("Costo");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 50, -1));

        cantvar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                cantvarInputMethodTextChanged(evt);
            }
        });
        cantvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantvarActionPerformed(evt);
            }
        });
        cantvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantvarKeyTyped(evt);
            }
        });
        add(cantvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 94, -1));

        aceptaboton.setText("Inscribir");
        aceptaboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptabotonActionPerformed(evt);
            }
        });
        add(aceptaboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, -1));

        deptosbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptosboxActionPerformed(evt);
            }
        });
        add(deptosbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 122, -1));

        actbox.setEnabled(false);
        actbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actboxActionPerformed(evt);
            }
        });
        add(actbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 122, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Salida");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 120, -1));

        salidasbox.setEnabled(false);
        salidasbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidasboxActionPerformed(evt);
            }
        });
        add(salidasbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 122, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Turista");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 120, -1));

        add(turisbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 122, -1));

        costotexto.setText(".............");
        add(costotexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 40, 20));

        cantsalidatexto.setText("Cantidad maxima de turistas:");
        add(cantsalidatexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        cantidadmostrar.setText("cantidad");
        add(cantidadmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        durtexto.setText("Duración:");
        add(durtexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        durmostrar.setText("dur");
        add(durmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        lugartexto.setText("Lugar:");
        add(lugartexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        lugmostrar.setText("lug");
        add(lugmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        fechatexto.setText("Fecha:");
        add(fechatexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        fechamostrar.setText("fecha");
        add(fechamostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        horatexto.setText("Hora:");
        add(horatexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, -1));

        horamostrar.setText("hora");
        add(horamostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, -1));

        jButton1.setText("Calcular Costo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel6.setText("$");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cantvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantvarActionPerformed

    private void aceptabotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptabotonActionPerformed
        // TODO add your handling code here:
        int cant,costo;
        //String nombreSal = (String) salidasbox.getSelectedItem();
        jButton1ActionPerformed(evt);
        String nick = (String) turisbox.getSelectedItem();
        String sal=(String) salidasbox.getSelectedItem();
        cant = Integer.parseInt(cantvar.getText().trim());
        costo = Integer.parseInt(costotexto.getText().trim());//costo calculado
        Date fecha = jDateChooser1.getDate();
        Fabrica f=Fabrica.getInstance();
        IController cont=f.getIController();
        Salida s = cont.retornoSalidaSel(sal);
        int cantMaxSal = s.getMaxTuristas();
        if (cantMaxSal >= cant){//si hay mas lugares disponibles
            if (!(cont.turiInscriptoSalida(nick, sal))){//si es false, se da el alta alta
                
                cont.altaInscripcion(sal,fecha, cant, costo, nick);
                cantvar.setText(null);
                costotexto.setText(null);
                
                Laboratorio1 lab = Laboratorio1.getInstance();
                lab.actualizar();
            }else{
                JOptionPane.showMessageDialog(null, "El Turista ya está inscripto en la salida.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "La cantidad de Turistas debe ser menor");
        }
        cantvar.setText(null);
        jDateChooser1.setDate(null);
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
        actbox.setEnabled(true);
        salidasbox.setEnabled(true);
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        ArrayList<DTActividad> listaActividades = I.listarActividadesDepartamento((String)deptosbox.getSelectedItem());
        DefaultComboBoxModel modelActividades = new DefaultComboBoxModel();
        for(int i=0;i<listaActividades.size();i++){
                modelActividades.addElement(listaActividades.get(i).getNombre());
        }
        actbox.setModel(modelActividades);
    }//GEN-LAST:event_deptosboxActionPerformed

    private void cantvarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cantvarInputMethodTextChanged
        //si cambia el numero de turistas inscriptos
        
    }//GEN-LAST:event_cantvarInputMethodTextChanged

    private void salidasboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidasboxActionPerformed
        Fabrica f=Fabrica.getInstance();
        IController cont=f.getIController();
        Actividad actSel = cont.retornoActividadSelec((String) actbox.getSelectedItem());
        Salida sSel = cont.retornoSalidaSel((String) salidasbox.getSelectedItem());
        cantidadmostrar.setText((Integer.toString(sSel.getMaxTuristas())));
        durmostrar.setText((Integer.toString(actSel.getDur())));
        lugmostrar.setText((sSel.getLugat()));
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        fechamostrar.setText((String)(formato.format(sSel.getFecha())));
        horatexto.setText(sSel.getHora());
        
        cantsalidatexto.setVisible(true);
        cantidadmostrar.setVisible(true);//
        durmostrar.setVisible(true);//
        durtexto.setVisible(true);
        lugartexto.setVisible(true);//
        lugmostrar.setVisible(true);
        fechatexto.setVisible(true);
        fechamostrar.setVisible(true);
        horatexto.setVisible(true);
        horamostrar.setVisible(true);
        
    }//GEN-LAST:event_salidasboxActionPerformed

    private void cantvarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantvarKeyTyped
               // TODO add your handling code here:
    }//GEN-LAST:event_cantvarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Fabrica f=Fabrica.getInstance();
        IController cont=f.getIController();
        Actividad actSel = cont.retornoActividadSelec((String) actbox.getSelectedItem());
        int costoActividad = actSel.getCosto();
        Integer cantTur = Integer.parseInt(cantvar.getText().trim());
        int costoCalculado = (costoActividad * cantTur);
        costotexto.setText((Integer.toString(costoCalculado))); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptaboton;
    private javax.swing.JComboBox<String> actbox;
    private javax.swing.JLabel actividadtexto;
    private javax.swing.JLabel cantidadmostrar;
    private javax.swing.JLabel cantsalidatexto;
    private javax.swing.JTextField cantvar;
    private javax.swing.JLabel costotexto;
    private javax.swing.JComboBox<String> deptosbox;
    private javax.swing.JLabel deptotexto;
    private javax.swing.JLabel durmostrar;
    private javax.swing.JLabel durtexto;
    private javax.swing.JLabel fechamostrar;
    private javax.swing.JLabel fechatexto;
    private javax.swing.JLabel horamostrar;
    private javax.swing.JLabel horatexto;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lugartexto;
    private javax.swing.JLabel lugmostrar;
    private javax.swing.JComboBox<String> salidasbox;
    private javax.swing.JComboBox<String> turisbox;
    // End of variables declaration//GEN-END:variables
}
