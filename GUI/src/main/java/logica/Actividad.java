/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import DataTypes.DTActividad;
import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author francisco
 */
@Entity
public class Actividad implements Serializable {
    @Id
    private String nom;
    private String descripcion,ciudad;
    private String dep;
    //@ManyToOne
    //private Departamento dep;
    private Integer dur,costo;
    @Temporal(TemporalType.DATE)
    private Date fAlta;
    
    //private HashMap<String,Salida> salidas;
    public Actividad(){
    }
    public Actividad(String n, String des,String depto, String ciu ,Integer du,Integer costo,Date fAlta){
        this.ciudad=ciu;
        this.costo=costo;
        this.dep=depto;
        this.descripcion=des;
        this.dur=du;
        this.nom=n;
        this.fAlta=fAlta;
      //  salidas=new HashMap<String,Salida>();
    }
    public Actividad(DTActividad da){
        this.ciudad=da.getCiudad();
        this.costo=da.getCostoXturista();
        this.dep=da.getDepartamento();
        this.descripcion=da.getDescripcion();
        this.dur=da.getDuracion();
        this.nom=da.getNombre();
        this.fAlta=da.getfAlta();
      //  salidas=new HashMap<String,Salida>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public Integer getDur() {
        return dur;
    }

    public void setDur(Integer dur) {
        this.dur = dur;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Date getfAlta() {
        return fAlta;
    }

    public void setfAlta(Date fAlta) {
        this.fAlta = fAlta;
    }
  
}
