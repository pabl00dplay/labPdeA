package main.java.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.java.logica.Departamento;
import main.java.logica.Paquete;
import main.java.logica.Salida;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-16T16:07:26", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Actividad.class)
public class Actividad_ { 

    public static volatile SingularAttribute<Actividad, String> descripcion;
    public static volatile SingularAttribute<Actividad, Integer> dur;
    public static volatile SingularAttribute<Actividad, Date> fAlta;
    public static volatile SingularAttribute<Actividad, Integer> costo;
    public static volatile SingularAttribute<Actividad, String> ciudad;
    public static volatile ListAttribute<Actividad, Paquete> paquetes;
    public static volatile SingularAttribute<Actividad, String> nom;
    public static volatile SingularAttribute<Actividad, Departamento> dep;
    public static volatile ListAttribute<Actividad, Salida> salidas;

}