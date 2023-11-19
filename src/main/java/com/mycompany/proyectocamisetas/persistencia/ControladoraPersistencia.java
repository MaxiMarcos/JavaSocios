
package com.mycompany.proyectocamisetas.persistencia;

import com.mycompany.proyectocamisetas.logica.Cliente;
import com.mycompany.proyectocamisetas.logica.Producto;
import java.util.List;


public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa = new ClienteJpaController();
    ProductoJpaController productoJpa = new ProductoJpaController();

    public void guardar(Cliente cliente, Producto prod) {
        
        // Crear en la BD
      clienteJpa.create(cliente);
       
       // Crear en la BD
      productoJpa.create(prod);
    }

    public List<Producto> traerProductos() {
        return productoJpa.findProductoEntities(); //Busca todos los registros de Producto y los trae a la tabla
    }
    
}
