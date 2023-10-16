/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataTypes;
import java.util.*;

/**
 *
 * @author pablo
 */
public class DTSalida {
    
    private Date fAlta,fecha;
    private String nombre, lugar, hora, actividad;
    private Integer capacidad;
    
    public DTSalida(Date fecha, Date fAlta,String nombre,String lugar, String hora,Integer capacidad,String actividad){
        this.fecha     = fecha;
        this.fAlta     = fAlta;
        this.nombre    = nombre;
        this.lugar     = lugar;
        this.hora      = hora;
        this.capacidad = capacidad;
        this.actividad = actividad;
    }

    public String getActividad() {
        return actividad;
    }
    
    public DTSalida(){
        
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

    public void setfAlta(Date fAlta) {
        this.fAlta = fAlta;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
