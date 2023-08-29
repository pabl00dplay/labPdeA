package main.java.logica;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author francisco
 */
public class Proveedor extends Usuario {
    private String desc,web;
    private HashSet<Actividad> acts;
    
    public Proveedor(String nic, String nom, String ape, String mail, Date fnac,String desc, String sitio){
        super(nic,nom,ape,mail,fnac);
        this.desc=desc;
        this.web=sitio;
        this.acts=new HashSet<Actividad>();
    }

    public String getDesc() {
        return desc;
    }

    public String getWeb() {
        return web;
    }

    public HashSet<Actividad> getActs() {
        return acts;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public void setActs(HashSet<Actividad> acts) {
        this.acts = acts;
    }

    
  
}
