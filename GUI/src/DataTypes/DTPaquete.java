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
    private int Pvalidez;
    private float descuento;
    private Date fAlta;
    
    public DTPaquete(String n, String d, float de, int v, Date f){
        this.nom=n;
        this.desc=d;
        this.descuento=de;
        this.Pvalidez=v;
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
    
}
