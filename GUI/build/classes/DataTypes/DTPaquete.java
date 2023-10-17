/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;

import java.time.*;
import java.util.*;

/**
 *
 * @author francisco
 */
public class DTPaquete {
    private String nom, desc;
    private Integer Pvalidez;
    private float costoXturista;
    private float descuento;
    private Date fAlta;
    private boolean comprado;
    public DTPaquete(String n, String d, float de, Integer v, Date f, float costo){
        this.nom=n;
        this.desc=d;
        this.descuento=de;
        this.Pvalidez=v;
        this.fAlta=f;
        this.costoXturista=costo;
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
        return desc;
    }
    public Integer getVal(){
        return Pvalidez;
    }
    public float getDescu(){
        return descuento;
    }
    public Date getFalta(){
        return fAlta;
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
    public void setFalta(Date f){
        this.fAlta=f;
    }

    public float getCostoXturista() {
        return costoXturista;
    }

    public void setCostoXturista(float costoXturista) {
        this.costoXturista = costoXturista;
    }
    
    
}