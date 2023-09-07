/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import java.io.Serializable;
import java.lang.String;
import java.time.*;
import javax.persistence.*;

/**
 *
 * //@author francisco
 */
//@Entity
public class Salida implements Serializable {
    
    //@Id
    private String nom;
    
    private String lugar;
    private int maxTuris, dur;
    private LocalDate fecha,fAlta;
    //@ManyToOne
    private Actividad act;
    
    public Salida(String n, int cant, int d, LocalDate f, String l){
        this.nom=n;
        this.lugar=l;
        this.maxTuris=cant;
        this.dur=d;
        this.fecha=f;
    }
    
    //getters
    public String getNom(){
        return nom;
    }
    public String getLugat(){
        return lugar;
    }
    public int getMaxTuristas(){
        return maxTuris;
    }
    public int getDuracion(){
        return dur;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public LocalDate getFAlta(){
        return fAlta;
    }
    
    //setters
    public void setNom(String s){
        this.nom=s;
    }
    public void setLugar(String s){
        this.lugar=s;
    }
    public void setTuristas(int i){
        this.maxTuris=i;
    }
    public void setDur(int i){
        this.dur=i;
    }
    public void setFecha(LocalDate f){
        this.fecha=f;
    }
    
 }
