package main.java.com.mycompany.paplicaciones.persistencia;

import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.logica.DataTypes.DTturista;
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
        ArrayList<Usuario> retorno=new ArrayList<Usuario>(listita);
        return retorno;
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
}
