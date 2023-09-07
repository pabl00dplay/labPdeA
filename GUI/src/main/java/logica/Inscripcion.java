
package main.java.logica;


import java.io.Serializable;
import java.time.*;
import javax.persistence.*;

/**
 *
 * //@author francisco
 */
//@Entity
//@IdClass(InscripcionKey.class)

public class Inscripcion implements Serializable {
    
    //@Id 
    private LocalDate fecha;
    //@Id 
    private String tur;
    //@Id 
    private String sal;
    
    private int cant,costo;
    
    public Inscripcion(LocalDate fecha, int cant, int costo, Usuario tur, Salida sal){
        this.fecha=fecha;
        this.cant=cant;
        this.costo=costo;
        this.tur=tur.getNick();
        this.sal=sal.getNom();
    }
    //getters
    public LocalDate getFecha(){
        return fecha;
    }
    public int getCant(){
        return cant;
    }
    public int getCosto(){
        return costo;
    }
    public String getTur(){
        return tur;
    }
    public String getSal(){
        return sal;
    }
}


