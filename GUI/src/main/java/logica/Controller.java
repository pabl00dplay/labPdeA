
package main.java.logica;

import DataTypes.DTActividad;
import DataTypes.DTProveedor;
import java.time.LocalDate;
import java.util.*;

//SINGLETON
public class Controller implements IController {
	private HashMap<String, Usuario> usr;
	private HashMap<String, Actividad> act;
        private HashMap<String, Paquete> paq;
        private HashMap<String, Departamento> dep;
        private static Controller instance=null;
        private Controller(){
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
        public static Controller getInstance(){
            if(instance==null)
            {
                instance=new Controller();
                return instance;
            }
           return instance;
        }
        public void AltaPaquete(DTPaquete dt){
            Paquete p=new Paquete(dt.getNom(),dt.getDesc(),dt.getDescu(),dt.getVal(), dt.getFalta());
            getPaq().put(dt.getNom(), p);
        }
        public boolean existePaq(String s){
            if(getPaq().containsKey(s)){
                return true;
            }else{
                return false;
            }
        }   
        public  HashMap<String,DTProveedor> listarProveedores(){
            HashMap<String,DTProveedor> dataTypeMap = new HashMap();
            for(HashMap.Entry<String,Usuario> entry : usr.entrySet()){
                String nombre = entry.getKey();
                Usuario usuario = entry.getValue();
                if(usuario instanceof Proveedor){
                    dataTypeMap.put(nombre,((Proveedor) usuario).getData());
                }
            }
            return dataTypeMap;
        } 
        public DTActividad listarDatosActividad(String nombreActividad){
            if(act.containsKey(nombreActividad)){
                Actividad actividad = act.get(nombreActividad);
                return actividad.getData();
            }
            else{
                return null;
            }
        }
        public Set<String> listarDepartamentos(){
            Set<String> nombresDepartamentos= new HashSet<>();
            for(HashMap.Entry<String,Departamento> entry : dep.entrySet()){
                String nombre = entry.getKey();
                Departamento depto = entry.getValue();
                nombresDepartamentos.add(nombre);
            }
            return nombresDepartamentos;
        }
        public Boolean nombreActividadExiste(String nombreActividad){
            return act.containsKey(nombreActividad);
        }
        public void AltaActividadTuristica(String nombreProveedor,String nombreActividad,String descripcion,Integer duracion,Integer costo,String ciudad,LocalDate fAlta){
            Actividad nuevaAct = new Actividad(nombreProveedor,ciudad,de);
        }
    
        Actividad(String nom, String desc, String ciudad, Departamento dept, Integer dur, Integer costo, LocalDate Alta)
    
}
