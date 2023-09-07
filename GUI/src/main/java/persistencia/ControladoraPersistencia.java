/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.persistencia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import DataTypes.*;
import main.java.logica.Usuario;

public class ControladoraPersistencia {
    UsuarioJpaController ujpa=new UsuarioJpaController();
    public void altaTurista(Usuario t) {
        try {
            ujpa.create(t);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        List<Usuario> listita=ujpa.findUsuarioEntities();
        return new ArrayList(listita);
    }

    public void altaProveedor(Usuario p) {
        try {
            ujpa.create(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean nicExiste(String nic) {
        List<Usuario> lus=ujpa.findUsuarioEntities();
        boolean existe=false;
        Iterator<Usuario> itr = lus.iterator();
        while (itr.hasNext()) {
           if(itr.next().getNick().equals(nic) ){
               existe=true;
           }
        }
        return existe;      
    }

    public boolean mailExiste(String correo) {
        List<Usuario> lus=ujpa.findUsuarioEntities();
        boolean existe=false;
        Iterator<Usuario> itr = lus.iterator();
        while (itr.hasNext()) {
           if(itr.next().getMail().equals(correo) ){
               existe=true;
           }
        }
        return existe;
    }

    public DTusuario getUsuario(String nickname) {
        Usuario u=ujpa.findUsuario(nickname);
        return u.getData();
    }
    

}