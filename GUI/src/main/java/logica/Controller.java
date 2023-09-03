package main.java.logica;

import main.java.logica.DataTypes.DTPaquete;
import java.util.*;
import main.java.logica.DataTypes.DTproveedor;
import main.java.logica.DataTypes.DTturista;
import main.java.logica.DataTypes.DTusuario;

public class Controller implements IController {
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
            getPaq().put(p.getNom(), p);
        }
        public boolean existePaq(String s){
            if(getPaq().containsKey(s)){
                return true;
            }else{
                return false;
            }
        }
<<<<<<< HEAD
        //Alta Usuario
        public void altaTurista(DTturista dt){
            Usuario t=new Turista(dt.getNic(),dt.getNom(),dt.getApe(),dt.getMail(),dt.getFnac(),dt.getNacionalidad());
        
        }
        public void altaProveedor(DTproveedor dt){
            Usuario p=new Proveedor(dt.getNic(),dt.getNom(),dt.getApe(),dt.getMail(),dt.getFnac(),dt.getDesc(),dt.getSitio());;
        
        }
         public DTusuario getUsuario(String nickname){
             Date fnac= new Date(2022,9,31);
             DTusuario dt=new DTproveedor("nic","nom","ape","mail",fnac,"desc","sitio");
            return dt;
        };
        public boolean nickExiste(String nombre){
             
            return false;
        };
        public boolean mailExiste(String correo){
             
            return false;
        };
        public ArrayList<String> getUsuarios() {
            return new ArrayList();
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

        
        public HashSet<String> listarPaquetes(){
            HashSet<String> llave = new HashSet<String>();
            for(String key:getPaq().keySet()){
                llave.add(key);
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
                if((!existe)&&(aux.get(key).getDept().getNom().equals(nomDpto))){
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
=======
        public void altaDepto(Departamento nuevoDepto){
            getDep().put(nuevoDepto.getNom(), nuevoDepto);//Agrego el nuevo depto a la col
>>>>>>> madi
    
        }
        public boolean existeDepto(String nombre){
            if (getDep().containsKey(nombre)){//si la col tiene un depto con nombre igual
                return false;
            }else {
                return true; //si no existe uno igual, verdadero
            }
        }
    
}
