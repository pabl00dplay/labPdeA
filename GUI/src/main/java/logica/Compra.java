/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;


import java.time.*;
import javax.persistence.*;

/**
 *
 * @author francisco
 */
@Entity
public class Compra {
    
    private LocalDate fecha,venc;
    private int cosTot,cant;
    private Turista tur;
    private Paquete paq;
    
}
