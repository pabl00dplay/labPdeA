package main.java.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.java.logica.Actividad;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-20T05:51:20", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Departamento.class)
public class Departamento_ { 

    public static volatile SingularAttribute<Departamento, String> descripcion;
    public static volatile ListAttribute<Departamento, Actividad> actividades;
    public static volatile SingularAttribute<Departamento, String> nom;
    public static volatile SingularAttribute<Departamento, String> url;

}