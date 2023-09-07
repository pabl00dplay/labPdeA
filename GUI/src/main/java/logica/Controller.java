package main.java.logica;

import main.java.logica.DataTypes.DTPaquete;
import java.util.*;
import main.java.com.mycompany.paplicaciones.persistencia.ControladoraPersistencia;
import main.java.logica.DataTypes.DTproveedor;
import main.java.logica.DataTypes.DTturista;
import main.java.logica.DataTypes.DTusuario;

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
            if(getPaq().containsKey(s)){
                return true;
            }else{
                return false;
            }
        }
        //Alta Usuario
        public void altaTurista(DTturista dt){
            Usuario t=new Usuario(dt);
            contpersis.altaTurista(t);
        }
        public void altaProveedor(DTproveedor dp){
            Usuario p=new Usuario(dp);
            contpersis.altaProveedor(p);
        }
         public DTusuario getUsuario(String nickname){
             Date fnac= new Date(2022,9,31);
             DTusuario dt=new DTproveedor("nic","nom","ape","mail",fnac,"desc","sitio");
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

}
