/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import DataTypes.DTActividad;
import DataTypes.DTPaquete;
import java.io.Serializable;
import java.lang.String;
import java.util.*;
import javax.persistence.*;

@Entity
public class Paquete implements Serializable {
    @Id
    private String nom;
    
    private String descripcion;
    private Integer Pvalidez;
    private float costoXturista;
    private float descuento;
    @Temporal(TemporalType.DATE)
    private Date fAlta;
    @ManyToMany(mappedBy="paquetes")
    private List<Actividad> acts;
    private boolean comprado;
    
    public Paquete(String n, String d, float de, Integer v, Date f){
        this.nom=n;
        this.descripcion=d;
        this.descuento=de;
        this.Pvalidez=v;
        this.acts=new ArrayList<Actividad>();
        this.fAlta=f;
        this.costoXturista=0;
        this.comprado=false;
    }
    
    public boolean isComprado(){
        return comprado;
    }

    //getters
    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public String getNom() {
        return nom;
    }
    public String getDesc(){
        return descripcion;
    }
    public Integer getVal(){
        return Pvalidez;
    }
    public float getDescu(){
        return descuento;
    }
    public Date getFAlta(){
        return fAlta;
    }
    public ArrayList<DTActividad> getDataActs(){
        ArrayList<DTActividad> retorno = new ArrayList<DTActividad>();
        for(Actividad a:acts){
            retorno.add(a.getData());
        }
        return retorno;
    }
    public Paquete(){
        
    }

    public void setAct(Actividad a) {
        this.acts.add(a);
        this.costoXturista=this.costoXturista+(a.getCosto()*(1-(this.costoXturista/100)));
    }
    
    //setters
    public void setNom(String s){
        this.nom=s;
    }
    public void setDesc(String s){
        this.descripcion=s;
    }
    public void setVal(Integer i){
        this.Pvalidez=i;
    }
    public void setDescu(float f){
        this.descuento=f;
    }
    public void setFAlta(Date f){
        this.fAlta=f;
    }
    public DTPaquete getData(){
        return new DTPaquete(this.nom,this.descripcion,this.descuento,this.Pvalidez,this.fAlta,this.costoXturista);
    }

    public Actividad getActividad(String nombreActividad) {
        Actividad retorno = new Actividad();
        for(Actividad a:acts){
            if(a.getNom().equals(nombreActividad)){
                retorno = a;
            }
        }
        return retorno;
    }

    public void setActs(List<Actividad> acts) {
        this.acts = acts;
    }

    public List<Actividad> getActs() {
        return acts;
    }

    public float getCostoXturista() {
        return costoXturista;
    }

    public void setCostoXturista(Integer costoXturista) {
        this.costoXturista = costoXturista;
    }
    
    
    
}
