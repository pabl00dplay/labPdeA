package DataTypes;

import java.util.Date;

public class DTUsuario {
    
    private String nick;
    private String nom;
    private String ape;
    private String mail;
    private Date fnac;
    private String nacionalidad;
    private String web;
    private String descripcion;
    private Integer esTurista;
    
    public DTUsuario(String nick, String nom, String ape, String mail, Date fnac,String nacionalidad) {
        this.nick = nick;
        this.nom = nom;
        this.ape = ape;
        this.mail = mail;
        this.fnac = fnac;
        this.nacionalidad = nacionalidad;
        this.esTurista = 1;
        this.web = null;
        this.descripcion = null;
    }
    public DTUsuario(String nick, String nom, String ape, String mail, Date fnac,String web, String descripcion) {
        this.nick = nick;
        this.nom = nom;
        this.ape = ape;
        this.mail = mail;
        this.fnac = fnac;
        this.web = web;
        this.descripcion = descripcion;
        this.nacionalidad = null;
        this.esTurista = 0;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getFnac() {
        return fnac;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEsTurista() {
        return esTurista;
    }

    public void setEsTurista(Integer esTurista) {
        this.esTurista = esTurista;
    }

    
}
