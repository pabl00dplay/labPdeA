package main.java.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.java.logica.Actividad;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-11T21:34:31", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Salida.class)
public class Salida_ { 

    public static volatile SingularAttribute<Salida, Integer> dur;
    public static volatile SingularAttribute<Salida, Date> fecha;
    public static volatile SingularAttribute<Salida, Date> fAlta;
    public static volatile SingularAttribute<Salida, Actividad> act;
    public static volatile SingularAttribute<Salida, String> lugar;
    public static volatile SingularAttribute<Salida, String> nom;
    public static volatile SingularAttribute<Salida, Integer> maxTuris;

}