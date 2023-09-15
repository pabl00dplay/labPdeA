package main.java.logica;



import DataTypes.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author francisco
 */
public interface IController {
    public abstract HashMap<String, Usuario> getUsr();
    public abstract HashMap<String, Actividad> getAct();
    public abstract HashMap<String, Paquete> getPaq();
    public abstract HashMap<String, Departamento> getDep();
    
    /**
     *
     * @param dt
     */
    
    
    public abstract void AltaPaquete(DTPaquete dt);
    public abstract boolean existePaq(String s);
    
    public abstract void altaActividadTuristica(DTActividad da);
    public abstract void altaTurista(DTUsuario dt);
    public abstract void altaProveedor(DTUsuario dp);
    public abstract boolean nickExiste(String nombre);
    public abstract boolean mailExiste(String correo);
    public abstract boolean existeDepartamento(String nombreDepartamento);
    public abstract boolean actividadExiste(String nombreActividad);
    public abstract ArrayList<Usuario> getUsuarios();
    public abstract ArrayList<Departamento> getDepartamentos();
    public abstract DTUsuario getUsuario(String nickname);
    public abstract void altaSalida(DTSalida dt);
    public abstract DTActividad getActividad(String nombreActividad);
    public abstract ArrayList<String> listarsalidasinscriptasTurista(String nickname);
    public abstract ArrayList<String> listarActividadesProveedor(String nickname); 
    public abstract ArrayList<String> listarsalidasProveedor(String nickname);   
    public abstract void altaDepartamento(String depto, String descripcion, String url);
    public abstract ArrayList<DTActividad>listarActividadesDepartamento(String nombreDepartamento);

    public abstract boolean salidaExiste(String nombre);

    public abstract ArrayList<DTSalida> getSalidas();
}
