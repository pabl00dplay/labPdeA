/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import java.util.*;

/**
 *
 * @author francisco
 */
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
        
        public HashSet<String> listarPaquetes(){
            HashSet<String> llave = new HashSet<String>();
            for(String key:getPaq().keySet()){
                llave.add(key);
            }
            return llave;
        }
        
        public DTPaquete listarDatosPaquete(String nomPaq){
            Paquete paq=getPaq().get(nomPaq);
            DTPaquete dtp = new DTPaquete(paq.getNom(),paq.getDesc(),paq.getDescu(),paq.getVal(),paq.getFAlta());
            return dtp;
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
    
    
}
