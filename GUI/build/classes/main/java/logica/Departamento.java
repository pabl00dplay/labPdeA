
package main.java.logica;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Departamento implements Serializable {
    @Id
    private String nom;
    @Basic
    private String descripcion,url;
    @OneToMany
    private List<Actividad>actividades;
    public Departamento() {
    }

    public Departamento(String nom, String descripcion, String url) {
        this.nom = nom;
        this.descripcion = descripcion;
        this.url = url;
        this.actividades = new ArrayList<Actividad>();
    }
    
    //getters
    public String getNom(){
        return nom;
    }
    public String getDesc(){
        return descripcion;
    }
    public String getUrl(){
        return url;
    }
    //setters
    public void setNom(String s){
        nom=s;
    }
    public void setDesc(String s){
        descripcion=s;
    }
    public void setUrl(String s){
        url=s;
    }
    public void setActividades(Actividad actividad) {
        actividades.add(actividad);
    }
    public ArrayList<DTActividad> getActividades(){
        ArrayList<DTActividad> dtActividades = new ArrayList<DTActividad>();
        for(Actividad act:actividades) {
               dtActividades.add(act.getData());
           }
        return dtActividades;
    }
    public DTDepartamento getData(){
        ArrayList<String> nombresActividades = new ArrayList<String>();
        for(Actividad a:actividades){
            nombresActividades.add(a.getNom());
        }
        DTDepartamento dt = new DTDepartamento(this.nom,this.descripcion,this.url,nombresActividades);
        return dt;
    }

}
