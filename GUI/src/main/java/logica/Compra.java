/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;


import DataTypes.DTCompra;
import java.io.Serializable;
import java.time.*;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Compra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    
    @Temporal(TemporalType.DATE)
    private Date fecha,venc;
    @Basic
    private int cantidadTuristas;
    private float cosTotal;
    @ManyToOne
    private Usuario tur;
    @OneToOne
    private Paquete paq;

    public Compra() {
    }

    public Compra(Date fecha, Date venc, float cosTotal, int cantidadTuristas, Usuario tur, Paquete paq) {
        this.fecha = fecha;
        this.venc = venc;
        this.cosTotal = cosTotal;
        this.cantidadTuristas = cantidadTuristas;
        this.tur = tur;
        this.paq = paq;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getVenc() {
        return venc;
    }

    public void setVenc(Date venc) {
        this.venc = venc;
    }

    public float getCosTot() {
        return cosTotal;
    }

    public void setCosTot(float cosTot) {
        this.cosTotal = cosTotal;
    }

    public int getCant() {
        return cantidadTuristas;
    }

    public void setCant(int cant) {
        this.cantidadTuristas = cant;
    }

    public Usuario getTur() {
        return tur;
    }

    public void setTur(Usuario tur) {
        this.tur = tur;
    }

    public Paquete getPaq() {
        return paq;
    }

    public void setPaq(Paquete paq) {
        this.paq = paq;
    }
    
    public DTCompra getData(){
        return new DTCompra(getFecha(),getVenc(),getCosTot(),getCant(),getTur().getNick(),getPaq().getNom());
    }
    
    
    
}
