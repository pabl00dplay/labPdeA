package main.java.logica;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
public class Inscripcion implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private int cant;
    Float costo;
    @ManyToOne
    private Usuario tur;
    @ManyToOne
    private Salida sal;

    public Inscripcion(Date fecha, int cant, float costo) {
        
        this.fecha = fecha;
        this.cant = cant;
        this.costo = costo;
    }

    public Inscripcion() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public int getCant() {
        return cant;
    }

    public Float getCosto() {
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

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public void setTur(Usuario tur) {
        this.tur = tur;
    }

    public void setSal(Salida sal) {
        this.sal = sal;
    }
}

