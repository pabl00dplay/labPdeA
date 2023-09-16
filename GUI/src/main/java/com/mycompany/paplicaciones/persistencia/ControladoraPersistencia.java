package main.java.com.mycompany.paplicaciones.persistencia;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTPaquete;
import DataTypes.DTSalida;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.java.logica.Actividad;
import main.java.logica.Departamento;
import main.java.logica.Usuario;

import main.java.com.mycompany.paplicaciones.persistencia.*;
import main.java.logica.Paquete;
import main.java.logica.Salida;

public class ControladoraPersistencia {
    SalidaJpaController sjpa=new SalidaJpaController();
    UsuarioJpaController ujpa=new UsuarioJpaController();
    ActividadJpaController ajpa=new ActividadJpaController();
    DepartamentoJpaController djpa=new DepartamentoJpaController();
    PaqueteJpaController pjpa=new PaqueteJpaController();
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
    public void altaSalida(Salida salida) {
        try {
            sjpa.create(salida);
            ajpa.edit(salida.getActividad());
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    public ArrayList<DTDepartamento> getDepartamentos() {
        List<Departamento> listita=djpa.findDepartamentoEntities();
        ArrayList<DTDepartamento> retorno=new ArrayList<DTDepartamento>();
        for(Departamento d:listita){
            retorno.add(d.getData());
        }
        return retorno;
    }
    public Departamento getDepartamento(String nombreDepartamento){
    
        return djpa.findDepartamento(nombreDepartamento);
    }
    public ArrayList<DTActividad>listarActividadesDepartamento(String nombreDepartamento){
        Departamento d = djpa.findDepartamento(nombreDepartamento);
        return d.getActividades();
    }

    public Actividad getActividad(String nombreActividad) {
        Actividad act = ajpa.findActividad(nombreActividad);
        return act;
    }
    public boolean salidaExiste(String nombre) {
        List<Salida> lus=sjpa.findSalidaEntities();
        boolean existe=false;
        for(Salida salida:lus) {
           if(salida.getNom().equals(nombre)){
               existe=true;
           }
        }
        return existe;  
    }

    public ArrayList<Salida> getSalidas() {
        List<Salida> listita=sjpa.findSalidaEntities();
        ArrayList<Salida> retorno=new ArrayList<Salida>(listita);
        return retorno;
    }
       public void altaPaquete(Paquete p){
        try {
            pjpa.create(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean existePaq(String nom){
        List<Paquete> lpaq= pjpa.findPaqueteEntities();
        boolean existe=false;
        Iterator<Paquete> itr=lpaq.iterator();
        while(itr.hasNext()){
            if(nom.equals(itr.next().getNom())){
                existe=true;
            }
        }
        return existe;
    }
    
    public ArrayList<DTPaquete> listarPaquetes(){
        List<Paquete> lpaq= pjpa.findPaqueteEntities();
        ArrayList<DTPaquete> lista=new ArrayList<DTPaquete>();
        for(Paquete p:lpaq){
            lista.add(p.getData());
        }
        return lista;
        
    }
    
    public void agregarActPaq(Paquete p){
        try {
            pjpa.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Actividad> listarActividades(){
        List<Actividad> lact=ajpa.findActividadEntities();
        return lact;
    }
    
    public Paquete getPaquete(String nom){
        Paquete p=pjpa.findPaquete(nom);
        return p;
    }
    
    public ArrayList<DTSalida> getSalidasActividad(String nombreActividad){
        Actividad act = ajpa.findActividad(nombreActividad);
        return act.getSalidas();
    }

    public ArrayList<DTActividad> getActividades() {
        List<Actividad> listita=ajpa.findActividadEntities();
        ArrayList<DTActividad> retorno=new ArrayList<DTActividad>();
        for(Actividad a:listita){
            retorno.add(a.getData());
        }
        return retorno;
    }
}

