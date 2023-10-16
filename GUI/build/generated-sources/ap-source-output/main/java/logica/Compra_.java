package main.java.logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import main.java.logica.Paquete;
import main.java.logica.Usuario;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-16T17:13:11", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Usuario> tur;
    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile SingularAttribute<Compra, Paquete> paq;
    public static volatile SingularAttribute<Compra, Date> venc;
    public static volatile SingularAttribute<Compra, Integer> cosTotal;
    public static volatile SingularAttribute<Compra, Integer> cantidadTuristas;
    public static volatile SingularAttribute<Compra, Integer> id;

}