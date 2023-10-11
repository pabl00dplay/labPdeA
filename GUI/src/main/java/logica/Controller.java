package main.java.logica;

import DataTypes.DTActividad;
import DataTypes.DTDepartamento;
import DataTypes.DTPaquete;
import DataTypes.DTSalida;
import java.util.*;
import main.java.com.mycompany.paplicaciones.persistencia.ControladoraPersistencia;
import DataTypes.DTUsuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Controller implements IController {
    ControladoraPersistencia contpersis= new  ControladoraPersistencia();
    
    //AltaActividad
    public void altaActividadTuristica(DTActividad da, String nom){
        Departamento departamento = contpersis.getDepartamento(da.getDepartamento());
        Actividad actividad = new Actividad(da.getNombre(),da.getDescripcion(),departamento,da.getCiudad(),da.getDuracion(),da.getCostoXturista(),da.getfAlta());
        
        departamento.setActividades(actividad);
        contpersis.altaActividadTuristica(actividad,nom);
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
    public void altaCategoria(String categoria) {
        contpersis.altaCategoria(categoria);
    }
     public DTUsuario getUsuario(String nickname){
        DTUsuario dt = contpersis.getUsuario(nickname);
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
    public ArrayList<String> getCategorias(){
        return contpersis.getCategorias();
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
    public boolean existeCategoria(String categoria) {
        return contpersis.existeCategoria(categoria);
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
            List<Actividad> aux =contpersis.listarActividades();
            
                boolean existe;
                for(Actividad a:aux){
                    existe=false;
                    for(DTActividad act:lista){
                        if(act.getNombre().equals(a.getNom())){
                            existe=true;
                        }
                    }
                    if((!existe)&&(a.getDep().getNom().equals(nomDpto))){
                        llave.add(a.getData());
                    }
                }
            
            return llave;
        }
        
        public void agregarActPaq(String nomPaq, String nomAct){
            
            Paquete p=contpersis.getPaquete(nomPaq);
            Actividad a=contpersis.getActividad(nomAct);
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
        public Usuario retornoUsuarioSelec(String nick){
            Usuario u = contpersis.retornoUsuarioSelec(nick);
            return u;        
        }
        public void editarUsuario(Usuario u){
            contpersis.editarUsuario(u);
        }
     public ArrayList<Usuario> getTuristas() {
        ArrayList<Usuario> retorno=contpersis.retornoTuristas();
        return retorno;
    }
     public void altaInscripcion (String nombre,Date fecha,int cant,int costo, String nick){
            Inscripcion i = new Inscripcion(fecha, cant, costo);
            Usuario u = contpersis.retornoUsuarioSelec(nick);
            //pasar nombre de la salida 
            Salida s = contpersis.retornoSalidaSelec(nombre);
            int cantidadS = ((s.getMaxTuristas()) - cant );
            s.setTuristas(cantidadS);//la salida tiene un nuevo maximo disponible
            contpersis.editarSalida(s);//edito la salida con la nueva cant
            i.setSal(s);
            i.setTur(u);
            contpersis.altaInscripcion(i);
        }



public Salida retornoSalidaSel(String nombre){
            Salida s = contpersis.retornoSalidaSelec(nombre);
            return s;        
        }

  public Actividad retornoActividadSelec(String nombre){
            Actividad a = contpersis.retornoActividadSelec(nombre);
            return a;        
        }
  public boolean turiInscriptoSalida(String nick, String nombreSal){
            if (contpersis.turiExisteEnInscripcion(nick, nombreSal)){//true si ya esta registrado
                return true;
            }else {
                return false;
            }
        }

  public void aceptarAct(String nom){
      Actividad act=contpersis.getActividad(nom);
      act.setEstado(ACTAceptada.ACEPTADA);
      contpersis.editarActividad(act);
  }
  public void rechazarAct(String nom){
      Actividad act=contpersis.getActividad(nom);
      act.setEstado(ACTAceptada.RECHAZADA);
      contpersis.editarActividad(act);
  }
  
  public ArrayList<DTActividad> listarActividadesSoloAgregadas(){
      ArrayList<DTActividad> dta = new ArrayList<DTActividad>();
      ArrayList<DTActividad> aux=this.getActividades();
      for(DTActividad d:aux){
          if(d.getEstado()==ACTAceptada.AGREGADA){
              dta.add(d);
          }
      }
      
      return dta;
  }
  
  public void inicializar(){
        Departamento d;
        Usuario u = null;
        Paquete p = null;
        Actividad a = null;
        Salida s = null;
        Inscripcion i = null;
        
        //Departamento
        d=new Departamento("Canelones", "División Turismo de la Intendencia", "https://www.imcanelones.gub.uy/es");
        contpersis.altaDepartamento(d);
        d=new Departamento("Maldonado", "División Turismo de la Intendencia", "https://www.maldonado.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Rocha", "La Organización de Gestión del Destino(OGD) Rocha es un ámbito de articulación público – privada en el sector turı́stico que integran la Corporación Rochense de Turismo y la Intendencia de Rocha a través de su Dirección de Turismo.", "www.turismorocha.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Treinta y Tres", "División Turismo de la Intendencia", "https://treintaytres.gub.uy/");
        contpersis.altaDepartamento(d);
        d=new Departamento("Cerro Largo", "División Turismo de la Intendencia", "https://www.gub.uy/intendencia-cerro-largo/");
        contpersis.altaDepartamento(d);
        d=new Departamento("Rivera", "Promociona e implementa proyectos e iniciativas sostenibles de interés turı́stico con la participación institucional pública – privada en bien del desarrollo socioeconómico de la comunidad.", "www.rivera.gub.uy/social/turismo/");
        contpersis.altaDepartamento(d);
        d=new Departamento("Artigas", "División Turismo de la Intendencia", "http://www.artigas.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Salto", "División Turismo de la Intendencia", "https://www.salto.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Paysandu", "División Turismo de la Intendencia", "https://www.paysandu.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Rio Negro", "División Turismo de la Intendencia", "https://www.rionegro.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Soriano", "División Turismo de la Intendencia", "https://www.soriano.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Colonia", "La propuesta del Departamento de Colonia divide en cuatro actos su espectáculo anual. Cada acto tiene su magia. Desde su naturaleza y playas hasta sus tradiciones y el patrimonio mundial. Todo el año se disfruta.", "https://colonia.gub.uy/turismo/");
        contpersis.altaDepartamento(d);
        d=new Departamento("San Jose", "División Turismo de la Intendencia", "https://www.sanjose.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Flores", "División Turismo de la Intendencia", "https://www.flores.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Florida", "División Turismo de la Intendencia", "https://www.florida.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Lavalleja", "División Turismo de la Intendencia", "https://www.lavalleja.gub.u");
        contpersis.altaDepartamento(d);
        d=new Departamento("Durazno", "División Turismo de la Intendencia", "https://www.durazno.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Tacuarembo", "División Turismo de la Intendencia", "https://www.tacuarembo.gub.uy");
        contpersis.altaDepartamento(d);
        d=new Departamento("Montevideo", "División Turismo de la Intendencia", "https://montevideo.gub.uy/areas-tematicas/turismo");
        contpersis.altaDepartamento(d);
        
        //Usuario
        try {
            u=new Usuario("lachiqui","Rosa Maria","Martinez","mirtha.legrand.ok@hotmail.com.ar",new SimpleDateFormat("yyyy-MM-dd").parse("1927-02-23"),"argentina");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("isabelita","Elizabeth","Windsor","isabelita@thecrown.co.uk",new SimpleDateFormat("yyyy-MM-dd").parse("1926-04-21"),"inglesa");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("anibal","Anibal","Lecter","anibal@fing.edu.uy",new SimpleDateFormat("yyyy-MM-dd").parse("1937-12-31"),"lituana");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("watson","Emma","Watson","e.waston@gmail.com",new SimpleDateFormat("yyyy-MM-dd").parse("1990-04-15"),"inglesa");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("elelvis","Elvis","Lacio","suavemente@hotmail.com",new SimpleDateFormat("yyyy-MM-dd").parse("1971-07-30"),"estadounidense");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("eleven11","Eleven","Once","eleven11@gmail.com",new SimpleDateFormat("yyyy-MM-dd").parse("2004-02-19"),"espaniola");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("bobesponja","Bob","Esponja","bobesponja@nickelodeon.com",new SimpleDateFormat("yyyy-MM-dd").parse("1999-05-01"),"japonesa");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("tony","Antonio","Pacheco","eltony@manya.org.uy",new SimpleDateFormat("yyyy-MM-dd").parse("1976-04-11"),"uruguaya");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("chino","Albaro","Recoba","chino@trico.org.uy",new SimpleDateFormat("yyyy-MM-dd").parse("1976-03-17"),"uruguaya");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("mastropiero","Johann Sebastian","Mastropiero","johann.sebastian@gmail.com",new SimpleDateFormat("yyyy-MM-dd").parse("1922-02-07"),"uruguaya");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaTurista(u);
        try {
            u=new Usuario("washington","Washington","Rocha","washington@turismorocha.gub.uy",new SimpleDateFormat("yyyy-MM-dd").parse("1970-09-14"),"Hola! me llamo Washington y soy el encargado del portal de turismo del departamento de Rocha - Uruguay","http://turismorocha.gub.uy/");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaProveedor(u);
        try {
            u=new Usuario("eldiez","Pablo","Bengoechea","eldiez@socfomturriv.org.uy",new SimpleDateFormat("yyyy-MM-dd").parse("1965-06-27"),"Pablo es el presidente de la Sociedad de Fomento Turı́stico de Rivera (conocida como Socfomturriv)","http://wwww.socfomturriv.org.uy");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaProveedor(u);
        try {
            u=new Usuario("meche","Mercedes","Venn","meche@colonia.gub.uy",new SimpleDateFormat("yyyy-MM-dd").parse("1990-12-31"),"Departamento de Turismo del Departamento de Colonia","https://colonia.gub.uy/turismo/");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaProveedor(u);
        
        //Paquete
        try {
            p=new Paquete("Disfrutar Rocha","Actividades para hacer en familia y disfrutar arte y gastronomı́a",20,60,new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-10"));
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaPaquete(p);
        try {
            p=new Paquete("Un dia en Colonia","Paseos por el casco histórico y se puede terminar con Almuerzo en la Plaza de Toros",15,45,new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-01"));
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        contpersis.altaPaquete(p);
        
        //Actividades
        try {
            d=contpersis.getDepartamento("Rocha");
            a=new Actividad("Degusta","Festival gastronómico de productos locales en Rocha",d,"Rocha",3,800,new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-20"));
            a.setEstado(ACTAceptada.ACEPTADA);
            d.setActividades(a);
            contpersis.altaActividadTuristica(a,"washington");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            d=contpersis.getDepartamento("Rocha");
            a=new Actividad("Teatro con Sabores","En el mes aniversario del Club Deportivo Unión de Rocha te invitamos a una merienda deliciosa.",d,"Rocha",3,500,new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-21"));
            a.setEstado(ACTAceptada.ACEPTADA);
            d.setActividades(a);
            contpersis.altaActividadTuristica(a,"washington");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            d=contpersis.getDepartamento("Colonia");
            a=new Actividad("Tour por Colonia del Sacramento","Con guı́a especializado y en varios idiomas. Varios circuitos posibles.",d,"Colonia del Sacramento",2,400,new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-01"));
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setEstado(ACTAceptada.ACEPTADA);
        d.setActividades(a);
        contpersis.altaActividadTuristica(a,"meche");
        try {
            d=contpersis.getDepartamento("Colonia");
            a=new Actividad("Almuerzo en el Real de San Carlos","Restaurante en la renovada Plaza de Toros con menú internacional",d,"Colonia del Sacramento",2,800,new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-01"));
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setEstado(ACTAceptada.ACEPTADA);
        d.setActividades(a);
        contpersis.altaActividadTuristica(a,"eldiez");
        try {
            d=contpersis.getDepartamento("Rivera");
            a=new Actividad("Almuerzo en Valle del Lunarejo","Restaurante en la renovada Plaza de Toros con menú internacional",d,"Tranqueras",2,300,new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-01"));
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setEstado(ACTAceptada.ACEPTADA);
        d.setActividades(a);
        contpersis.altaActividadTuristica(a,"eldiez");
        try {
            d=contpersis.getDepartamento("Rivera");
            a=new Actividad("Cabalgata en Valle del Lunarejo","Cabalgata por el área protegida. Varios recorridos para elegir.",d,"Tranqueras",2,150,new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-01"));
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setEstado(ACTAceptada.ACEPTADA);
        d.setActividades(a);
        contpersis.altaActividadTuristica(a,"eldiez");
        
        try {
            //Salidas
            Actividad act = contpersis.getActividad("Degusta");
            s=new Salida("Degusta Agosto",20,new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-20"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-21"),"Sociedad Agropecuaria de Rocha","17",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            act = contpersis.getActividad("Degusta");
            s=new Salida("Degusta Setiembre",20,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-03"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-22"),"Sociedad Agropecuaria de Rocha","17",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            act = contpersis.getActividad("Teatro con Sabores");
            s=new Salida("Teatro con Sabores 1",30,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-04"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-23"),"Club Deportivo Unión","18",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            act = contpersis.getActividad("Teatro con Sabores");
            s=new Salida("Teatro con Sabores 2",30,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-11"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-07-23"),"Club Deportivo Unión","18",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            act=contpersis.getActividad("Tour por Colonia del Sacramento");
            s=new Salida("Tour Colonia del Sacramento 11-09",5,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-11"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-05"),"Encuentro en la base del Faro","10",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            s=new Salida("Tour Colonia del Sacramento 18-09",5,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-18"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-05"),"Encuentro en la base del Faro","10",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            act=contpersis.getActividad("Almuerzo en el Real de San Carlos");
            s=new Salida("Almuerzo 1",5,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-18"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-04"),"Restaurante de la Plaza de Toros","12",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            s=new Salida("Almuerzo 2",5,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-25"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-04"),"Restaurante de la Plaza de Toros","12",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            act=contpersis.getActividad("Almuerzo en Valle del Lunarejo");
            s=new Salida("Almuerzo 3",4,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-10"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-15"),"Posada Del Lunarejo","12",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            s=new Salida("Almuerzo 4",4,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-11"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-15"),"Posada Del Lunarejo","12",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            s=new Salida("Cabalgata 1",4,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-10"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-15"),"Posada Del Lunarejo","16",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
            s=new Salida("Cabalgata 2",4,new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-11"),new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-15"),"Posada Del Lunarejo","16",act);
            act.setSalidas(s);
            contpersis.altaSalida(s);
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //Paquete y Actividad
        agregarActPaq("Disfrutar Rocha","Degusta");
        agregarActPaq("Disfrutar Rocha","Teatro con Sabores");
        agregarActPaq("Un dia en Colonia","Tour por Colonia del Sacramento");
        agregarActPaq("Un dia en Colonia","Almuerzo en el Real de San Carlos");
        //Inscripcion
        try {
            altaInscripcion ("Degusta Agosto",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-15"),3,2400, "lachiqui");
            altaInscripcion ("Degusta Agosto",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-16"),5,4000, "elelvis");
            altaInscripcion ("Tour Colonia del Sacramento 18-09",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-18"),3,1200, "lachiqui");
            altaInscripcion ("Tour Colonia del Sacramento 18-09",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-19"),1,400, "isabelita");
            altaInscripcion ("Almuerzo 2",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-19"),2,1600, "mastropiero");
            altaInscripcion ("Teatro con Sabores 1",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-19"),1,500, "chino");
            altaInscripcion ("Teatro con Sabores 2",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-20"),10,5000, "chino");
            altaInscripcion ("Teatro con Sabores 2",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-20"),2,1000, "bobesponja");
            altaInscripcion ("Teatro con Sabores 2",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-21"),1,500, "anibal");
            altaInscripcion("Degusta Setiembre",new SimpleDateFormat("yyyy-MM-dd").parse("2022-08-21"),11,8800,"tony");
        } catch (ParseException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
