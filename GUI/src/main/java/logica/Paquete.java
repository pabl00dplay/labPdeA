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

/**
 *
 * @author francisco
 */
@Entity
public class Paquete implements Serializable {
    @Id
    private String nom;
    
    private String descripcion;
    private Integer Pvalidez;
    private float descuento;
    @Temporal(TemporalType.DATE)
    private Date fAlta;
    @ManyToMany(mappedBy="paquetes")
    private List<Actividad> acts;
    
    public Paquete(String n, String d, float de, Integer v, Date f){
        this.nom=n;
        this.descripcion=d;
        this.descuento=de;
        this.Pvalidez=v;
        this.acts=new ArrayList<Actividad>();
        this.fAlta=f;
    }
    
    //getters
    public String getNom(){
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
    public ArrayList<DTActividad> getActs(){
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
        return new DTPaquete(this.nom,this.descripcion,this.descuento,this.Pvalidez,this.fAlta);
    }
}
