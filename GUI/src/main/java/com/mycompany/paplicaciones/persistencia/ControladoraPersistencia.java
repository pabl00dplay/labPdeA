package main.java.com.mycompany.paplicaciones.persistencia;

import DataTypes.DTActividad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.java.logica.Actividad;
import main.java.logica.Departamento;
import main.java.logica.Usuario;

public class ControladoraPersistencia {
    UsuarioJpaController ujpa=new UsuarioJpaController();
    ActividadJpaController ajpa=new ActividadJpaController();
    DepartamentoJpaController djpa=new DepartamentoJpaController();
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
    public boolean nicExiste(String nic){
        List<Usuario> lus=ujpa.findUsuarioEntities();
        boolean existe=false;
        Iterator<Usuario> itr = lus.iterator();
        for(Usuario u:lus) {
           if(u.getNick().equals(nic)){
               existe=true;
           }
        }
        return existe;      
    }

    public boolean mailExiste(String correo) {
        List<Usuario> lus=ujpa.findUsuarioEntities();
        boolean existe=false;
        for(Usuario u:lus) {
           if(u.getMail().equals(correo)){
               existe=true;
           }
        }
        return existe;
    }
    
    public boolean actividadExiste(String nombreActividad){
        Actividad act = ajpa.findActividad(nombreActividad);
        if(act==null){
            return false;
        }else{
            return true;
        }
    }
    
    public void altaActividadTuristica(Actividad act){
        try{
            ajpa.create(act);
            djpa.edit(act.getDep());
        } catch(Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean existeDepartamento(String nombreDepartamento){
        Departamento depto=djpa.findDepartamento(nombreDepartamento);
        if(depto==null){
            return false;
        }else{
            return true;
        }
    }
    public void altaDepartamento(Departamento d){
        try {
            djpa.create(d);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Departamento> getDepartamentos() {
        List<Departamento> listita=djpa.findDepartamentoEntities();
        ArrayList<Departamento> retorno=new ArrayList<Departamento>(listita);
        return retorno;
    }
    public Departamento getDepartamento(String nombreDepartamento){
    
        return djpa.findDepartamento(nombreDepartamento);
    }
}

