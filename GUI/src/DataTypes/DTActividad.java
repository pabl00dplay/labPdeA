
package DataTypes;

import java.time.LocalDate;

public class DTActividad {
    private String nombre;
    private String descripcion;
    private Integer duracion;
    private Integer costoXturista;
    private String ciudad;
    private LocalDate fAlta;

    public DTActividad(String nombre, String descripcion, Integer duracion, Integer costoXturista, String ciudad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.costoXturista = costoXturista;
        this.ciudad = ciudad;
        this.fAlta = fAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getCostoXturista() {
        return costoXturista;
    }

    public String getCiudad() {
        return ciudad;
    }

    public LocalDate getfAlta() {
        return fAlta;
    }
    
    
}
