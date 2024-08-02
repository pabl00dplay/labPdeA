package main.java.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.java.logica.Salida;
import main.java.logica.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-31T16:26:40", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Inscripcion.class)
public class Inscripcion_ { 

    public static volatile SingularAttribute<Inscripcion, Usuario> tur;
    public static volatile SingularAttribute<Inscripcion, Date> fecha;
    public static volatile SingularAttribute<Inscripcion, Integer> costo;
    public static volatile SingularAttribute<Inscripcion, Integer> cant;
    public static volatile SingularAttribute<Inscripcion, Integer> id;
    public static volatile SingularAttribute<Inscripcion, Salida> sal;

}