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
