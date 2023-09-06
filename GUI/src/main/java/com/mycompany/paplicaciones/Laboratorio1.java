package main.java.com.mycompany.paplicaciones;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import main.java.logica.*;

public class Laboratorio1 extends javax.swing.JFrame {
    private Laboratorio1() {
        Fabrica fabrica = Fabrica.getInstance();
        IController cont=fabrica.getIController();
        initComponents();
        
        AltaUsuario au=new AltaUsuario(); 
        PonerContenedorDentroContenedor(au,jPanelAltaUsuario);
        ConsultaUsuario cu=new ConsultaUsuario(); 
        PonerContenedorDentroContenedor(cu,jPanelConsultaUsuario);
        AltaActividadTuristica aat = new AltaActividadTuristica();
        PonerContenedorDentroContenedor(aat,jPanelAltaActividadTuristica);
        ConsultaActividadTuristica cat = new ConsultaActividadTuristica();
        PonerContenedorDentroContenedor(cat,jPanelConsultaActividadTuristica);
        ConsultaSalidaTuristica cst = new ConsultaSalidaTuristica();
        PonerContenedorDentroContenedor(cst,jPanelConsultaSalidaTuristica);
        AltaSalidaTuristica ast = new AltaSalidaTuristica();
        PonerContenedorDentroContenedor(ast,jPanelAltaSalidaTuristica);
        ConsultaPaquete cp = new ConsultaPaquete(cont);
        PonerContenedorDentroContenedor(cp,jPanelConsultaPaquetesActsTurs);
        CrearPaquete cpqt = new CrearPaquete(cont);
        PonerContenedorDentroContenedor(cpqt,jPanelCrearPaqueteActTuristicas);
        ModificarDatosDeUsuario mdu = new ModificarDatosDeUsuario();
        PonerContenedorDentroContenedor(mdu,jPanelModificarDatosUsuario); 
        AltaDeDepartamento adp = new AltaDeDepartamento();
        PonerContenedorDentroContenedor(adp,jPanelAltaDepartamento);
        AgregarActividadPaquete aap = new AgregarActividadPaquete(cont);
        PonerContenedorDentroContenedor(aap,jPanelAgregarActTuríPaquete);
     
        
    }
    
    public void PonerConsultaActividadTurísticaDentroConsultaUsuario() {
     ConsultaActividadTuristica ca= new ConsultaActividadTuristica();
        PonerContenedorDentroContenedor(ca,jPanelConsultaUsuario);
    }
    public void PonerSalidasTuristicasDentroConsultaUsuario() {
        ConsultaSalidaTuristica cs= new ConsultaSalidaTuristica();
        PonerContenedorDentroContenedor(cs,jPanelConsultaUsuario);
    }
    
    private void PonerContenedorDentroContenedor(JPanel contenido,JPanel contenedor) {
        contenido.setSize(620,600);
        contenido.setLocation(0,0);
        contenedor.removeAll();
        contenedor.add(contenido,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelAltaUsuario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelConsultaUsuario = new javax.swing.JPanel();
        jPanelModificarDatosUsuario = new javax.swing.JPanel();
        jPanelAltaSalidaTuristica = new javax.swing.JPanel();
        jPanelConsultaSalidaTuristica = new javax.swing.JPanel();
        jPanelInscripcionSalidaTuristica = new javax.swing.JPanel();
        jPanelCrearPaqueteActTuristicas = new javax.swing.JPanel();
        jPanelAgregarActTuríPaquete = new javax.swing.JPanel();
        jPanelConsultaPaquetesActsTurs = new javax.swing.JPanel();
        jPanelAltaDepartamento = new javax.swing.JPanel();
        jPanelAltaActividadTuristica = new javax.swing.JPanel();
        jPanelConsultaActividadTuristica = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelAltaUsuario.setPreferredSize(new java.awt.Dimension(600, 800));

        javax.swing.GroupLayout jPanelAltaUsuarioLayout = new javax.swing.GroupLayout(jPanelAltaUsuario);
        jPanelAltaUsuario.setLayout(jPanelAltaUsuarioLayout);
        jPanelAltaUsuarioLayout.setHorizontalGroup(
            jPanelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaUsuarioLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel7)
                .addContainerGap(383, Short.MAX_VALUE))
        );
        jPanelAltaUsuarioLayout.setVerticalGroup(
            jPanelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaUsuarioLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel7)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta de Usuario", jPanelAltaUsuario);

        jPanelConsultaUsuario.setPreferredSize(new java.awt.Dimension(600, 800));

        javax.swing.GroupLayout jPanelConsultaUsuarioLayout = new javax.swing.GroupLayout(jPanelConsultaUsuario);
        jPanelConsultaUsuario.setLayout(jPanelConsultaUsuarioLayout);
        jPanelConsultaUsuarioLayout.setHorizontalGroup(
            jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelConsultaUsuarioLayout.setVerticalGroup(
            jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta de Usuario", jPanelConsultaUsuario);

        javax.swing.GroupLayout jPanelModificarDatosUsuarioLayout = new javax.swing.GroupLayout(jPanelModificarDatosUsuario);
        jPanelModificarDatosUsuario.setLayout(jPanelModificarDatosUsuarioLayout);
        jPanelModificarDatosUsuarioLayout.setHorizontalGroup(
            jPanelModificarDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelModificarDatosUsuarioLayout.setVerticalGroup(
            jPanelModificarDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar Datos del Usuario", jPanelModificarDatosUsuario);

        javax.swing.GroupLayout jPanelAltaSalidaTuristicaLayout = new javax.swing.GroupLayout(jPanelAltaSalidaTuristica);
        jPanelAltaSalidaTuristica.setLayout(jPanelAltaSalidaTuristicaLayout);
        jPanelAltaSalidaTuristicaLayout.setHorizontalGroup(
            jPanelAltaSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelAltaSalidaTuristicaLayout.setVerticalGroup(
            jPanelAltaSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alta de Salida Turistica", jPanelAltaSalidaTuristica);

        javax.swing.GroupLayout jPanelConsultaSalidaTuristicaLayout = new javax.swing.GroupLayout(jPanelConsultaSalidaTuristica);
        jPanelConsultaSalidaTuristica.setLayout(jPanelConsultaSalidaTuristicaLayout);
        jPanelConsultaSalidaTuristicaLayout.setHorizontalGroup(
            jPanelConsultaSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelConsultaSalidaTuristicaLayout.setVerticalGroup(
            jPanelConsultaSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta de SalidaTuristica", jPanelConsultaSalidaTuristica);

        javax.swing.GroupLayout jPanelInscripcionSalidaTuristicaLayout = new javax.swing.GroupLayout(jPanelInscripcionSalidaTuristica);
        jPanelInscripcionSalidaTuristica.setLayout(jPanelInscripcionSalidaTuristicaLayout);
        jPanelInscripcionSalidaTuristicaLayout.setHorizontalGroup(
            jPanelInscripcionSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelInscripcionSalidaTuristicaLayout.setVerticalGroup(
            jPanelInscripcionSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inscripcion a SalidaTuristica", jPanelInscripcionSalidaTuristica);

        javax.swing.GroupLayout jPanelCrearPaqueteActTuristicasLayout = new javax.swing.GroupLayout(jPanelCrearPaqueteActTuristicas);
        jPanelCrearPaqueteActTuristicas.setLayout(jPanelCrearPaqueteActTuristicasLayout);
        jPanelCrearPaqueteActTuristicasLayout.setHorizontalGroup(
            jPanelCrearPaqueteActTuristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelCrearPaqueteActTuristicasLayout.setVerticalGroup(
            jPanelCrearPaqueteActTuristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Crear Paquete de Actividades Turisticas", jPanelCrearPaqueteActTuristicas);

        javax.swing.GroupLayout jPanelAgregarActTuríPaqueteLayout = new javax.swing.GroupLayout(jPanelAgregarActTuríPaquete);
        jPanelAgregarActTuríPaquete.setLayout(jPanelAgregarActTuríPaqueteLayout);
        jPanelAgregarActTuríPaqueteLayout.setHorizontalGroup(
            jPanelAgregarActTuríPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelAgregarActTuríPaqueteLayout.setVerticalGroup(
            jPanelAgregarActTuríPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agregar Actividad Turistica a Paquete", jPanelAgregarActTuríPaquete);

        javax.swing.GroupLayout jPanelConsultaPaquetesActsTursLayout = new javax.swing.GroupLayout(jPanelConsultaPaquetesActsTurs);
        jPanelConsultaPaquetesActsTurs.setLayout(jPanelConsultaPaquetesActsTursLayout);
        jPanelConsultaPaquetesActsTursLayout.setHorizontalGroup(
            jPanelConsultaPaquetesActsTursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelConsultaPaquetesActsTursLayout.setVerticalGroup(
            jPanelConsultaPaquetesActsTursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta Paquetes ActividadesTurisricas", jPanelConsultaPaquetesActsTurs);

        javax.swing.GroupLayout jPanelAltaDepartamentoLayout = new javax.swing.GroupLayout(jPanelAltaDepartamento);
        jPanelAltaDepartamento.setLayout(jPanelAltaDepartamentoLayout);
        jPanelAltaDepartamentoLayout.setHorizontalGroup(
            jPanelAltaDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelAltaDepartamentoLayout.setVerticalGroup(
            jPanelAltaDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alta de Departamento", jPanelAltaDepartamento);

        javax.swing.GroupLayout jPanelAltaActividadTuristicaLayout = new javax.swing.GroupLayout(jPanelAltaActividadTuristica);
        jPanelAltaActividadTuristica.setLayout(jPanelAltaActividadTuristicaLayout);
        jPanelAltaActividadTuristicaLayout.setHorizontalGroup(
            jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelAltaActividadTuristicaLayout.setVerticalGroup(
            jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alta de Actividad Turistica", jPanelAltaActividadTuristica);

        javax.swing.GroupLayout jPanelConsultaActividadTuristicaLayout = new javax.swing.GroupLayout(jPanelConsultaActividadTuristica);
        jPanelConsultaActividadTuristica.setLayout(jPanelConsultaActividadTuristicaLayout);
        jPanelConsultaActividadTuristicaLayout.setHorizontalGroup(
            jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        jPanelConsultaActividadTuristicaLayout.setVerticalGroup(
            jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta de Actividad Turistica", jPanelConsultaActividadTuristica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public static Laboratorio1 getInstance() {
        if (instance == null) {
            instance = new Laboratorio1();
        }
        return instance;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Laboratorio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Laboratorio1 lab=Laboratorio1.getInstance();
                lab.setVisible(true);
            }
        });
    };
    
   
    private static Laboratorio1 instance;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanelAgregarActTuríPaquete;
    private javax.swing.JPanel jPanelAltaActividadTuristica;
    private javax.swing.JPanel jPanelAltaDepartamento;
    private javax.swing.JPanel jPanelAltaSalidaTuristica;
    private javax.swing.JPanel jPanelAltaUsuario;
    private javax.swing.JPanel jPanelConsultaActividadTuristica;
    private javax.swing.JPanel jPanelConsultaPaquetesActsTurs;
    private javax.swing.JPanel jPanelConsultaSalidaTuristica;
    private javax.swing.JPanel jPanelConsultaUsuario;
    private javax.swing.JPanel jPanelCrearPaqueteActTuristicas;
    private javax.swing.JPanel jPanelInscripcionSalidaTuristica;
    private javax.swing.JPanel jPanelModificarDatosUsuario;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
