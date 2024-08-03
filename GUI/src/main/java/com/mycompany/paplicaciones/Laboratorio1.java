package main.java.com.mycompany.paplicaciones;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import main.java.com.mycompany.paplicaciones.persistencia.ControladoraPersistencia;
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
        ConsultaPaquete cp = new ConsultaPaquete();
        PonerContenedorDentroContenedor(cp,jPanelConsultaPaquetesActsTurs);
        CrearPaquete cpqt = new CrearPaquete();
        PonerContenedorDentroContenedor(cpqt,jPanelCrearPaqueteActTuristicas);
        ModificarDatosDeUsuario mdu = new ModificarDatosDeUsuario();
        PonerContenedorDentroContenedor(mdu,jPanelModificarDatosUsuario); 
        AltaDeDepartamento adp = new AltaDeDepartamento();
        PonerContenedorDentroContenedor(adp,jPanelAltaDepartamento);
        AgregarActividadPaquete aap = new AgregarActividadPaquete();
        PonerContenedorDentroContenedor(aap,jPanelAgregarActTuríPaquete);
        InscripcionASalidaTuristica isp = new InscripcionASalidaTuristica();
        PonerContenedorDentroContenedor(isp,jPanelInscripcionSalidaTuristica);
        AceptarActividades aa = new AceptarActividades();
        PonerContenedorDentroContenedor(aa,jPanelAceptarActividades);
        AltaCategoria ac = new AltaCategoria();
        PonerContenedorDentroContenedor(ac,jPanelAltaCategoria);
        ComprarPaquete compPaq = new ComprarPaquete();
        PonerContenedorDentroContenedor(compPaq,jPanelComprarPaquete);
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
        jPanelConsultaUsuario = new javax.swing.JPanel();
        jPanelAltaUsuario = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanelModificarDatosUsuario = new javax.swing.JPanel();
        jPanelAltaSalidaTuristica = new javax.swing.JPanel();
        jPanelConsultaSalidaTuristica = new javax.swing.JPanel();
        jPanelInscripcionSalidaTuristica = new javax.swing.JPanel();
        jPanelCrearPaqueteActTuristicas = new javax.swing.JPanel();
        jPanelAgregarActTuríPaquete = new javax.swing.JPanel();
        jPanelConsultaPaquetesActsTurs = new javax.swing.JPanel();
        jPanelAltaActividadTuristica = new javax.swing.JPanel();
        jPanelConsultaActividadTuristica = new javax.swing.JPanel();
        jPanelAltaDepartamento = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelAceptarActividades = new javax.swing.JPanel();
        jPanelAltaCategoria = new javax.swing.JPanel();
        jPanelComprarPaquete = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1059, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(620, 600));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanelConsultaUsuario.setMaximumSize(new java.awt.Dimension(600, 620));
        jPanelConsultaUsuario.setMinimumSize(new java.awt.Dimension(600, 620));
        jPanelConsultaUsuario.setPreferredSize(new java.awt.Dimension(600, 620));
        jPanelConsultaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelConsultaUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaUsuarioLayout = new javax.swing.GroupLayout(jPanelConsultaUsuario);
        jPanelConsultaUsuario.setLayout(jPanelConsultaUsuarioLayout);
        jPanelConsultaUsuarioLayout.setHorizontalGroup(
            jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanelConsultaUsuarioLayout.setVerticalGroup(
            jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta de Usuario", jPanelConsultaUsuario);

        jPanelAltaUsuario.setPreferredSize(new java.awt.Dimension(600, 800));
        jPanelAltaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAltaUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAltaUsuarioLayout = new javax.swing.GroupLayout(jPanelAltaUsuario);
        jPanelAltaUsuario.setLayout(jPanelAltaUsuarioLayout);
        jPanelAltaUsuarioLayout.setHorizontalGroup(
            jPanelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaUsuarioLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAltaUsuarioLayout.setVerticalGroup(
            jPanelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaUsuarioLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel7)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta de Usuario", jPanelAltaUsuario);

        jPanelModificarDatosUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelModificarDatosUsuarioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelModificarDatosUsuarioLayout = new javax.swing.GroupLayout(jPanelModificarDatosUsuario);
        jPanelModificarDatosUsuario.setLayout(jPanelModificarDatosUsuarioLayout);
        jPanelModificarDatosUsuarioLayout.setHorizontalGroup(
            jPanelModificarDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelModificarDatosUsuarioLayout.setVerticalGroup(
            jPanelModificarDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modificar Datos del Usuario", jPanelModificarDatosUsuario);

        jPanelAltaSalidaTuristica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAltaSalidaTuristicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAltaSalidaTuristicaLayout = new javax.swing.GroupLayout(jPanelAltaSalidaTuristica);
        jPanelAltaSalidaTuristica.setLayout(jPanelAltaSalidaTuristicaLayout);
        jPanelAltaSalidaTuristicaLayout.setHorizontalGroup(
            jPanelAltaSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelAltaSalidaTuristicaLayout.setVerticalGroup(
            jPanelAltaSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alta de Salida Turistica", jPanelAltaSalidaTuristica);

        jPanelConsultaSalidaTuristica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelConsultaSalidaTuristicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaSalidaTuristicaLayout = new javax.swing.GroupLayout(jPanelConsultaSalidaTuristica);
        jPanelConsultaSalidaTuristica.setLayout(jPanelConsultaSalidaTuristicaLayout);
        jPanelConsultaSalidaTuristicaLayout.setHorizontalGroup(
            jPanelConsultaSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelConsultaSalidaTuristicaLayout.setVerticalGroup(
            jPanelConsultaSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta de SalidaTuristica", jPanelConsultaSalidaTuristica);

        jPanelInscripcionSalidaTuristica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelInscripcionSalidaTuristicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelInscripcionSalidaTuristicaLayout = new javax.swing.GroupLayout(jPanelInscripcionSalidaTuristica);
        jPanelInscripcionSalidaTuristica.setLayout(jPanelInscripcionSalidaTuristicaLayout);
        jPanelInscripcionSalidaTuristicaLayout.setHorizontalGroup(
            jPanelInscripcionSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelInscripcionSalidaTuristicaLayout.setVerticalGroup(
            jPanelInscripcionSalidaTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Inscripcion a SalidaTuristica", jPanelInscripcionSalidaTuristica);

        jPanelCrearPaqueteActTuristicas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCrearPaqueteActTuristicasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrearPaqueteActTuristicasLayout = new javax.swing.GroupLayout(jPanelCrearPaqueteActTuristicas);
        jPanelCrearPaqueteActTuristicas.setLayout(jPanelCrearPaqueteActTuristicasLayout);
        jPanelCrearPaqueteActTuristicasLayout.setHorizontalGroup(
            jPanelCrearPaqueteActTuristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelCrearPaqueteActTuristicasLayout.setVerticalGroup(
            jPanelCrearPaqueteActTuristicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Crear Paquete de Actividades Turisticas", jPanelCrearPaqueteActTuristicas);

        jPanelAgregarActTuríPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAgregarActTuríPaqueteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAgregarActTuríPaqueteLayout = new javax.swing.GroupLayout(jPanelAgregarActTuríPaquete);
        jPanelAgregarActTuríPaquete.setLayout(jPanelAgregarActTuríPaqueteLayout);
        jPanelAgregarActTuríPaqueteLayout.setHorizontalGroup(
            jPanelAgregarActTuríPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelAgregarActTuríPaqueteLayout.setVerticalGroup(
            jPanelAgregarActTuríPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agregar Actividad Turistica a Paquete", jPanelAgregarActTuríPaquete);

        jPanelConsultaPaquetesActsTurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelConsultaPaquetesActsTursMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaPaquetesActsTursLayout = new javax.swing.GroupLayout(jPanelConsultaPaquetesActsTurs);
        jPanelConsultaPaquetesActsTurs.setLayout(jPanelConsultaPaquetesActsTursLayout);
        jPanelConsultaPaquetesActsTursLayout.setHorizontalGroup(
            jPanelConsultaPaquetesActsTursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelConsultaPaquetesActsTursLayout.setVerticalGroup(
            jPanelConsultaPaquetesActsTursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta Paquetes ActividadesTurisricas", jPanelConsultaPaquetesActsTurs);

        jPanelAltaActividadTuristica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAltaActividadTuristicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAltaActividadTuristicaLayout = new javax.swing.GroupLayout(jPanelAltaActividadTuristica);
        jPanelAltaActividadTuristica.setLayout(jPanelAltaActividadTuristicaLayout);
        jPanelAltaActividadTuristicaLayout.setHorizontalGroup(
            jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelAltaActividadTuristicaLayout.setVerticalGroup(
            jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alta de Actividad Turistica", jPanelAltaActividadTuristica);

        jPanelConsultaActividadTuristica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelConsultaActividadTuristicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaActividadTuristicaLayout = new javax.swing.GroupLayout(jPanelConsultaActividadTuristica);
        jPanelConsultaActividadTuristica.setLayout(jPanelConsultaActividadTuristicaLayout);
        jPanelConsultaActividadTuristicaLayout.setHorizontalGroup(
            jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelConsultaActividadTuristicaLayout.setVerticalGroup(
            jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulta de Actividad Turistica", jPanelConsultaActividadTuristica);

        jPanelAltaDepartamento.setPreferredSize(new java.awt.Dimension(600, 620));
        jPanelAltaDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelAltaDepartamentoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAltaDepartamentoLayout = new javax.swing.GroupLayout(jPanelAltaDepartamento);
        jPanelAltaDepartamento.setLayout(jPanelAltaDepartamentoLayout);
        jPanelAltaDepartamentoLayout.setHorizontalGroup(
            jPanelAltaDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelAltaDepartamentoLayout.setVerticalGroup(
            jPanelAltaDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alta de Departamento", jPanelAltaDepartamento);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CARGAR DATOS DE PRUEBA");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 410, 220));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 450, 260));

        jTabbedPane1.addTab("Cargar Datos de prueba", jPanel1);

        javax.swing.GroupLayout jPanelAceptarActividadesLayout = new javax.swing.GroupLayout(jPanelAceptarActividades);
        jPanelAceptarActividades.setLayout(jPanelAceptarActividadesLayout);
        jPanelAceptarActividadesLayout.setHorizontalGroup(
            jPanelAceptarActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelAceptarActividadesLayout.setVerticalGroup(
            jPanelAceptarActividadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Administrar Actividades", jPanelAceptarActividades);

        javax.swing.GroupLayout jPanelAltaCategoriaLayout = new javax.swing.GroupLayout(jPanelAltaCategoria);
        jPanelAltaCategoria.setLayout(jPanelAltaCategoriaLayout);
        jPanelAltaCategoriaLayout.setHorizontalGroup(
            jPanelAltaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelAltaCategoriaLayout.setVerticalGroup(
            jPanelAltaCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alta Categoria", jPanelAltaCategoria);

        javax.swing.GroupLayout jPanelComprarPaqueteLayout = new javax.swing.GroupLayout(jPanelComprarPaquete);
        jPanelComprarPaquete.setLayout(jPanelComprarPaqueteLayout);
        jPanelComprarPaqueteLayout.setHorizontalGroup(
            jPanelComprarPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 371, Short.MAX_VALUE)
        );
        jPanelComprarPaqueteLayout.setVerticalGroup(
            jPanelComprarPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Comprar Paquete", jPanelComprarPaquete);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 6, 860, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Fabrica fab = Fabrica.getInstance();
        IController I = fab.getIController();
        I.inicializar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        actualizar();
    }//GEN-LAST:event_jTabbedPane1MouseClicked
    public void actualizar() {                                                   
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
        ConsultaPaquete cp = new ConsultaPaquete();
        PonerContenedorDentroContenedor(cp,jPanelConsultaPaquetesActsTurs);
        CrearPaquete cpqt = new CrearPaquete();
        PonerContenedorDentroContenedor(cpqt,jPanelCrearPaqueteActTuristicas);
        ModificarDatosDeUsuario mdu = new ModificarDatosDeUsuario();
        PonerContenedorDentroContenedor(mdu,jPanelModificarDatosUsuario); 
        AltaDeDepartamento adp = new AltaDeDepartamento();
        PonerContenedorDentroContenedor(adp,jPanelAltaDepartamento);
        AgregarActividadPaquete aap = new AgregarActividadPaquete();
        PonerContenedorDentroContenedor(aap,jPanelAgregarActTuríPaquete);
        InscripcionASalidaTuristica isp = new InscripcionASalidaTuristica();
        PonerContenedorDentroContenedor(isp,jPanelInscripcionSalidaTuristica);
        AceptarActividades aa = new AceptarActividades();
        PonerContenedorDentroContenedor(aa,jPanelAceptarActividades);
        AltaCategoria ac = new AltaCategoria();
        PonerContenedorDentroContenedor(ac,jPanelAltaCategoria);
        ComprarPaquete compPaq = new ComprarPaquete();
        PonerContenedorDentroContenedor(compPaq,jPanelComprarPaquete);
    }        
    
    
    private void jPanelConsultaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsultaUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelConsultaUsuarioMouseClicked

    private void jPanelAltaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAltaUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelAltaUsuarioMouseClicked

    private void jPanelModificarDatosUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelModificarDatosUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelModificarDatosUsuarioMouseClicked

    private void jPanelAltaSalidaTuristicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAltaSalidaTuristicaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelAltaSalidaTuristicaMouseClicked

    private void jPanelInscripcionSalidaTuristicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelInscripcionSalidaTuristicaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelInscripcionSalidaTuristicaMouseClicked

    private void jPanelCrearPaqueteActTuristicasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCrearPaqueteActTuristicasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelCrearPaqueteActTuristicasMouseClicked

    private void jPanelAgregarActTuríPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAgregarActTuríPaqueteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelAgregarActTuríPaqueteMouseClicked

    private void jPanelConsultaPaquetesActsTursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsultaPaquetesActsTursMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelConsultaPaquetesActsTursMouseClicked

    private void jPanelConsultaActividadTuristicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsultaActividadTuristicaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelConsultaActividadTuristicaMouseClicked

    private void jPanelAltaDepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAltaDepartamentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelAltaDepartamentoMouseClicked

    private void jPanelConsultaSalidaTuristicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsultaSalidaTuristicaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelConsultaSalidaTuristicaMouseClicked

    private void jPanelAltaActividadTuristicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelAltaActividadTuristicaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelAltaActividadTuristicaMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked
     public static Laboratorio1 getInstance() {
        if (instance == null) {
            instance = new Laboratorio1();
        }
        return instance;
    }
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

        ControladoraPersistencia contpersis=new ControladoraPersistencia(); 
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAceptarActividades;
    private javax.swing.JPanel jPanelAgregarActTuríPaquete;
    private javax.swing.JPanel jPanelAltaActividadTuristica;
    private javax.swing.JPanel jPanelAltaCategoria;
    private javax.swing.JPanel jPanelAltaDepartamento;
    private javax.swing.JPanel jPanelAltaSalidaTuristica;
    private javax.swing.JPanel jPanelAltaUsuario;
    private javax.swing.JPanel jPanelComprarPaquete;
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
