package main.java.logica;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTPaquete;
import DataTypes.DTSalida;
import java.util.*;
import main.java.com.mycompany.paplicaciones.persistencia.ControladoraPersistencia;
import DataTypes.DTUsuario;
import javax.swing.JOptionPane;

public class Controller implements IController {
    ControladoraPersistencia contpersis= new  ControladoraPersistencia();
    
    //AltaActividad
    public void altaActividadTuristica(DTActividad da){
        Departamento departamento = contpersis.getDepartamento(da.getDepartamento());
        Actividad acttividad = new Actividad(da.getNombre(),da.getDescripcion(),departamento,da.getCiudad(),da.getDuracion(),da.getCostoXturista(),da.getfAlta());
        departamento.setActividades(acttividad);
        contpersis.altaActividadTuristica(acttividad);
    }
    //AltaSalida
    public void altaSalida(DTSalida dt){
        Actividad act = contpersis.getActividad(dt.getActividad());
        Salida s=new Salida(dt.getNombre(),dt.getCapacidad(),dt.getFecha(),dt.getfAlta(),dt.getLugar(),dt.getHora(),act);
        act.setSalidas(s);
        contpersis.altaSalida(s);
    }
    //Alta Usuario
    public void altaTurista(DTUsuario dt){
        Usuario t=new Usuario(dt,1);
        contpersis.altaTurista(t);
    }
    //Alta Proveedor
    public void altaProveedor(DTUsuario dp){
        Usuario p=new Usuario(dp,0);
        contpersis.altaProveedor(p);
    }
     public DTUsuario getUsuario(String nickname){
         Date fnac= new Date(2022,9,31);
         DTUsuario dt=new DTUsuario("nic","nom","ape","mail",fnac,"desc","sitio");
        return dt;
    };
    public boolean nickExiste(String nic){
        return contpersis.nicExiste(nic);
    };
    public boolean mailExiste(String correo){

        return contpersis.mailExiste(correo);
    };
    public ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> retorno=contpersis.getUsuarios();
        return retorno;
    }
    public ArrayList<String> listarsalidasinscriptasTurista(String nickname){
        ArrayList<String> retorno=contpersis.listarsalidasinscriptasTurista(nickname);
        return retorno;
    };
    public ArrayList<String> listarActividadesProveedor(String nickname){
        ArrayList<String> retorno=contpersis.listarActividadesProveedor(nickname);
        return retorno;
    }; 
    public ArrayList<String> listarsalidasProveedor(String nickname){
        ArrayList<String> retorno=contpersis.listarsalidasProveedor(nickname);
        return retorno;
    };   

    public ArrayList<DTDepartamento> getDepartamentos() {
        return contpersis.getDepartamentos();
    }
    public boolean actividadExiste(String nombreActividad){
        return contpersis.actividadExiste(nombreActividad);
    }
    public boolean existeDepartamento(String nombreDepartamento){
        return contpersis.existeDepartamento(nombreDepartamento);
    }
    public void altaDepartamento(String depto, String descripcion, String url){
        Departamento d=new Departamento(depto,descripcion,url);
        contpersis.altaDepartamento(d);
    };
    public ArrayList<DTActividad>listarActividadesDepartamento(String nombreDepartamrnto){
        return contpersis.listarActividadesDepartamento(nombreDepartamrnto);
    }
    public DTActividad getActividad(String nombreActividad){
        return contpersis.getActividad(nombreActividad).getData();
    }
    public boolean salidaExiste(String s){
        return contpersis.salidaExiste(s);
    }
    
    public  ArrayList<DTSalida> getSalidas(){
        ArrayList<Salida> salidas=contpersis.getSalidas();
        
        ArrayList<DTSalida> retorno = new ArrayList<DTSalida>(); 
        for (Salida s : salidas){
            retorno.add( s.getData());
        }
        return retorno;
    }
    public void AltaPaquete(DTPaquete dt){
            Paquete p=new Paquete(dt.getNom(),dt.getDesc(),dt.getDescu(),dt.getVal(), dt.getFalta());
            contpersis.altaPaquete(p);
        }
        public boolean existePaq(String s){
            if(contpersis.existePaq(s)){
                return true;
            }else{
                return false;
            }
        }
        
        public ArrayList<DTPaquete> listarPaquetes(){
            return contpersis.listarPaquetes();
        }
        
        public DTPaquete listarDatosPaquete(String nomPaq){
            Paquete p=contpersis.getPaquete(nomPaq);
            return new DTPaquete(p.getNom(),p.getDesc(),p.getDescu(),p.getVal(),p.getFAlta());
        }
        
        
        public ArrayList<DTActividad> listarActividadesFueraPaq(String nomPaq, String nomDpto){
            ArrayList<DTActividad> lista = listarActividadesPaquete(nomPaq);
            ArrayList<DTActividad> llave = new ArrayList<DTActividad>();
            List<Actividad> aux=contpersis.listarActividades();
            Iterator<Actividad> itr=aux.iterator();
            boolean existe;
            while(itr.hasNext()){
                existe=false;
                for(DTActividad act:lista){
                    if(act.getNombre().equals(itr.next().getNom())){
                        existe=true;
                    }
                }
                if((!existe)&&(itr.next().getDep().getNom().equals(nomDpto))){
                    llave.add(itr.next().getData());
                }
            }
            return llave;
        }
        
        public void agregarActPaq(String nomPaq, String nomAct){
            
            JOptionPane.showMessageDialog(null, "NO LLEGA");
            Paquete p=contpersis.getPaquete(nomPaq);
            Actividad a=contpersis.getActividad(nomAct);
            
            JOptionPane.showMessageDialog(null, a.getNom());
            
            JOptionPane.showMessageDialog(null, p.getNom());
            p.setAct(a);
            a.setPaquete(p);
            contpersis.agregarActPaq(p,a.getNom());
        }

        public ArrayList<DTSalida> getSalidasActividad(String nombreActividad){
        return contpersis.getSalidasActividad(nombreActividad);
        }
        
      public ArrayList<DTActividad> getActividades(){
          return contpersis.getActividades();
      }
      
    public ArrayList<DTPaquete> listarPaquetesActividad(String nombreActividad){
        Actividad a = contpersis.getActividad(nombreActividad);
        return a.getDataPaquetes();
    }
    public ArrayList<DTActividad> listarActividadesPaquete(String nomPaq){
            ArrayList<DTActividad> llave = new ArrayList<DTActividad>();
            Paquete vpaq=contpersis.getPaquete(nomPaq);
            for(Actividad vact:vpaq.getActs()){
                llave.add(vact.getData());
            }
            return llave;
        }
    public void altaInscripcion (Date fecha,int cant,int costo, String nick){
            Inscripcion i = new Inscripcion(fecha, cant, costo);
            Usuario u = contpersis.retornoUsuarioSelec(nick);
            //pasar nombre de la salida 
            //Salida s = contpersis.retornoSalidaSelec(nombre);
            //i.setSal(s);
            i.setTur(u);
            contpersis.altaInscripcion(i);
        }
    
        public Usuario retornoUsuarioSelec(String nick){
            Usuario u = contpersis.retornoUsuarioSelec(nick);
            return u;        
        }
        public void editarUsuario(Usuario u){
            contpersis.editarUsuario(u);
        }
     public ArrayList<Usuario> getTuristas() {/////////////
        ArrayList<Usuario> retorno=contpersis.retornoTuristas();
        return retorno;
    }
}
