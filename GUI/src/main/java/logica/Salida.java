/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import java.io.Serializable;
import java.lang.String;
import java.time.*;
import java.util.Date;
import javax.persistence.*;
import main.java.logica.DataTypes.DTSalida;

/**
 *
 * @author francisco
 */
    @Entity 
public class Salida implements Serializable {
        
    @Id
    private String nombre;
    
    private String  lugar;
    private int maxTuris;
    private Date fecha,fAlta;
    
    public Salida(String nombre, int capacidad, int d, Date fecha, String l){
        this.nombre=nombre;
        this.lugar=l;
        this.maxTuris=capacidad;
        this.fecha=fecha;
    }
    public Salida(DTSalida dt){
        this.nombre=dt.getNombre();
        this.fecha=dt.getFecha();
        this.fAlta=dt.getfAlta();
        this.lugar=dt.getLugar();
        this.maxTuris=dt.getCapacidad();
    }

    public Salida() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public int getMaxTuris() {
        return maxTuris;
    }

    public Date getFecha() {
        return fecha;
    }

    public Date getfAlta() {
        return fAlta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setMaxTuris(int maxTuris) {
        this.maxTuris = maxTuris;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setfAlta(Date fAlta) {
        this.fAlta = fAlta;
    }
    
    
    
 }
