
package com.mycompany.proyectocamisetas.logica;

import com.mycompany.proyectocamisetas.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia ControlPersis = new ControladoraPersistencia();

    public List<Cliente> traerClientes() {
        
        return ControlPersis.traerClientes();
    }

    public void guardar(String estadoPeña, String nombre, String dni, String metodoPago, String celular, String socioCai) {
        Cliente cliente = new Cliente();
        
        // Metodos del objeto producto
        cliente.setEstadoPeña(estadoPeña);
        cliente.setNombre(nombre);
        cliente.setDni(dni);
        cliente.setMetodoPago(metodoPago);
        cliente.setCelular(celular);
        cliente.setSocioCai(socioCai);
        
        ControlPersis.guardar(cliente);
    }

    public void borrarCliente(int num_cliente) {
        
        ControlPersis.borrarCliente(num_cliente);
    }

    public Cliente traerSocio(int num_cliente) {
         
       return ControlPersis.traerSocio(num_cliente);

    }

    public void guardarModificar(Cliente socio, String estadoPeña, String nombre, String dni, String metodoPago, String celular, String socioCai) {
        
        socio.setEstadoPeña(estadoPeña);
        socio.setNombre(nombre);
        socio.setDni(dni);
        socio.setMetodoPago(metodoPago);
        socio.setCelular(celular);
        socio.setSocioCai(socioCai);
        
        ControlPersis.guardarModificar(socio);
    }

    /* 

    public List<Cliente> traerSocioDni() {
        
        return ControlPersis.traerSocioDni();
    } */
  
}
