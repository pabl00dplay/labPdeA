package main.java.com.mycompany.paplicaciones.persistencia;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTPaquete;
import DataTypes.DTSalida;
import DataTypes.DTUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.java.logica.Actividad;
import main.java.logica.Departamento;
import main.java.logica.Usuario;

import main.java.com.mycompany.paplicaciones.persistencia.*;
import main.java.logica.Categoria;
import main.java.logica.Inscripcion;
import main.java.logica.Paquete;
import main.java.logica.Salida;

public class ControladoraPersistencia {
    SalidaJpaController sjpa=new SalidaJpaController();
    UsuarioJpaController ujpa=new UsuarioJpaController();
    ActividadJpaController ajpa=new ActividadJpaController();
    DepartamentoJpaController djpa=new DepartamentoJpaController();
    PaqueteJpaController pjpa=new PaqueteJpaController();
    InscripcionJpaController ijpa=new InscripcionJpaController();
    CategoriaJpaController cjpa=new CategoriaJpaController();
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
    public List<Usuario> getUsuariosList() {
       return ujpa.findUsuarioEntities();
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
        Usuario u = ujpa.findUsuario(nic);
        if(u==null){
            return false;
        }else{
            return true;
        }      
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
    
    public void altaActividadTuristica(Actividad act, String nom){
        try{
            Usuario u = ujpa.findUsuario(nom);
            u.setActividad(act);
            ajpa.create(act);
            djpa.edit(act.getDep());
            ujpa.edit(u);
        } catch(Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void altaCategoria(String categoria) {
        Categoria cat=new Categoria(categoria); 
        try {
            this.cjpa.create(cat);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean existeCategoria(String categoria) {
        Categoria cat=cjpa.findCategoria(categoria);
        if(cat==null){
            return false;
        }else{
            return true;
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
    public ArrayList<String> getCategorias(){
        List<Categoria> listaCategorias = cjpa.findCategoriaEntities();
        ArrayList<String> retorno=new ArrayList<>();
        for(Categoria c:listaCategorias){
            retorno.add(c.getNombre());
        }
        return retorno;
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
    
    public void agregarActPaq(Paquete p,String nombreActividad){
        try {
            pjpa.edit(p);
            ajpa.edit(p.getActividad(nombreActividad));
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
    public ArrayList<String> listarsalidasinscriptasTurista(String nickname) {
        Usuario u=ujpa.findUsuario(nickname);
        List<Inscripcion> inscripciones=null;
        inscripciones=u.getIns();
        ArrayList<String> retorno=new ArrayList<String>();
        for(Inscripcion i:inscripciones){
                retorno.add(i.getSal().getNom());
        } 
        return retorno;
    }; 
    public ArrayList<String> listarActividadesProveedor(String nickname) {
        Usuario u=ujpa.findUsuario(nickname);
        List<Actividad> actividades=u.getActividades();
        ArrayList<String> retorno=new ArrayList<String>();
        for(Actividad a :actividades){
            retorno.add(a.getNom());
        }
        return retorno;
    }

    public ArrayList<String> listarsalidasProveedor(String nickname) {
        Usuario u=ujpa.findUsuario(nickname);
        List<Actividad> actividades=u.getActividades();
        ArrayList<String> retorno=new ArrayList<String>();
        for(Actividad a :actividades){
            retorno.add("*");
            for(DTSalida s:a.getSalidas()){
                retorno.add(s.getNombre());
            }
        }
        return retorno;
    }
       public void altaInscripcion(Inscripcion i) {
        try {
            ijpa.create(i);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Usuario retornoUsuarioSelec(String nick){
            List<Usuario> us=ujpa.findUsuarioEntities();
            Usuario uSel = null;
            Iterator<Usuario> itr = us.iterator();
            for(Usuario u:us) {
                if(u.getNick().equals(nick)){
                    uSel = u;
                }
            }
        return uSel;      
    }
    public void editarUsuario (Usuario u){
        try {
            ujpa.edit(u); 
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    public void editarActividad(Actividad a){
        try {
            ajpa.edit(a);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Salida retornoSalidaSelec(String nombre){
            List<Salida> sal=sjpa.findSalidaEntities();
            Salida sSel = null;
            Iterator<Salida> itr = sal.iterator();
            for(Salida s:sal) {
                if(s.getNom().equals(nombre)){
                    sSel = s;
                }
            }
        return sSel;      
    }
     public ArrayList<Usuario> retornoTuristas(){////////////////////////////
            List<Usuario> us=ujpa.findUsuarioEntities();
            //reotrnar en arraylist los turistas
            ArrayList<Usuario> turistas=new ArrayList<Usuario>();
            for(Usuario u:us) {
                if(u.getEsTurista() == 1){//si es turista
                    turistas.add(u);//lista de turistas
                }
            }
        return turistas;      
    }

    public DTUsuario getUsuario(String nickname) {
        Usuario u = ujpa.findUsuario(nickname);
        if(u != null){
            
            if(u.getEsTurista()==1){
                DTUsuario dt = new DTUsuario(u.getNick(),u.getNom(),u.getApe(),u.getMail(),u.getFnac(),u.getNac(),u.getPass(),u.getImg());
                return dt;
            }
            else if(u.getEsTurista()==0){
                DTUsuario dt = new DTUsuario(u.getNick(),u.getNom(),u.getApe(),u.getMail(),u.getFnac(),u.getWeb(),u.getDescripcion(),u.getPass(),u.getImg());
                return dt;
            }else if(u.getEsTurista()==2){
                DTUsuario dt=new DTUsuario(u.getNick(),u.getNom(),u.getApe(),u.getMail(),u.getFnac(),u.getPass(),u.getImg());
                return dt;
            }
        }
        JOptionPane.showMessageDialog(null, "ESNULL");
        return null;
    }
    public void editarSalida (Salida s){
        try {
            sjpa.edit(s); 
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }


    public Actividad retornoActividadSelec(String nombre){
            List<Actividad> act=ajpa.findActividadEntities();
            Actividad actSel = null;
            Iterator<Actividad> itr = act.iterator();
            for(Actividad a:act) {
                if(a.getNom().equals(nombre)){
                    actSel = a;
                }
            }
        return actSel;      
    }
    public boolean turiExisteEnInscripcion(String nic, String nombreSal){
            List<Inscripcion> in=ijpa.findInscripcionEntities();
            boolean existe=false; //si no existe false
            Iterator<Inscripcion> itr = in.iterator();
            for(Inscripcion i:in) {
                Salida s = i.getSal();
                Usuario u = i.getTur();
               if(((s.getNom()).equals(nombreSal)) && ((u.getNick()).equals(nic))){
                   existe=true;//si ya esta registrado true
               }
            }
            return existe;      
        }

    public void altaVisitante(DTUsuario dv) {
        Usuario v=new Usuario(dv,2);
        try {
            ujpa.create(v);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

}

