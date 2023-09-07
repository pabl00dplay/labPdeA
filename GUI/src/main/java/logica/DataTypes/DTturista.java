/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.logica.DataTypes;

import java.time.LocalTime;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class DTturista extends DTusuario {
    String nacionalidad;
    public DTturista(String nic, String nom, String ape, String mail, Date fnac,String nacionalidad){
        super(nic,nom,ape,mail,fnac);
        this.nacionalidad=nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
     
    
}
