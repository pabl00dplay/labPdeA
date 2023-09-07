
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
            getPaq().put(p.getNom(), p);
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
        public void AltaActividadTuristica(String nombreProveedor,String nombreActividad,String descripcion,Integer duracion,Integer costo,String ciudad,LocalDate fAlta, Departamento depto){
            Actividad nuevaAct = new Actividad(nombreActividad,descripcion,ciudad,depto,duracion,costo,fAlta);
            act.put(nombreActividad, nuevaAct);
        }
      
        public void AltaSalida(DTSalida dt,String nombreActividad){
            Salida salida = new Salida(dt.getNom(),dt.getMaxTuristas(),dt.getDuracion(),dt.getFAlta(),dt.getLugat());
        }
        public DTSalida ListarDatosSalida(String nombreActividad){
            LocalDate fecha = LocalDate.of(2023, 9, 3);
            return new DTSalida("",0,0,fecha,"");
        }
        public ArrayList<String> ListarSalidasVigentesActividad(String nombreActividad){
            return new ArrayList();
        };
        public ArrayList<String> ListarTuristas(){
            return new ArrayList();
        };   
        
        public Boolean ChequearCapacidad(String nombreSalida,Integer cantidadTuristas){
            return false;
        }
        public Boolean ChequearInscripto(String nombreSalida,String nick){
            return false;
        }
        public void InscripcionSalida(DTInscripcion dt,String nombreActividad){
            Inscripcion inscripcion = new Inscripcion(dt.getFecha(),dt.getCant(),dt.getCosto(),dt.getTur(),dt.getSal());
        }
        
        public String[] listarPaquetes(){
            String llave[]=new String[getPaq().keySet().size()];
            int x=0;
            for(String s:getPaq().keySet()){
                llave[x++]=s;
            }
            return llave;
        }
        
        public DTPaquete listarDatosPaquete(String nomPaq){
            Paquete p=getPaq().get(nomPaq);
            return new DTPaquete(p.getNom(),p.getDesc(),p.getDescu(),p.getVal(),p.getFAlta());
        }
        
        public HashSet<String> listarActividadespaquete(String nomPaq){
            HashSet<String> llave = new HashSet<String>();
            Paquete vpaq=getPaq().get(nomPaq);
            for(Actividad vact:vpaq.getActs()){
                llave.add(vact.getNom());
            }
            return llave;
        }
        
        public HashSet<String> listarActividadesFueraPaq(String nomPaq, String nomDpto){
            HashSet<String> lista = listarActividadespaquete(nomPaq);
            HashSet<String> llave = new HashSet<String>();
            HashMap<String, Actividad> aux=getAct();
            boolean existe;
            for(String key:aux.keySet()){
                existe=false;
                for(String v:lista){
                    if((v==key)){
                        existe=true;
                    }
                }
                if((!existe)&&(aux.get(key).getDept().equals(nomDpto))){
                    llave.add(key);
                }
            }
            return llave;
        }
        
        public void agregarActPaq(String nomPaq, String nomAct){
            Paquete p=getPaq().get(nomPaq);
            Actividad a=getAct().get(nomAct);
            p.getActs().add(a);
        }
        public void altaDepto(Departamento nuevoDepto){
            getDep().put(nuevoDepto.getNom(), nuevoDepto);//Agrego el nuevo depto a la col
    
        }
        public boolean existeDepto(String nombre){
            if (getDep().containsKey(nombre)){//si la col tiene un depto con nombre igual
                return false;
            }else {
                return true; //si no existe uno igual, verdadero
            }
        }
    
}
