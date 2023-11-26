package com.mycompany.proyectocamisetas.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idProd;
    @Basic
    private String categoria;
    private String producto;
    private String talle;
    
    @OneToOne
    private Cliente unCliente;
    
            
    public Producto() {
    }
    
    
    public Producto(int idProd, String categoria, String producto, String talle, Cliente unCliente) {
        this.idProd = idProd;
        this.categoria = categoria;
        this.producto = producto;
        this.talle = talle;
        this.unCliente = unCliente;
    }
    
    public int getIdProd() {
        return idProd;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getProducto() {
        return producto;
    }

    public String getTalle() {
        return talle;
    }
    
    public Cliente getUnCliente() {
        return unCliente;
    }
    
    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }
    
    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }


}

