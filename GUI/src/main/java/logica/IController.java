package main.java.logica;



import DataTypes.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author francisco
 */
public interface IController {
    
    public abstract void AltaPaquete(DTPaquete dt);
    public abstract boolean existePaq(String s);
    
    public abstract void altaActividadTuristica(DTActividad da, String nom);
    public abstract void altaTurista(DTUsuario dt);
    public abstract void altaProveedor(DTUsuario dp);
    public abstract boolean nickExiste(String nombre);
    public abstract boolean mailExiste(String correo);
    public abstract boolean existeDepartamento(String nombreDepartamento);
    public abstract boolean actividadExiste(String nombreActividad);
    public abstract ArrayList<Usuario> getUsuarios();
    public abstract ArrayList<DTDepartamento> getDepartamentos();
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
    public abstract ArrayList<DTSalida> getSalidasActividad(String nombreActividad);
    public abstract ArrayList<DTPaquete> listarPaquetes();
    public abstract DTPaquete listarDatosPaquete(String nomPaq);
    public abstract ArrayList<DTActividad> listarActividadesFueraPaq(String nomPaq, String nomDpto);
    public abstract void agregarActPaq(String nomPaq, String nomAct);
    public abstract ArrayList<DTActividad> getActividades();
    public abstract ArrayList<DTPaquete> listarPaquetesActividad(String nombreActividad);
    public abstract ArrayList<DTActividad> listarActividadesPaquete(String nomPaq);
    public void altaInscripcion (String nombre,Date fecha,int cant,int costo, String nick);
    public Usuario retornoUsuarioSelec(String nick);
    public void editarUsuario(Usuario u);
    public ArrayList<Usuario> getTuristas();
    
}
