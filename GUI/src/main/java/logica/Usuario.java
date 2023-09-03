package main.java.logica;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario implements Serializable {
    @Id
    protected String nick;
    @Basic
    protected String  nom,ape,mail;
    protected Date fnac;

    public Usuario() {
    }
    
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
