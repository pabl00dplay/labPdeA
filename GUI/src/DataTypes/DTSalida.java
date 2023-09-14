/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica.DataTypes;
import java.util.*;

/**
 *
 * @author pablo
 */
public class DTSalida {
    
    private Date fAlta,fecha;
    private String nombre, lugar, hora, actividad;
    private Integer capacidad;
    
    public DTSalida(Date fecha, Date fAlta,String nombre,String lugar, String hora,Integer capacidad, String actividad){
        this.fecha     = fecha;
        this.fAlta     = fAlta;
        this.nombre    = nombre;
        this.lugar     = lugar;
        this.hora      = hora;
        this.capacidad = capacidad;
        this.actividad = actividad;
    }
    
    public Date getfAlta() {
        return fAlta;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public String getHora() {
        return hora;
    }

    public Integer getCapacidad() {
        return capacidad;
    }
    
    
}
