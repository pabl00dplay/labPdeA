
package main.java.logica;

import DataTypes.DTActividad;
import java.lang.String;
import java.time.*;
import java.util.HashSet;
import java.util.HashMap;
import javax.persistence.*;

/**
 *
 * @author francisco
 */
@Entity
public class Actividad {
    @Id private String nom;
    private String desc,ciudad;
    private Departamento dept;
    private Integer dur,costo;
    private LocalDate Alta;
    private HashMap<String,Salida> salidas;

    public Actividad(String nom, String desc, String ciudad, Departamento dept, Integer dur, Integer costo, LocalDate Alta) {
        this.nom = nom;
        this.desc = desc;
        this.ciudad = ciudad;
        this.dept = dept;
        this.dur = dur;
        this.costo = costo;
        this.Alta = Alta;
        this.salidas = new HashMap<>();
    }
    //getter
    public String getNom(){
        return nom;
    }
    public String getDesc(){
        return desc;
    }
    public Departamento getDept(){
        return dept;
    }
    public String getCiudad(){
        return ciudad;
    }
    public Integer getDur(){
        return dur;
    }
    public Integer getCosto(){
        return costo;
    }
    public DTActividad getData(){
        DTActividad DT = new DTActividad(this.nom,this.desc,this.dur,this.costo,this.ciudad);
        return DT;
    }
}
