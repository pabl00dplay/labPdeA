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
            getPaq().put(dt.getNom(), p);
        }
        public boolean existePaq(String s){
            if(getPaq().containsKey(s)){
                return true;
            }else{
                return false;
            }
        }
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

}
