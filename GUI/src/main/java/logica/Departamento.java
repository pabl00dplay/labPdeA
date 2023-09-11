
package main.java.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departamento implements Serializable {
    @Id
    private String nom;
    @Basic
    private String descripcion,url;

    public Departamento() {
    }

    public Departamento(String nom, String descripcion, String url) {
        this.nom = nom;
        this.descripcion = descripcion;
        this.url = url;
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
    
}
