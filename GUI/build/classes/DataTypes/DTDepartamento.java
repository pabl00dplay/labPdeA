
package DataTypes;

import java.util.ArrayList;

public class DTDepartamento {
    

    private String nom;
    private String descripcion,url;
    private ArrayList<String>actividades;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<String> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<String> actividades) {
        this.actividades = actividades;
    }

    public DTDepartamento(String nom, String descripcion, String url, ArrayList<String> actividades) {
        this.nom = nom;
        this.descripcion = descripcion;
        this.url = url;
        this.actividades = actividades;
    }
    
    
}