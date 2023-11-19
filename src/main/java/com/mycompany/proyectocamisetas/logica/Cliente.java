
package com.mycompany.proyectocamisetas.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String estadoPeña;
    private String nombre;
    private String dni;
    private String metodoPago;
    private String celular;
    private String socioCai;

    
    public Cliente() {
    }

    public Cliente(int id, String estadoPeña, String nombre, String dni, String metodoPago, String celular, String socioCai) {
        this.id = id;
        this.estadoPeña = estadoPeña;
        this.nombre = nombre;
        this.dni = dni;
        this.metodoPago = metodoPago;
        this.celular = celular;
        this.socioCai = socioCai;
    }
    
    

    public int getId() {
        return id;
    }

    public String getEstadoPeña() {
        return estadoPeña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getCelular() {
        return celular;
    }

    public String getSocioCai() {
        return socioCai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstadoPeña(String estadoPeña) {
        this.estadoPeña = estadoPeña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setSocioCai(String socioCai) {
        this.socioCai = socioCai;
    }
    
    

   

   
}
