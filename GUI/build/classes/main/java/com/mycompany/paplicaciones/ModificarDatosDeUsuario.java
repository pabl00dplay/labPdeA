package main.java.com.mycompany.paplicaciones;

import java.util.ArrayList;
import main.java.logica.*;
import java.util.Set;
import javax.swing.DefaultListModel;
import DataTypes.DTUsuario;

public class ModificarDatosDeUsuario extends javax.swing.JPanel {

    
    public ModificarDatosDeUsuario() {
        initComponents();
        Fabrica fabrica = Fabrica.getInstance();
        IController cont=fabrica.getIController();
        ustexto.setVisible(true);
        listausu.setVisible(true);
        
        ArrayList<Usuario> usuarios=cont.getUsuarios();
        //Crear un objeto DefaultListModel
        DefaultListModel listModel = new DefaultListModel();
        //Recorrer el contenido del ArrayList
        for (int i = 0; i < usuarios.size(); i++) {
            //Añadir cada elemento del ArrayList en el modelo de la lista
            listModel.add(i, usuarios.get(i).getNick());
        }
        //Asociar el modelo de lista al JList
        listausu.setModel(listModel);
        
       
        nicktexto.setVisible(false);
        nombretexto.setVisible(false);
        apellidotexto.setVisible(false);
        mailtexto.setVisible(false);
        nactexto.setVisible(false);
        desctexto.setVisible(false);
        webtexto.setVisible(false);
        aceptarbot.setVisible(false);
        apellidovar.setVisible(false);
        descripvar.setVisible(false);
        mailtextomostrar.setVisible(false);
        nacionalidadvar.setVisible(false);
        nicktextomostrar.setVisible(false);
        nombretexto.setVisible(false);
        nombrevar.setVisible(false);
        webvar.setVisible(false);
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ustexto = new javax.swing.JLabel();
        nicktexto = new javax.swing.JLabel();
        nombretexto = new javax.swing.JLabel();
        apellidotexto = new javax.swing.JLabel();
        mailtexto = new javax.swing.JLabel();
        nombrevar = new javax.swing.JTextField();
        apellidovar = new javax.swing.JTextField();
        aceptarbot = new javax.swing.JButton();
        nactexto = new javax.swing.JLabel();
        nacionalidadvar = new javax.swing.JTextField();
        desctexto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripvar = new javax.swing.JTextArea();
        webtexto = new javax.swing.JLabel();
        webvar = new javax.swing.JTextField();
        nicktextomostrar = new javax.swing.JLabel();
        mailtextomostrar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listausu = new javax.swing.JList<>();

        setPreferredSize(new java.awt.Dimension(620, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR DATOS DE USUARIO");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setPreferredSize(new java.awt.Dimension(258, 28));

        ustexto.setText("Usuarios");

        nicktexto.setText("Nickname");

        nombretexto.setText("Nombre");

        apellidotexto.setText("Apellido");

        mailtexto.setText("Mail");

        nombrevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrevarActionPerformed(evt);
            }
        });

        aceptarbot.setText("Aceptar");
        aceptarbot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarbotActionPerformed(evt);
            }
        });

        nactexto.setText("Nacionalidad");

        desctexto.setText("Descripción");

        descripvar.setColumns(20);
        descripvar.setLineWrap(true);
        descripvar.setRows(5);
        jScrollPane1.setViewportView(descripvar);

        webtexto.setText("Sitio Web");

        webvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                webvarActionPerformed(evt);
            }
        });

        nicktextomostrar.setText(".                                                   .");

        mailtextomostrar.setText(".                                                   .");

        listausu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listausuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listausu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(ustexto))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nicktexto)
                                    .addComponent(nombretexto)
                                    .addComponent(mailtexto)
                                    .addComponent(apellidotexto))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(desctexto)
                                    .addComponent(nactexto)
                                    .addComponent(webtexto))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nacionalidadvar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombrevar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidovar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nicktextomostrar)
                                    .addComponent(mailtextomostrar))
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(webvar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aceptarbot)
                        .addGap(66, 66, 66)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ustexto)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(nombretexto))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nicktexto)
                            .addComponent(nicktextomostrar))
                        .addGap(66, 66, 66)
                        .addComponent(apellidotexto))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(nombrevar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(apellidovar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mailtexto)
                                    .addComponent(mailtextomostrar)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nacionalidadvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nactexto))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desctexto))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(webvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(webtexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(aceptarbot)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombrevarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrevarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrevarActionPerformed

    private void aceptarbotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarbotActionPerformed
        Fabrica fabrica = Fabrica.getInstance();
        IController cont=fabrica.getIController();
        String nickname=listausu.getSelectedValue();//obtengo el nickname seleccionado
                
        String nomb = nombrevar.getText();
        String ap = apellidovar.getText();//agarro los nombres modificados

        Usuario u = cont.retornoUsuarioSelec(nickname);
        u.setApe(ap);
        u.setNom(nomb);
        
        if(u.getEsTurista()==1){
            String nac = nacionalidadvar.getText();
            u.setNac(nac);
        }else {
            String desc = descripvar.getText();
            String web = webvar.getText();
            u.setDescripcion(desc);
            u.setWeb(web);
        }
        
        Laboratorio1 lab = Laboratorio1.getInstance();
        lab.actualizar();
        cont.editarUsuario(u);
        
    }//GEN-LAST:event_aceptarbotActionPerformed

    private void webvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_webvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_webvarActionPerformed

    private void listausuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listausuMouseClicked
     
        String nickname=listausu.getSelectedValue();
        Fabrica f=Fabrica.getInstance();
        IController cont= f.getIController();
        Usuario u = cont.retornoUsuarioSelec(nickname);
        
        nicktextomostrar.setText(u.getNick().trim());
        nombrevar.setText(u.getNom().trim());
        apellidovar.setText(u.getApe().trim());
        mailtextomostrar.setText(u.getMail().trim());
        
        nicktexto.setVisible(true);
        nombretexto.setVisible(true);
        apellidotexto.setVisible(true);
        mailtexto.setVisible(true);
        aceptarbot.setVisible(true);
        nicktextomostrar.setVisible(true);
        nombrevar.setVisible(true);
        apellidovar.setVisible(true);
        mailtextomostrar.setVisible(true);
        
        if(u.getEsTurista()==1){//si es 1 es turista, 0 si no
            nactexto.setVisible(true);
            nacionalidadvar.setText(u.getNac().trim());
            nacionalidadvar.setVisible(true);
            
            desctexto.setVisible(false);
            webtexto.setVisible(false);
            descripvar.setVisible(false);
            webvar.setVisible(false);
            
        }else {
            desctexto.setVisible(true);
            webtexto.setVisible(true);
            descripvar.setVisible(true);
            webvar.setVisible(true);
            descripvar.setText(u.getDescripcion().trim());
            webvar.setText(u.getWeb().trim());
            
            nactexto.setVisible(false);
            nacionalidadvar.setVisible(false);
        }   

    }//GEN-LAST:event_listausuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarbot;
    private javax.swing.JLabel apellidotexto;
    private javax.swing.JTextField apellidovar;
    private javax.swing.JTextArea descripvar;
    private javax.swing.JLabel desctexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listausu;
    private javax.swing.JLabel mailtexto;
    private javax.swing.JLabel mailtextomostrar;
    private javax.swing.JTextField nacionalidadvar;
    private javax.swing.JLabel nactexto;
    private javax.swing.JLabel nicktexto;
    private javax.swing.JLabel nicktextomostrar;
    private javax.swing.JLabel nombretexto;
    private javax.swing.JTextField nombrevar;
    private javax.swing.JLabel ustexto;
    private javax.swing.JLabel webtexto;
    private javax.swing.JTextField webvar;
    // End of variables declaration//GEN-END:variables
}
