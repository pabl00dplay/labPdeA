package main.java.logica;



import java.util.ArrayList;
import main.java.logica.DataTypes.DTPaquete;
import java.util.HashMap;
import main.java.logica.DataTypes.DTproveedor;
import main.java.logica.DataTypes.DTturista;
import main.java.logica.DataTypes.DTusuario;

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
    public abstract void altaProveedor(DTproveedor dp);
    public abstract boolean nickExiste(String nombre);
    public abstract boolean mailExiste(String correo);
    public abstract ArrayList<Usuario> getUsuarios();
    public abstract DTusuario getUsuario(String nickname);
    public abstract ArrayList<String> listarsalidasinscriptasTurista(String nickname);
    public abstract ArrayList<String> listarActividadesProveedor(String nickname); 
    public abstract ArrayList<String> listarsalidasProveedor(String nickname);   
}
