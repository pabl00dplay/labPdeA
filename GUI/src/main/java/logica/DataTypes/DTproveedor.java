/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica.DataTypes;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class DTproveedor {
    String nic;
    String nom;
    String ape;
    String mail;
    Date fnac;
    String desc;
    String sitio;
    public DTproveedor(String nic, String nom, String ape, String mail,Date fnac, String desc, String sitio){
        this.nic=nic;
        this.nom=nom;
        this.ape=ape;
        this.mail=mail;
        this.fnac=fnac;
        this.desc=desc;
        this.sitio=sitio;
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

    public String getDesc() {
        return desc;
    }

    public String getSitio() {
        return sitio;
    }

    public Date getFnac() {
        return fnac;
    }
    
}
