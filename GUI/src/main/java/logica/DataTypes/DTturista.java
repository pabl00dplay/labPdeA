/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica.DataTypes;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class DTturista {
    String nic;
    String nom;
    String ape;
    String mail;
    Date fnac;
    String nacionalidad;
    public DTturista(String nic, String nom, String ape, String mail, Date fnac,String nacionalidad){
        this.nic=nic;
        this.nom=nom;
        this.ape=ape;
        this.mail=mail;
        this.fnac=fnac;
        this.nacionalidad=nacionalidad;
    }

    public String getNic() {
        return nic;
    }

    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public String getMail() {
        return mail;
    }

    public Date getFnac() {
        return fnac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
     
    
}
