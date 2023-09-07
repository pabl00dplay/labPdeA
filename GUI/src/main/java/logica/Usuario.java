package main.java.logica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import main.java.logica.DataTypes.DTproveedor;
import main.java.logica.DataTypes.DTturista;
 

@Entity
public class Usuario implements Serializable{
    @Id
    protected String nick;
    @Basic
    protected String nom,ape,mail;
    @Temporal(TemporalType.DATE)
    protected Date fnac;
    
    

    //proveedor
    @Basic
    private String descripcion;
    private String web;
   /* @OneToMany
    private ArrayList<Actividad> actividades =null;
   */
    
    //Turista
     @Basic
    private String nac;
   /* @OneToMany
    private List<Inscripcion> ins=null;
    @OneToMany
    private List<Compra> cmp=null;
    */
    @Basic
    private int esTurista;
    
    
    
    
    public Usuario() {
    }
    
    public Usuario(String nick, String nom, String ape, String mail,Date fnac,String nac){        
        this.nick=nick;
        this.nom=nom;
        this.ape=ape;
        this.mail=mail;
        this.fnac=fnac;
        this.nac=nac;
        this.esTurista=1;
    };

    public Usuario(String nick, String nom, String ape, String mail, Date fnac, String descripcion, String web) {
        this.nick = nick;
        this.nom = nom;
        this.ape = ape;
        this.mail = mail;
        this.fnac = fnac;
        this.descripcion = descripcion;
        this.web = web;
        this.esTurista=0;
        //actividades=new ArrayList<Actividad>();
    }
     
    public Usuario(DTturista dt){        
        this.nick=dt.getNic();
        this.nom=dt.getNom();
        this.ape=dt.getApe();
        this.mail=dt.getMail();
        this.fnac=dt.getFnac();
        this.nac=dt.getNacionalidad();
        this.esTurista=1;
    };
    public Usuario(DTproveedor dp){        
        this.nick=dp.getNic();
        this.nom=dp.getNom();
        this.ape=dp.getApe();
        this.mail=dp.getMail();
        this.fnac=dp.getFnac();
        this.descripcion = dp.getDesc();
        this.web = dp.getSitio();
        this.esTurista=0;
    };
    
    public int esTurista(){
        return this.esTurista;
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

 /*   public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setWeb(String web) {
        this.web = web;
    }
*/
  /*  public void setActs(List<Actividad> acts) {
        this.acts = acts;
    }

    public void setNac(String nac) {
        this.nac = nac;
    }

    public void setIns(List<Inscripcion> ins) {
        this.ins = ins;
    }

    public void setCmp(List<Compra> cmp) {
        this.cmp = cmp;
    }
*/
    public void setEsTurista(int esTurista) {
        this.esTurista = esTurista;
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

  /*  public String getDesc() {
        return desc;
    }

    public String getWeb() {
        return web;
    }
*/
   /* public List<Actividad> getActs() {
        return acts;
    }

    public String getNac() {
        return nac;
    }

    public List<Inscripcion> getIns() {
        return ins;
    }

    public List<Compra> getCmp() {
        return cmp;
    }
*/
    public int getEsTurista() {
        return esTurista;
    }
    
    
    
}
