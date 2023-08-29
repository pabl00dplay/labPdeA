/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica;

import java.lang.String;
import java.util.Date;
 

/**
 *
 * @author francisco
 */
public class Usuario {
    protected String nick,nom,ape,mail;
    protected Date fnac;
    
    public Usuario(String nick, String nom, String ape, String mail,Date fnac){
        this.nick=nick;
        this.nom=nom;
        this.ape=ape;
        this.mail=mail;
        this.fnac=fnac;
    }
    //getters
    public String getNick(){
        return nick;
    }
    public String getNom(){
        return nom;
    }
    public String getApe(){
        return ape;
    }
    public String getMail(){
        return mail;
    }

    public Date getFnac() {
        return fnac;
    }
    
    //setters
    public void setNick(String s){
        nick = s;
    }
    public void setNom(String s){
        nom = s;
    }
    public void setApe(String s){
       ape = s;
    }
    public void setMail(String s){
        mail = s;
    }
}
