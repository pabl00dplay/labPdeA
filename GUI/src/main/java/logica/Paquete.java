/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import java.io.Serializable;
import java.lang.String;
import java.time.*;
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
    
    private String desc;
    private int Pvalidez;
    private float descuento;
    private Date fAlta;
    @ManyToMany
    private HashSet<Actividad> acts;
    
    public Paquete(String n, String d, float de, int v, Date f){
        this.nom=n;
        this.desc=d;
        this.descuento=de;
        this.Pvalidez=v;
        this.acts=new HashSet<Actividad>();
        this.fAlta=f;
    }
    
    //getters
    public String getNom(){
        return nom;
    }
    public String getDesc(){
        return desc;
    }
    public int getVal(){
        return Pvalidez;
    }
    public float getDescu(){
        return descuento;
    }
    public Date getFAlta(){
        return fAlta;
    }
    public HashSet<Actividad> getActs(){
        return acts;
    }
    
    //setters
    public void setNom(String s){
        this.nom=s;
    }
    public void setDesc(String s){
        this.desc=s;
    }
    public void setVal(int i){
        this.Pvalidez=i;
    }
    public void setDescu(float f){
        this.descuento=f;
    }
    public void setFAlta(Date f){
        this.fAlta=f;
    }
}
