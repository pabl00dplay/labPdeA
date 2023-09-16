package main.java.logica;


import java.io.Serializable;
import java.time.*;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Inscripcion implements Serializable {
   @Temporal(TemporalType.DATE)
    @Id
    private Date fecha;
    @Id
    private int cant,costo;
   @ManyToOne
    private Usuario tur;
    @ManyToOne
    private Salida sal;

    public Inscripcion() {
    }

    public Inscripcion(Date fecha, int cant, int costo) {
        this.fecha = fecha;
        this.cant = cant;
        this.costo = costo;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getCant() {
        return cant;
    }

    public int getCosto() {
        return costo;
    }

    public Usuario getTur() {
        return tur;
    }

    public Salida getSal() {
        return sal;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setTur(Usuario tur) {
        this.tur = tur;
    }

    public void setSal(Salida sal) {
        this.sal = sal;
    }

   
}
