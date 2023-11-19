
package com.mycompany.proyectocamisetas.logica;

import com.mycompany.proyectocamisetas.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia ControlPersis = new ControladoraPersistencia();

    public List<Producto> traerProductos() {
        
        return ControlPersis.traerProductos();
    }

    public void guardar(String estadoPeña, String nombre, String dni, String metodoPago, String celular, String socioCai) {
        Cliente cliente = new Cliente();
        Producto prod = new Producto();
        
        // Metodos del objeto producto
        cliente.setEstadoPeña(estadoPeña);
        cliente.setNombre(nombre);
        cliente.setDni(dni);
        cliente.setMetodoPago(metodoPago);
        cliente.setCelular(celular);
        cliente.setSocioCai(socioCai);
        
        ControlPersis.guardar(cliente, prod);
    }

    
}
