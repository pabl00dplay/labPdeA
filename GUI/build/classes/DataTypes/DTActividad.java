
package DataTypes;

import java.util.Date;
import main.java.logica.ACTAceptada;
import main.java.logica.Categoria;

public class DTActividad {
    private String nombre;
    private String descripcion;
    private String ciudad;
    private String departamento;
    private Integer duracion;
    private Integer costoXturista;
    private Date fAlta;
    private ACTAceptada estado;
    private Categoria cat;

    public DTActividad(String nombre, String descripcion,String departamento, Integer duracion, Integer costoXturista, String ciudad, Date fAlta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.departamento=departamento;
        this.duracion = duracion;
        this.costoXturista = costoXturista;
        this.ciudad = ciudad;
        this.fAlta = fAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getCostoXturista() {
        return costoXturista;
    }

    public void setCostoXturista(Integer costoXturista) {
        this.costoXturista = costoXturista;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getfAlta() {
        return fAlta;
    }

    public void setfAlta(Date fAlta) {
        this.fAlta = fAlta;
    }
    public DTActividad() {
    }
    
    public void setEstado(ACTAceptada est){
        estado=est;
    }
    
    public ACTAceptada getEstado(){
        return estado;
    }

    public Categoria getCat() {
        return cat;
    }

    public void setCat(Categoria cat) {
        this.cat = cat;
    }
    
    
}
