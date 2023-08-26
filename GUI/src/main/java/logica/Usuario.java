/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.lang.String;
 

/**
 *
 * @author francisco
 */
public class Usuario {
    protected String nick,nom,ape,mail;
    
    public Usuario(String a, String b, String c, String d){
        this.nick=a;
        this.nom=b;
        this.ape=c;
        this.mail=d;
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
