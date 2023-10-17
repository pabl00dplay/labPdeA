package main.java.logica;

import DataTypes.DTUsuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
 

@Entity
public class Usuario implements Serializable{
    @Id
    protected String nick;
    @Basic
    protected String nom,ape,mail;
    @Temporal(TemporalType.DATE)
    protected Date fnac;
    @OneToMany
    
    
    
    

    //proveedor
    @Basic
    private String descripcion;
    private String web;
    @OneToMany
    private List<Actividad> actividades =null;
   
    
    //Turista
     @Basic
    private String nac;
    @OneToMany
    private List<Inscripcion> ins=null;
    
    @Basic
    private Integer esTurista; 
    private String pass;
    
    //Compras
    @OneToMany
    private List<Compra> compras=null;
    
    
    public Usuario() {
    }
    
    public Usuario(String nick, String nom, String ape, String mail,Date fnac,String nac,String pass){        
        this.nick=nick;
        this.nom=nom;
        this.ape=ape;
        this.mail=mail;
        this.fnac=fnac;
        this.nac=nac;
        this.esTurista=1;
    };

    public Usuario(String nick, String nom, String ape, String mail, Date fnac, String descripcion, String web,String pass) {
        this.nick = nick;
        this.nom = nom;
        this.ape = ape;
        this.mail = mail;
        this.fnac = fnac;
        this.descripcion = descripcion;
        this.web = web;
        this.esTurista=0;
        this.actividades=new ArrayList<Actividad>();
    }
     
    public Usuario(DTUsuario dt,Integer esTurista){   
        if(esTurista == 0)
        {
            this.nick=dt.getNick();
            this.nom=dt.getNom();
            this.ape=dt.getApe();
            this.mail=dt.getMail();
            this.fnac=dt.getFnac();
            this.descripcion = dt.getDescripcion();
            this.web = dt.getWeb();
            this.esTurista=0; 
            this.pass=dt.getPass(); 
        }else{
            this.nick=dt.getNick();
            this.nom=dt.getNom();
            this.ape=dt.getApe();
            this.mail=dt.getMail();
            this.fnac=dt.getFnac();
            this.nac=dt.getNacionalidad();
            this.esTurista=1;
            this.pass=dt.getPass();
        }
    };
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
    
    public void setIns(ArrayList<Inscripcion> ins) {
        this.ins = ins;
    }

    public List<Inscripcion> getIns() {
        return ins;
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

    public String getDescripcion() {
        return descripcion;
    }

    public String getWeb() {
        return web;
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public String getNac() {
        return nac;
    }


    public int getEsTurista() {
        return esTurista;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void setActividad(Actividad actividad) {
        this.actividades.add(actividad);
    }

    public void setNac(String nac) {
        this.nac = nac;
    }

  
    public void setEsTurista(int esTurista) {
        this.esTurista = esTurista;
    }


    public void setActividades(List<Actividad> actividades) {
        this.actividades = actividades;
    }

    public void setIns(List<Inscripcion> ins) {
        this.ins = ins;
    }


    
    
    
}