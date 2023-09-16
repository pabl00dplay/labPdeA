/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import DataTypes.DTActividad;
import DataTypes.DTSalida;
import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    
    @ManyToOne
    private Departamento dep;
    private Integer dur,costo;
    @Temporal(TemporalType.DATE)
    private Date fAlta;
    @OneToMany
    private List<Salida> salidas;
    @ManyToMany
    private List<Paquete>paquetes;
    public Actividad(){
    
    }
    public Actividad(String n, String des,Departamento dep, String ciu ,Integer du,Integer costo,Date fAlta){
        this.ciudad=ciu;
        this.costo=costo;
        this.dep=dep;
        this.descripcion=des;
        this.dur=du;
        this.nom=n;
        this.fAlta=fAlta;
        this.salidas=new ArrayList<Salida>();
        this.paquetes= new ArrayList<Paquete>();
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

    public Departamento getDep() {
        return dep;
    }

    public void setDep(Departamento dep) {
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
    public void setSalidas(Salida s) {
        this.salidas.add(s);
    }
    
    public DTActividad getData(){
        DTActividad dt = new DTActividad();
        dt.setNombre(this.nom);
        dt.setDepartamento(this.dep.getNom());
        dt.setDescripcion(this.descripcion);
        dt.setDuracion(this.dur);
        dt.setCostoXturista(this.costo);
        dt.setCiudad(this.ciudad);
        dt.setfAlta(this.fAlta);
        return dt;
    }
    public ArrayList<DTSalida>getSalidas(){
        ArrayList<DTSalida> retorno = new ArrayList<DTSalida>();
        for(Salida s:salidas){
            retorno.add(s.getData());
        }
        return retorno;
    }
}
