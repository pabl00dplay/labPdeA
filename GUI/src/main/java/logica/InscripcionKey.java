/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author pablo
 */
public class InscripcionKey implements Serializable {
    private LocalDate fecha;
    private Turista turista;
    private Salida salida;

    public LocalDate getFecha() {
        return fecha;
    }

    public Turista getTurista() {
        return turista;
    }

    public Salida getSalida() {
        return salida;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTurista(Turista turista) {
        this.turista = turista;
    }

    public void setSalida(Salida salida) {
        this.salida = salida;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.fecha);
        hash = 97 * hash + Objects.hashCode(this.turista);
        hash = 97 * hash + Objects.hashCode(this.salida);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InscripcionKey other = (InscripcionKey) obj;
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.turista, other.turista)) {
            return false;
        }
        return Objects.equals(this.salida, other.salida);
    }
    
   

}