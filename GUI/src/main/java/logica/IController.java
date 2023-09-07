
package main.java.logica;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import DataTypes.DTActividad;
import DataTypes.DTProveedor;
import java.time.LocalDate;
import java.util.Set;


public interface IController {
    public abstract HashMap<String, Usuario> getUsr();
    public abstract HashMap<String, Actividad> getAct();
    public abstract HashMap<String, Paquete> getPaq();
    public abstract HashMap<String, Departamento> getDep();
    
    public abstract void AltaPaquete(DTPaquete dt);
    public abstract boolean existePaq(String s);
    public abstract String[] listarPaquetes();
    public abstract DTPaquete listarDatosPaquete(String nomPaq);
    public abstract HashSet<String> listarActividadespaquete(String nomPaq);
    public abstract HashSet<String> listarActividadesFueraPaq(String nomPaq, String nomDpto);
    public abstract void agregarActPaq(String nomPaq, String nomAct);
    
    public abstract void altaDepto(Departamento nuevoDepto);
    public abstract boolean existeDepto(String nombre);

    public abstract HashMap<String,DTProveedor> listarProveedores();
    public abstract void AltaActividadTuristica(String nombreProveedor,String nombreActividad,String descripcion,Integer duracion,Integer costo,String ciudad,LocalDate fAlta, Departamento depto);
    public abstract DTActividad listarDatosActividad(String nombreActividad);
    public abstract Set<String> listarDepartamentos();
    public abstract Boolean nombreActividadExiste(String nombre);
}
