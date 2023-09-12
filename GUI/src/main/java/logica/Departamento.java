
package main.java.logica;

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

    public List<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(Actividad actividad) {
        actividades.add(actividad);
    }
    

}
