/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import java.lang.String;
import java.time.*;
import java.util.HashSet;
import java.util.HashMap;

/**
 *
 * @author francisco
 */
public class Actividad {
    private String nom,desc,ciudad;
    private Departamento dept;
    private int dur,costo;
    private LocalDate fAlta;
    private HashMap<String,Salida> salidas;
    
    public Actividad(String n, String des, Departamento dep ,String ciu ,int du,int c){
        this.ciudad=ciu;
        this.costo=c;
        this.dept=dep;
        this.desc=des;
        this.dur=du;
        this.nom=n;
        salidas=new HashMap<String,Salida>();
    }
    
    //getter
    public String getNom(){
        return nom;
    }
    public String getDesc(){
        return desc;
    }
    public Departamento getDept(){
        return dept;
    }
    public String getCiudad(){
        return ciudad;
    }
    public int getDur(){
        return dur;
    }
    public int getCosto(){
        return costo;
    }
    
    //setter
    public void setNom(String s){
        this.nom=s;
    }
    public void setDesc(String s){
        this.desc=s;
    }
    public void setCiudad(String s){
        this.ciudad=s;
    }
    public void setDept(Departamento s){
        this.dept=s;
    }
    public void setDur(int i){
        this.dur=i;
    }
    public void setCosto(int i){
        this.costo=i;
    }
}
