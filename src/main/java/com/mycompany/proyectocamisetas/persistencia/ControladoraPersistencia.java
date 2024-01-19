
package com.mycompany.proyectocamisetas.persistencia;

import com.mycompany.proyectocamisetas.logica.Cliente;
import com.mycompany.proyectocamisetas.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    ClienteJpaController clienteJpa = new ClienteJpaController();

    public void guardar(Cliente cliente) {
        
        // Crear en la BD
      clienteJpa.create(cliente);
      
    }

    public List<Cliente> traerClientes() {
        return clienteJpa.findClienteEntities(); //Busca todos los registros de Cliente y los trae a la tabla
    }

    public void borrarCliente(int num_cliente) {
        
        try {
            clienteJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traerSocio(int num_cliente) {
        
        return clienteJpa.findCliente(num_cliente);
    }

    public void guardarModificar(Cliente socio) {
        
        try {
            clienteJpa.edit(socio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
     public List<Cliente> traerSocioDni() {
        return clienteJpa.findClienteEntities();
    } */
    
}
