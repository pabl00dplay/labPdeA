package main.java.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.java.logica.Actividad;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-07T18:46:08", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Paquete.class)
public class Paquete_ { 

    public static volatile SingularAttribute<Paquete, Date> fAlta;
    public static volatile SingularAttribute<Paquete, Float> descuento;
    public static volatile SingularAttribute<Paquete, Integer> Pvalidez;
    public static volatile SetAttribute<Paquete, Actividad> acts;
    public static volatile SingularAttribute<Paquete, String> nom;
    public static volatile SingularAttribute<Paquete, String> desc;

}