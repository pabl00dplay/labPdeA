package main.java.logica;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
public class Inscripcion implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    private Integer cant,costo;
    @ManyToOne
    private Usuario tur;
    @ManyToOne
    private Salida sal;

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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCant() {
        return cant;
    }

    public void setCant(Integer cant) {
        this.cant = cant;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Usuario getTur() {
        return tur;
    }

    public void setTur(Usuario tur) {
        this.tur = tur;
    }

    public Salida getSal() {
        return sal;
    }

    public void setSal(Salida sal) {
        this.sal = sal;
    }

    public Inscripcion(Date fecha, Integer cant, Integer costo) {
        this.fecha = fecha;
        this.cant = cant;
        this.costo = costo;
    }
}
