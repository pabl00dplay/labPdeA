/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import java.util.HashSet;

/**
 *
 * @author francisco
 */
public class Turista extends Usuario{
    private String nac;
    private HashSet<Inscripcion> ins;
    private HashSet<Compra> cmp;
    
    public Turista(String nic, String nom, String ape, String mail, String nacio){
        super(nic,nom,ape,mail);
        this.nac=nacio;
    }
    
    public String getNac(){
        return nac;
    }
    
    public void setNac(String s){
        this.nac=s;
    }
    
}
