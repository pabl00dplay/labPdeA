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
    private String pass;
    private String img;
    //Turista 1
    public DTUsuario(String nick, String nom, String ape, String mail, Date fnac,String nacionalidad,String pass,String img) {
        this.nick = nick;
        this.nom = nom;
        this.ape = ape;
        this.mail = mail;
        this.fnac = fnac;
        this.nacionalidad = nacionalidad;
        this.esTurista = 1;
        this.web = null;
        this.descripcion = null;
        this.pass=pass;
        this.img=img;
    }
    //Provedor 0
    public DTUsuario(String nick, String nom, String ape, String mail, Date fnac,String web, String descripcion,String pass,String img) {
        this.nick = nick;
        this.nom = nom;
        this.ape = ape;
        this.mail = mail;
        this.fnac = fnac;
        this.web = web;
        this.descripcion = descripcion;
        this.nacionalidad = null;
        this.esTurista = 0;
        this.pass=pass;
        this.img=img;
    }
    //Visitante 2
     public DTUsuario(String nick, String nom, String ape, String mail, Date fnac,String pass,String img) {
        this.nick = nick;
        this.nom = nom;
        this.ape = ape;System.out.println(ape);
        this.mail = mail;
        this.fnac = fnac;
        this.nacionalidad = null;
        this.esTurista = 2;
        this.web = null;
        this.descripcion = null;
        this.pass=pass;
        this.img=img;
    }

    public String getNick() {
        return nick;
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

    public String getWeb() {
        return web;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getEsTurista() {
        return esTurista;
    }

    public String getPass() {
        return pass;
    }

    public String getImg() {
        return img;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEsTurista(Integer esTurista) {
        this.esTurista = esTurista;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setImg(String img) {
        this.img = img;
    }
     

}
