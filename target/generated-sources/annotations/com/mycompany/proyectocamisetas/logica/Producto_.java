package com.mycompany.proyectocamisetas.logica;

import com.mycompany.proyectocamisetas.logica.Cliente;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-19T10:01:26", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Integer> idProd;
    public static volatile SingularAttribute<Producto, String> categoria;
    public static volatile SingularAttribute<Producto, String> talle;
    public static volatile SingularAttribute<Producto, String> producto;
    public static volatile SingularAttribute<Producto, Cliente> unCliente;

}