package main.java.logica.DataTypes;

import java.time.LocalTime;
import java.util.Date;

public class DTusuario {
    String nic;
    String nom;
    String ape;
    String mail;
    Date fnac;

    public DTusuario(String nic, String nom, String ape, String mail, Date fnac) {
        this.nic = nic;
        this.nom = nom;
        this.ape = ape;
        this.mail = mail;
        this.fnac = fnac;
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
    
}
