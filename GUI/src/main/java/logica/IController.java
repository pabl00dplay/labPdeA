/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main.java.logica;



import main.java.logica.DataTypes.DTPaquete;
import java.util.HashMap;
import main.java.logica.DataTypes.DTproveedor;
import main.java.logica.DataTypes.DTturista;

/**
 *
 * @author francisco
 */
public interface IController {
    public abstract HashMap<String, Usuario> getUsr();
    public abstract HashMap<String, Actividad> getAct();
    public abstract HashMap<String, Paquete> getPaq();
    public abstract HashMap<String, Departamento> getDep();
    
    public abstract void AltaPaquete(DTPaquete dt);
    public abstract boolean existePaq(String s);
    public abstract void altaTurista(DTturista dt);
    public abstract void altaProveedor(DTproveedor dt);
    public abstract boolean nickExiste(String nombre);
    public abstract boolean mailExiste(String correo);
    
}
