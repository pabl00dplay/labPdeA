package main.java.com.mycompany.paplicaciones;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Laboratorio1 extends javax.swing.JFrame {
    private Laboratorio1() {
        initComponents();
        AltaUsuario au=new AltaUsuario(); 
        PonerContenedorDentroContenedor(au,jPanelAltaUsuario);
        ConsultaUsuario cu=new ConsultaUsuario(); 
        PonerContenedorDentroContenedor(cu,jPanelConsultaUsuario);
        
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
        contenido.setSize(800,600);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelConsultaActividadTuristica = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jList4 = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jList5 = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout jPanelAltaUsuarioLayout = new javax.swing.GroupLayout(jPanelAltaUsuario);
        jPanelAltaUsuario.setLayout(jPanelAltaUsuarioLayout);
        jPanelAltaUsuarioLayout.setHorizontalGroup(
            jPanelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaUsuarioLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel7)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanelAltaUsuarioLayout.setVerticalGroup(
            jPanelAltaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaUsuarioLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel7)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta de Usuario", jPanelAltaUsuario);

        javax.swing.GroupLayout jPanelConsultaUsuarioLayout = new javax.swing.GroupLayout(jPanelConsultaUsuario);
        jPanelConsultaUsuario.setLayout(jPanelConsultaUsuarioLayout);
        jPanelConsultaUsuarioLayout.setHorizontalGroup(
            jPanelConsultaUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
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
            .addGap(0, 508, Short.MAX_VALUE)
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
            .addGap(0, 508, Short.MAX_VALUE)
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
            .addGap(0, 508, Short.MAX_VALUE)
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
            .addGap(0, 508, Short.MAX_VALUE)
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
            .addGap(0, 508, Short.MAX_VALUE)
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
            .addGap(0, 508, Short.MAX_VALUE)
        );
        jPanelAgregarActTuríPaqueteLayout.setVerticalGroup(
            jPanelAgregarActTuríPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Agregar Actividad Turistica a íPaquete", jPanelAgregarActTuríPaquete);

        javax.swing.GroupLayout jPanelConsultaPaquetesActsTursLayout = new javax.swing.GroupLayout(jPanelConsultaPaquetesActsTurs);
        jPanelConsultaPaquetesActsTurs.setLayout(jPanelConsultaPaquetesActsTursLayout);
        jPanelConsultaPaquetesActsTursLayout.setHorizontalGroup(
            jPanelConsultaPaquetesActsTursLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
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
            .addGap(0, 508, Short.MAX_VALUE)
        );
        jPanelAltaDepartamentoLayout.setVerticalGroup(
            jPanelAltaDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Alta de Departamento", jPanelAltaDepartamento);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proovedores");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Departamentos");
        jLabel2.setToolTipText("");

        jLabel3.setText("Proovedor");

        jLabel4.setText("Departamento");

        jLabel5.setText("Nombre Actividad");

        jLabel6.setText("Descripción");

        jLabel8.setText("Duración");

        jLabel9.setText("Costo");

        jLabel10.setText("Ciudad");

        jLabel11.setText("Fecha de Alta");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("ALTA ACTIVIDAD TURÍSTICA");
        jLabel12.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setText("Registrar Actividad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout jPanelAltaActividadTuristicaLayout = new javax.swing.GroupLayout(jPanelAltaActividadTuristica);
        jPanelAltaActividadTuristica.setLayout(jPanelAltaActividadTuristicaLayout);
        jPanelAltaActividadTuristicaLayout.setHorizontalGroup(
            jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addGroup(jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)))
                    .addGroup(jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(61, 61, 61)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)))
                    .addGroup(jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(38, 38, 38)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanelAltaActividadTuristicaLayout.setVerticalGroup(
            jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addGroup(jPanelAltaActividadTuristicaLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAltaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alta de Actividad Turistica", jPanelAltaActividadTuristica);

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CONSULTA ACTIVIDAD TURISTICA");
        jLabel13.setBorder(new javax.swing.border.MatteBorder(null));

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Departamento");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Actividad");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Salidas");

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Paquetes");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setRequestFocusEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaActividadTuristicaLayout = new javax.swing.GroupLayout(jPanelConsultaActividadTuristica);
        jPanelConsultaActividadTuristica.setLayout(jPanelConsultaActividadTuristicaLayout);
        jPanelConsultaActividadTuristicaLayout.setHorizontalGroup(
            jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaActividadTuristicaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(jList4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jList5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelConsultaActividadTuristicaLayout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelConsultaActividadTuristicaLayout.setVerticalGroup(
            jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaActividadTuristicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(8, 8, 8)
                .addGroup(jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelConsultaActividadTuristicaLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(234, 234, 234))
                    .addGroup(jPanelConsultaActividadTuristicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jList5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jList4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consulta de Actividad Turistica", jPanelConsultaActividadTuristica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(215, 215, 215))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
