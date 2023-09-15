/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import DataTypes.DTSalida;
import java.io.Serializable;
import java.lang.String;
import java.time.*;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 
@author francisco*/
@Entity
public class Salida implements Serializable {
    @Id
    private String nom;
    private String lugar,hora;
    private Integer maxTuris, dur;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Temporal(TemporalType.DATE)
    private Date fAlta;
    private Actividad act;

    public Salida() {
    }
    public Salida(DTSalida dt){
        this.nom=dt.getNombre();
        this.fecha=dt.getFecha();
        this.fAlta=dt.getfAlta();
        this.lugar=dt.getLugar();
        this.maxTuris=dt.getCapacidad();
        this.hora=dt.getHora();
        
    }
    public Salida(String n, int cant, int d,Date f,Date fa, String l, String hora){
        this.nom=n;
        this.lugar=l;
        this.maxTuris=cant;
        this.dur=d;
        this.fecha=f;
        this.fAlta=fa;
        this.hora = hora;
    }

    //getters
    
    public String getNom(){
        return nom;
    }
    public String getHora(){
        return hora;
    }
    public String getLugat(){
        return lugar;
    }
    public Integer getMaxTuristas(){
        return maxTuris;
    }
    public Integer getDuracion(){
        return dur;
    }
    public Date getFecha(){
        return fecha;
    }
    public Date getFAlta(){
        return fAlta;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
    public void setFecha(Date f){
        this.fecha=f;
    }

    DTSalida getData() {
        DTSalida dt= new DTSalida();
        dt.setNombre(this.nom); 
        dt.setActividad(this.lugar);
        dt.setFecha(this.fecha);
        dt.setHora(nom);
        dt.setCapacidad(this.maxTuris);
        dt.setCapacidad(this.maxTuris);
        return dt;
    }

 }
