/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import DataTypes.DTProveedor;
import java.util.HashSet;

/**
 *
 * @author francisco
 */
public class Proveedor extends Usuario {
    private String desc,web;
    private HashSet<Actividad> acts;
    
    public Proveedor(String nic, String nom, String ape, String mail, String d, String sitio){
        super(nic,nom,ape,mail);
        this.desc=d;
        this.web=sitio;
        this.acts=new HashSet<Actividad>();
    }
    
    //getters
    public String getWeb(){
        return web;
    }
    public String getDesc(){
        return desc;
    }
    
    //setters
    public void setWeb(String s){
        this.web=s;
    }
    public void setDesc(String s){
        this.desc=s;
    }

    public String getNom() {
        return nom;
    }
    public DTProveedor getData(){
        DTProveedor DT= new DTProveedor();
        DT.setNombre(this.nom);
        return DT;
    }
}
