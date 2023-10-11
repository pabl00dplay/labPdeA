package main.java.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.java.logica.Actividad;
import main.java.logica.Compra;
import main.java.logica.Inscripcion;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-11T18:11:49", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> nick;
    public static volatile SingularAttribute<Usuario, String> descripcion;
    public static volatile SingularAttribute<Usuario, String> nac;
    public static volatile ListAttribute<Usuario, Compra> compras;
    public static volatile SingularAttribute<Usuario, String> mail;
    public static volatile SingularAttribute<Usuario, String> web;
    public static volatile SingularAttribute<Usuario, String> ape;
    public static volatile SingularAttribute<Usuario, Date> fnac;
    public static volatile SingularAttribute<Usuario, Integer> esTurista;
    public static volatile ListAttribute<Usuario, Actividad> actividades;
    public static volatile SingularAttribute<Usuario, String> nom;
    public static volatile ListAttribute<Usuario, Inscripcion> ins;

}