
package main.java.logica;

import DataTypes.*;
import java.time.LocalDate;
import java.util.*;
import main.java.persistencia.ControladoraPersistencia;

//SINGLETON
public class Controller implements IController {
    
        ControladoraPersistencia contpersis= new  ControladoraPersistencia();
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
            //getPaq().put(p.getNom(), p);
            contpersis.altaPaquete(p);
        }
        public boolean existePaq(String s){
            if(contpersis.existePaq(s)){
                return true;
            }else{
                return false;
            }
        }   
        public  HashMap<String,DTusuario> listarProveedores(){
            HashMap<String,DTusuario> dataTypeMap = new HashMap();
            for(HashMap.Entry<String,Usuario> entry : usr.entrySet()){
                String nombre = entry.getKey();
                Usuario usuario = entry.getValue();
                if(usuario instanceof Usuario){
                   // dataTypeMap.put(nombre,usuario.getData());
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
            return contpersis.listarPaquetes();
        }
        
        public DTPaquete listarDatosPaquete(String nomPaq){
            Paquete p=contpersis.getPaquete(nomPaq);
            return new DTPaquete(p.getNom(),p.getDesc(),p.getDescu(),p.getVal(),p.getFAlta());
        }
        
        public HashSet<String> listarActividadespaquete(String nomPaq){
            HashSet<String> llave = new HashSet<String>();
            Paquete vpaq=contpersis.getPaquete(nomPaq);
            for(Actividad vact:vpaq.getActs()){
                llave.add(vact.getNom());
            }
            return llave;
        }
        
        public HashSet<String> listarActividadesFueraPaq(String nomPaq, String nomDpto){
            HashSet<String> lista = listarActividadespaquete(nomPaq);
            HashSet<String> llave = new HashSet<String>();
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
                if((!existe)&&(itr.next().getDept().equals(nomDpto))){
                    llave.add(itr.next().getNom());
                }
            }
            return llave;
        }
        
        public void agregarActPaq(String nomPaq, String nomAct){
            Paquete p=contpersis.getPaquete(nomPaq);
            Actividad a=getAct().get(nomAct)/*contpersis.getActividad(nomAct)*/;
            p.getActs().add(a);
            contpersis.agregarActPaq(p);
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
    public void altaTurista(DTusuario dt){
         Usuario t=new Usuario(dt);
         contpersis.altaTurista(t);
    }
    
    public void altaProveedor(DTusuario dp){
        Usuario p=new Usuario(dp);
        contpersis.altaProveedor(p);
    }
    public boolean mailExiste(String mail){
        return false;
    }
    public boolean nickExiste(String nic){
        return false;
    }
}
