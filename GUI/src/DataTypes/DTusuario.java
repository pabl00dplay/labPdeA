package DataTypes;

import java.time.LocalTime;
import java.util.Date;

public class DTusuario {
    String nic;
    String nom;
    String ape;
    String mail;
    Date fnac;
    String descripcion;
    String web;
    String nac;
    int esTurista;

    public DTusuario(String nic, String nom, String ape, String mail, Date fnac, String nac, int esTurista) {
        this.nic = nic;
        this.nom = nom;
        this.ape = ape;
        this.mail = mail;
        this.fnac = fnac;
        this.descripcion = descripcion;
        this.web = web;
        this.nac = nac;
        this.esTurista = esTurista;
    }
    public DTusuario(String nic, String nom, String ape, String mail, Date fnac, String descripcion, String web, int esTurista) {
        this.nic = nic;
        this.nom = nom;
        this.ape = ape;
        this.mail = mail;
        this.fnac = fnac;
        this.descripcion = descripcion;
        this.web = web;
        this.nac = nac;
        this.esTurista = esTurista;
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

    public String getDescripcion() {
        return descripcion;
    }

    public String getWeb() {
        return web;
    }

    public String getNac() {
        return nac;
    }

    public int getEsTurista() {
        return esTurista;
    }

   
    
}
