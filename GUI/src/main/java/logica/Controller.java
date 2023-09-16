package main.java.logica;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTPaquete;
import DataTypes.DTSalida;
import java.util.*;
import main.java.com.mycompany.paplicaciones.persistencia.ControladoraPersistencia;
import DataTypes.DTUsuario;

public class Controller implements IController {
    ControladoraPersistencia contpersis= new  ControladoraPersistencia();
    
    //AltaActividad
    public void altaActividadTuristica(DTActividad da){
        Departamento departamento = contpersis.getDepartamento(da.getDepartamento());
        Actividad acttividad = new Actividad(da.getNombre(),da.getDescripcion(),departamento,da.getCiudad(),da.getDuracion(),da.getCostoXturista(),da.getfAlta());
        departamento.setActividades(acttividad);
        contpersis.altaActividadTuristica(acttividad);
    }
    //AltaSalida
    public void altaSalida(DTSalida dt){
        Actividad act = contpersis.getActividad(dt.getActividad());
        Salida s=new Salida(dt.getNombre(),dt.getCapacidad(),dt.getFecha(),dt.getfAlta(),dt.getLugar(),dt.getHora(),act);
        act.setSalidas(s);
        contpersis.altaSalida(s);
    }
    //Alta Usuario
    public void altaTurista(DTUsuario dt){
        Usuario t=new Usuario(dt,1);
        contpersis.altaTurista(t);
    }
    //Alta Proveedor
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

    public ArrayList<DTDepartamento> getDepartamentos() {
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
        return contpersis.getActividad(nombreActividad).getData();
    }
    public boolean salidaExiste(String s){
        return contpersis.salidaExiste(s);
    }
    
    public  ArrayList<DTSalida> getSalidas(){
        ArrayList<Salida> salidas=contpersis.getSalidas();
        
        ArrayList<DTSalida> retorno = new ArrayList<DTSalida>(); 
        for (Salida s : salidas){
            retorno.add( s.getData());
        }
        return retorno;
    }
    public void AltaPaquete(DTPaquete dt){
            Paquete p=new Paquete(dt.getNom(),dt.getDesc(),dt.getDescu(),dt.getVal(), dt.getFalta());
            contpersis.altaPaquete(p);
        }
        public boolean existePaq(String s){
            if(contpersis.existePaq(s)){
                return true;
            }else{
                return false;
            }
        }
        
        public ArrayList<DTPaquete> listarPaquetes(){
            return contpersis.listarPaquetes();
        }
        
        public DTPaquete listarDatosPaquete(String nomPaq){
            Paquete p=contpersis.getPaquete(nomPaq);
            return new DTPaquete(p.getNom(),p.getDesc(),p.getDescu(),p.getVal(),p.getFAlta());
        }
        
        public ArrayList<String> listarActividadespaquete(String nomPaq){
            ArrayList<String> llave = new ArrayList<String>();
            Paquete vpaq=contpersis.getPaquete(nomPaq);
            for(DTActividad vact:vpaq.getActs()){
                llave.add(vact.getNombre());
            }
            return llave;
        }
        
        public ArrayList<String> listarActividadesFueraPaq(String nomPaq, String nomDpto){
            ArrayList<String> lista = listarActividadespaquete(nomPaq);
            ArrayList<String> llave = new ArrayList<String>();
            List<Actividad> aux=contpersis.listarActividades();
            Iterator<Actividad> itr=aux.iterator();
            boolean existe;
            while(itr.hasNext()){
                existe=false;
                for(String v:lista){
                    if((v==itr.next().getNom())){
                        existe=true;
                    }
                }
                if((!existe)&&(itr.next().getDep().getNom().equals(nomDpto))){
                    llave.add(itr.next().getNom());
                }
            }
            return llave;
        }
        
        public void agregarActPaq(String nomPaq, String nomAct){
            Paquete p=contpersis.getPaquete(nomPaq);
            Actividad a=contpersis.getActividad(nomAct);
            p.setAct(a);
            a.setPaquete(p);
            contpersis.agregarActPaq(p,a);
        }

        public ArrayList<DTSalida> getSalidasActividad(String nombreActividad){
        return contpersis.getSalidasActividad(nombreActividad);
        }
        
      public ArrayList<DTActividad> getActividades(){
          return contpersis.getActividades();
                  
      }
}
