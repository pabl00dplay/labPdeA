package main.java.logica.DataTypes;

import java.time.LocalTime;
import java.util.Date;
public class DTproveedor extends DTusuario{
    String desc;
    String sitio;
    public DTproveedor(String nic, String nom, String ape, String mail,Date fnac, String desc, String sitio){
        super(nic,nom,ape,mail,fnac);
        this.desc=desc;
        this.sitio=sitio;
    } 

    public String getDesc() {
        return desc;
    }

    public String getSitio() {
        return sitio;
    }

}
