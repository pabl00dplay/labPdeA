/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;


import java.time.*;

/**
 *
 * @author francisco
 */
public class Inscripcion {
    private LocalDate fecha;
    private int cant,costo;
    private Turista tur;
    private Salida sal;
    
    public Inscripcion(LocalDate fecha, int cant, int costo, Turista tur, Salida sal){
        this.fecha=fecha;
        this.cant=cant;
        this.costo=costo;
        this.tur=tur;
        this.sal=sal;
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
    public Turista getTur(){
        return tur;
    }
    public Salida getSal(){
        return sal;
    }
}


