package main.java.logica;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author francisco
 */
public class Turista extends Usuario{
    private String nac;
    private HashSet<Inscripcion> ins;
    private HashSet<Compra> cmp;
    
    public Turista(String nic, String nom, String ape, String mail,Date fnac, String nacio){
        super(nic,nom,ape,mail,fnac);
        this.nac=nacio;
    }

    public String getNac() {
        return nac;
    }

    public HashSet<Inscripcion> getIns() {
        return ins;
    }

    public HashSet<Compra> getCmp() {
        return cmp;
    }


    public void setNac(String nac) {
        this.nac = nac;
    }

    public void setIns(HashSet<Inscripcion> ins) {
        this.ins = ins;
    }

    public void setCmp(HashSet<Compra> cmp) {
        this.cmp = cmp;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

    
    
    
}
