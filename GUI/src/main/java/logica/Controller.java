package main.java.logica;

import DataTypes.DTActividad;
import DataTypes.DTPaquete;
import java.util.*;
import main.java.com.mycompany.paplicaciones.persistencia.ControladoraPersistencia;
import DataTypes.DTUsuario;
import javax.swing.JOptionPane;

public class Controller implements IController {
    ControladoraPersistencia contpersis= new  ControladoraPersistencia();
    private HashMap<String, Usuario> usr;
    private HashMap<String, Actividad> act;
    private HashMap<String, Paquete> paq;
    private HashMap<String, Departamento> dep;

    public Controller(){
        usr=new HashMap<String, Usuario>();
        act=new HashMap<String, Actividad>();
        paq=new HashMap<String, Paquete>();
        dep=new HashMap<String, Departamento>();
    }
    public HashMap<String, Usuario> getUsr(){
        return usr;
    }
    public HashMap<String, Actividad> getAct(){
        return act;
    }
    public HashMap<String, Paquete> getPaq(){
        return paq;
    }
    public HashMap<String, Departamento> getDep(){
        return dep;
    }

    public void AltaPaquete(DTPaquete dt){
        Paquete p=new Paquete(dt.getNom(),dt.getDesc(),dt.getDescu(),dt.getVal(), dt.getFalta());
        getPaq().put(dt.getNom(), p);
    }
    public boolean existePaq(String s){
        return getPaq().containsKey(s);
    }
    //AltaActividad
    public void altaActividadTuristica(DTActividad da){
        Departamento departamento = contpersis.getDepartamento(da.getDepartamento());
        Actividad acttividad = new Actividad(da.getNombre(),da.getDescripcion(),departamento,da.getCiudad(),da.getDuracion(),da.getCostoXturista(),da.getfAlta());
        departamento.setActividades(acttividad);
        contpersis.altaActividadTuristica(acttividad);
    }
    //Alta Usuario
    public void altaTurista(DTUsuario dt){
        Usuario t=new Usuario(dt,1);
        contpersis.altaTurista(t);
    }
    public void altaProveedor(DTUsuario dp){
        Usuario p=new Usuario(dp,0);
        contpersis.altaProveedor(p);
    }
     public DTUsuario getUsuario(String nickname){
         Date fnac= new Date(2022,9,31);
         DTUsuario dt=new DTUsuario("nic","nom","ape","mail",fnac,"desc","sitio");
        return dt;
    };
    public boolean nickExiste(String nic){
        return contpersis.nicExiste(nic);
    };
    public boolean mailExiste(String correo){

        return contpersis.mailExiste(correo);
    };
    public ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> retorno=contpersis.getUsuarios();
        return retorno;
    }
    public ArrayList<String> listarsalidasinscriptasTurista(String nickname){
        return new ArrayList();
    };
    public ArrayList<String> listarActividadesProveedor(String nickname){
        return new ArrayList();
    }; 
    public ArrayList<String> listarsalidasProveedor(String nickname){
        return new ArrayList();
    };   

    public ArrayList<Departamento> getDepartamentos() {
        return contpersis.getDepartamentos();
    }
    public boolean actividadExiste(String nombreActividad){
        return contpersis.actividadExiste(nombreActividad);
    }
    public boolean existeDepartamento(String nombreDepartamento){
        return contpersis.existeDepartamento(nombreDepartamento);
    }
    public void altaDepartamento(String depto, String descripcion, String url){
        Departamento d=new Departamento(depto,descripcion,url);
        contpersis.altaDepartamento(d);
    };
    public ArrayList<DTActividad>listarActividadesDepartamento(String nombreDepartamrnto){
    return contpersis.listarActividadesDepartamento(nombreDepartamrnto);
    }
    public DTActividad getActividad(String nombreActividad){
        return contpersis.getActividad(nombreActividad);
    }
        public void altaSalida(DTSalida dt){
            Salida s=new Salida(dt);
            contpersis.altaSalida(s);
        }
        
    public boolean salidaExiste(String s){
        return contpersis.salidaExiste(s);
    }
}
